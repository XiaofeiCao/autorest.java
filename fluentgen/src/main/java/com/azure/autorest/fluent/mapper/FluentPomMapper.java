// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.mapper;

import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.fluent.model.projectmodel.FluentProject;
import com.azure.autorest.mapper.PomMapper;
import com.azure.autorest.model.clientmodel.Pom;
import com.azure.autorest.model.projectmodel.Project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FluentPomMapper extends PomMapper {

    public Pom map(FluentProject project) {
        Pom pom = new Pom();
        pom.setGroupId(project.getGroupId());
        pom.setArtifactId(project.getArtifactId());
        pom.setVersion(project.getVersion());

        pom.setServiceName(project.getServiceName() + " Management");
        pom.setServiceDescription(project.getServiceDescriptionForPom());

        Set<String> addedDependencyPrefixes = new HashSet<>();
        List<String> dependencyIdentifiers = new ArrayList<>();
        if (JavaSettings.getInstance().isStreamStyleSerialization()) {
            addDependencyIdentifier(dependencyIdentifiers, addedDependencyPrefixes,
                Project.Dependency.AZURE_JSON, false);
        }
        addDependencyIdentifier(dependencyIdentifiers, addedDependencyPrefixes,
                Project.Dependency.AZURE_CORE, false);
        addDependencyIdentifier(dependencyIdentifiers, addedDependencyPrefixes,
                Project.Dependency.AZURE_CORE_MANAGEMENT, false);
        if (JavaSettings.getInstance().isGenerateTests()) {
            addDependencyIdentifier(dependencyIdentifiers, addedDependencyPrefixes,
                    Project.Dependency.AZURE_CORE_TEST, true);
            addDependencyIdentifier(dependencyIdentifiers, addedDependencyPrefixes,
                    Project.Dependency.AZURE_IDENTITY, true);
            addDependencyIdentifier(dependencyIdentifiers, addedDependencyPrefixes,
                    Project.Dependency.JUNIT_JUPITER_API, true);
            addDependencyIdentifier(dependencyIdentifiers, addedDependencyPrefixes,
                    Project.Dependency.JUNIT_JUPITER_ENGINE, true);
            addDependencyIdentifier(dependencyIdentifiers, addedDependencyPrefixes,
                    Project.Dependency.MOCKITO_CORE, true);
            addDependencyIdentifier(dependencyIdentifiers, addedDependencyPrefixes,
                    Project.Dependency.SLF4J_SIMPLE, true);
        }

        // merge dependencies in POM and dependencies added above
        dependencyIdentifiers.addAll(project.getPomDependencyIdentifiers().stream()
                .filter(dependencyIdentifier -> addedDependencyPrefixes.stream().noneMatch(dependencyIdentifier::startsWith))
                .collect(Collectors.toList()));

        pom.setDependencyIdentifiers(dependencyIdentifiers);

        if (project.isIntegratedWithSdk()) {
            pom.setParentIdentifier(Project.Dependency.AZURE_CLIENT_SDK_PARENT.getDependencyIdentifier());
            pom.setParentRelativePath("../../parents/azure-client-sdk-parent");
        }

        pom.setRequireCompilerPlugins(!project.isIntegratedWithSdk());

        return pom;
    }
}
