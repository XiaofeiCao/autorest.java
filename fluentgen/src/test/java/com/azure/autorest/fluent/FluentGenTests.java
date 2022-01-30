// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent;

import com.azure.autorest.extension.base.model.codemodel.CodeModel;
import com.azure.autorest.extension.base.model.codemodel.ScenarioStep;
import com.azure.autorest.extension.base.model.codemodel.TestScenario;
import com.azure.autorest.fluent.mapper.ExampleParser;
import com.azure.autorest.fluent.model.clientmodel.*;
import com.azure.autorest.fluent.model.clientmodel.examplemodel.FluentCollectionMethodExample;
import com.azure.autorest.fluent.model.clientmodel.examplemodel.FluentResourceCreateExample;
import com.azure.autorest.fluent.model.clientmodel.examplemodel.FluentResourceUpdateExample;
import com.azure.autorest.fluent.model.clientmodel.fluentmodel.create.ResourceCreate;
import com.azure.autorest.fluent.model.clientmodel.fluentmodel.method.FluentCreateMethod;
import com.azure.autorest.fluent.model.clientmodel.fluentmodel.update.ResourceUpdate;
import com.azure.autorest.fluent.model.javamodel.FluentJavaPackage;
import com.azure.autorest.fluent.template.FluentExampleTemplate;
import com.azure.autorest.fluent.util.FluentUtils;
import com.azure.autorest.mapper.Mappers;
import com.azure.autorest.model.clientmodel.Client;
import com.azure.autorest.model.clientmodel.ProxyMethodExample;
import com.azure.autorest.util.CodeNamer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FluentGenTests {

    private static FluentGenAccessor fluentgenAccessor;

    @BeforeAll
    public static void ensurePlugin() {
        FluentGen fluentgen = new TestUtils.MockFluentGen();
        fluentgenAccessor = new FluentGenAccessor(fluentgen);
    }

    @Test
    @Disabled("no validation")
    public void testProcess() {
        CodeModel codeModel = TestUtils.loadCodeModel(fluentgenAccessor, "code-model-fluentnamer-signalr.yaml");
        Client client = FluentStatic.getClient();
        FluentJavaPackage javaPackage = fluentgenAccessor.handleTemplate(client);
        FluentClient fluentClient = fluentgenAccessor.handleFluentLite(codeModel, client, javaPackage);
    }

    @Test
    public void exampleParseTest() {
        CodeModel codeModel = TestUtils.loadCodeModel(fluentgenAccessor, "code-model-fluentnamer-signalr.yaml");
        Client client = FluentStatic.getClient();
        FluentJavaPackage javaPackage = fluentgenAccessor.handleTemplate(client);
        FluentClient fluentClient = fluentgenAccessor.handleFluentLite(codeModel, client, javaPackage);

        TestScenario scenario = codeModel.getTestModel().getScenarioTests().iterator().next().getScenarios().iterator().next();
        //turn each step into an example
        List<Object> xmsExamples = scenario.getResolvedSteps().stream().map(new Function<ScenarioStep, Object>() {
            @Override
            public Object apply(ScenarioStep scenarioStep) {
                Map<String, Object> example = new HashMap<>();
                example.put("parameters", scenarioStep.getRequestParameters());
                example.put("operationId", scenarioStep.getOperationId());
                return example;
            }
        }).collect(Collectors.toList());

        List<ProxyMethodExample> methodExamples = xmsExamples.stream().map(example -> Mappers.getProxyMethodExampleMapper().map(example)).collect(Collectors.toList());
        Map<String, ProxyMethodExample> exampleMap = methodExamples.stream().collect(Collectors.toMap(proxyMethodExample -> proxyMethodExample.getParameters().get("operationId").getObjectValue().toString(), Function.identity()));
        exampleMap.forEach(new BiConsumer<String, ProxyMethodExample>() {
            @Override
            public void accept(String s, ProxyMethodExample proxyMethodExample) {
                String[] strs = s.split("_");

                String operationGroup = strs[0];
                String operation = strs[1];
                FluentResourceCollection resourceCollection = fluentClient.getResourceCollections().stream().filter(collection -> collection.getInterfaceType().getName().equalsIgnoreCase(CodeNamer.getPlural(operationGroup))).findFirst().get();
                // match collectionMethod
                Optional<FluentCollectionMethod> method = resourceCollection.getMethodsForTemplate().stream().filter(m -> operation.equalsIgnoreCase(m.getMethodName())).findFirst();
                if (method.isPresent()) {
                    FluentCollectionMethod collectionMethod = method.get();
                    System.out.println(collectionMethod.getMethodName());
                    FluentCollectionMethodExample collectionMethodExample = ExampleParser.parseMethodExample(resourceCollection, collectionMethod, proxyMethodExample);
                    System.out.println(collectionMethodExample.getMethodName());
                    FluentExample fluentExample = new FluentExample("testg", "testm", null);
                    fluentExample.getCollectionMethodExamples().add(collectionMethodExample);
                    javaPackage.addSample(fluentExample);
                } else { // match resourceCreate
                    Optional<ResourceCreate> createMethod = resourceCollection.getResourceCreates().stream().filter(rc -> !FluentUtils.exampleIsUpdate(rc.getMethodName()) && rc.getMethodName().equalsIgnoreCase(operation)).findFirst();
                    if (createMethod.isPresent()) {
                        ResourceCreate create = createMethod.get();
                        FluentResourceCreateExample createExample = ExampleParser.parseResourceCreate(resourceCollection, create, proxyMethodExample);
                        FluentExample fluentExample = new FluentExample("testg", "testm", null);
                        fluentExample.getResourceCreateExamples().add(createExample);
                        javaPackage.addSample(fluentExample);
                    } else { // match resourceUpdate
                        Optional<ResourceUpdate> updateMethod = resourceCollection.getResourceUpdates().stream().filter(rc -> FluentUtils.exampleIsUpdate(rc.getMethodName()) && rc.getMethodName().equalsIgnoreCase(operation)).findFirst();
                        ResourceUpdate update = updateMethod.get();
                        FluentResourceUpdateExample updateExample = ExampleParser.parseResourceUpdate(resourceCollection, update, proxyMethodExample);
                        FluentExample fluentExample = new FluentExample("testg", "testm", null);
                        fluentExample.getResourceUpdateExamples().add(updateExample);
                        javaPackage.addSample(fluentExample);
                    }
                }


            }
        });
    }

}
