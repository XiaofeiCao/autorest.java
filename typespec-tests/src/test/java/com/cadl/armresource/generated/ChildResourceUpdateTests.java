// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armresource.generated;

import com.azure.core.util.BinaryData;
import com.cadl.armresource.models.ChildResourceUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ChildResourceUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChildResourceUpdate model
            = BinaryData.fromString("{\"tags\":{\"lrxybqsoq\":\"oizh\"}}").toObject(ChildResourceUpdate.class);
        Assertions.assertEquals("oizh", model.tags().get("lrxybqsoq"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChildResourceUpdate model = new ChildResourceUpdate().withTags(mapOf("lrxybqsoq", "oizh"));
        model = BinaryData.fromObject(model).toObject(ChildResourceUpdate.class);
        Assertions.assertEquals("oizh", model.tags().get("lrxybqsoq"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
