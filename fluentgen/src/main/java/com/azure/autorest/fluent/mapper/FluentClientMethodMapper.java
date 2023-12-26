// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.mapper;

import com.azure.autorest.extension.base.model.codemodel.ConvenienceApi;
import com.azure.autorest.extension.base.model.codemodel.Operation;
import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.fluent.model.clientmodel.FluentStatic;
import com.azure.autorest.mapper.ClientMethodMapper;
import com.azure.autorest.model.clientmodel.ClientMethod;
import com.azure.autorest.model.clientmodel.ClientMethodParameter;
import com.azure.autorest.model.clientmodel.ClientMethodType;
import com.azure.autorest.model.clientmodel.IType;
import com.azure.autorest.model.clientmodel.ProxyMethod;
import com.azure.autorest.model.javamodel.JavaVisibility;
import com.azure.autorest.util.MethodNamer;

import java.util.List;

public class FluentClientMethodMapper extends ClientMethodMapper {

    private static final FluentClientMethodMapper INSTANCE = new FluentClientMethodMapper();

    public static FluentClientMethodMapper getInstance() {
        return INSTANCE;
    }

    @Override
    protected void createAdditionalLroMethods(
            Operation operation, ClientMethod.Builder builder, List<ClientMethod> methods, boolean isProtocolMethod,
            IType asyncReturnType, IType syncReturnType, ProxyMethod proxyMethod, List<ClientMethodParameter> parameters,
            boolean generateClientMethodWithOnlyRequiredParameters, MethodOverloadType defaultOverloadType) {

        // fluent provides the simple wrapper API for LRO
        // the difference is that it does not have a RestResponse overload, as Response data is not included in an LRO API

        // async
        methods.add(builder
                .returnValue(createLongRunningAsyncReturnValue(operation, asyncReturnType, syncReturnType))
                .name(proxyMethod.getSimpleAsyncMethodName())
                .onlyRequiredParameters(false)
                .type(ClientMethodType.LongRunningAsync)
                .groupedParameterRequired(false)
                .methodVisibility(methodVisibility(ClientMethodType.LongRunningAsync, defaultOverloadType, false, isProtocolMethod))
                .build());

        if (generateClientMethodWithOnlyRequiredParameters) {
            methods.add(builder
                    .onlyRequiredParameters(true)
                    .methodVisibility(methodVisibility(ClientMethodType.LongRunningAsync, MethodOverloadType.OVERLOAD_MINIMUM, false, isProtocolMethod))
                    .build());
        }

        addClientMethodWithContext(methods,
                builder.methodVisibility(methodVisibility(ClientMethodType.LongRunningAsync, defaultOverloadType, true, isProtocolMethod)),
                parameters, getContextParameter(isProtocolMethod));

        // sync
        methods.add(builder
                .returnValue(createLongRunningSyncReturnValue(operation, syncReturnType))
                .name(proxyMethod.getName())
                .onlyRequiredParameters(false)
                .type(ClientMethodType.LongRunningSync)
                .groupedParameterRequired(false)
                .onlyRequiredParameters(true)
                .methodVisibility(methodVisibility(ClientMethodType.LongRunningSync, defaultOverloadType, false, isProtocolMethod))
                .build());

        if (generateClientMethodWithOnlyRequiredParameters) {
            methods.add(builder
                    .onlyRequiredParameters(true)
                    .methodVisibility(methodVisibility(ClientMethodType.LongRunningSync, MethodOverloadType.OVERLOAD_MINIMUM, false, isProtocolMethod))
                    .build());
        }

        addClientMethodWithContext(methods,
                builder.methodVisibility(methodVisibility(ClientMethodType.LongRunningSync, defaultOverloadType, true, isProtocolMethod)),
                parameters, getContextParameter(isProtocolMethod));
    }

    @Override
    protected JavaVisibility methodVisibility(
            ClientMethodType methodType,
            MethodOverloadType methodOverloadType,
            boolean hasContextParameter,
            boolean isProtocolMethod) {

        JavaVisibility visibility;
        if (methodType == ClientMethodType.PagingAsyncSinglePage) {
            // utility methods
            // single page method is not visible, but the method is required for other client methods
            visibility = NOT_VISIBLE;
        } else if (methodType == ClientMethodType.PagingSyncSinglePage) {
            // wait for sync-stack to decide
            visibility = NOT_GENERATE;
        } else if (hasContextParameter && (methodType == ClientMethodType.SimpleAsyncRestResponse || methodType == ClientMethodType.PagingAsync || methodType == ClientMethodType.LongRunningBeginAsync || methodType == ClientMethodType.LongRunningAsync)) {
            // utility methods
            // async + Context method is not visible, but the method is required for other client methods
            visibility = NOT_VISIBLE;
        } else {
            if (methodType.name().contains("Async") && hasContextParameter) {
                // async method has both minimum overload and maximum overload, but no overload with Context parameter
                visibility = NOT_GENERATE;
            } else if (methodType == ClientMethodType.SimpleSync && hasContextParameter) {
                // SimpleSync with Context is covered by SimpleSyncRestResponse with Context
                visibility = NOT_GENERATE;
            } else if (methodType == ClientMethodType.SimpleAsync && methodOverloadType == MethodOverloadType.OVERLOAD_MAXIMUM) {
                // SimpleAsync with maximum overload is covered by SimpleAsyncRestResponse
                visibility = NOT_GENERATE;
            } else if (((methodType.name().contains("Sync") && !hasContextParameter))
                    && ((methodOverloadType.value() & MethodOverloadType.OVERLOAD_MINIMUM.value()) != MethodOverloadType.OVERLOAD_MINIMUM.value())) {
                // sync method has both minimum overload and maximum overload + Context parameter, but not maximum overload without Context parameter
                visibility = NOT_GENERATE;
            } else {
                visibility = super.methodVisibility(methodType, methodOverloadType, hasContextParameter, isProtocolMethod);
            }
        }

        if (JavaSettings.getInstance().isFluentLite() && !FluentStatic.getFluentJavaSettings().isGenerateAsyncMethods()) {
            // by default, Fluent lite disable all async method
            if (visibility == JavaVisibility.Public && methodType.name().contains("Async")) {
                visibility = JavaVisibility.Private;
            }
        }
        return visibility;
    }

    @Override
    protected MethodNamer resolveMethodNamer(ProxyMethod proxyMethod, ConvenienceApi convenienceApi, boolean isProtocolMethod) {
        return super.resolveMethodNamer(proxyMethod);
    }
}
