// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.typespec.mapper;

import com.azure.autorest.extension.base.model.codemodel.PrimitiveSchema;
import com.azure.autorest.extension.base.model.codemodel.Schema;
import com.azure.autorest.mapper.PrimitiveMapper;
import com.azure.autorest.model.clientmodel.ClassType;
import com.azure.autorest.model.clientmodel.IType;
import com.azure.autorest.model.clientmodel.PrimitiveType;

public class TypeSpecPrimitiveMapper extends PrimitiveMapper {

    private static final PrimitiveMapper INSTANCE = new TypeSpecPrimitiveMapper();

    public static PrimitiveMapper getInstance() {
        return INSTANCE;
    }

    @Override
    protected IType createPrimitiveType(PrimitiveSchema primaryType) {
        if (primaryType.getType() == Schema.AllSchemaTypes.DATE) {
            return ClassType.LocalDate;
        } else if (primaryType.getType() == Schema.AllSchemaTypes.UNIXTIME) {
            return PrimitiveType.UnixTimeLong;
        } else {
            return super.createPrimitiveType(primaryType);
        }
    }
}
