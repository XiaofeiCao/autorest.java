// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.inheritance.implementation;

import com.cadl.inheritance.fluent.models.FishInner;
import com.cadl.inheritance.fluent.models.SalmonInner;
import com.cadl.inheritance.models.Fish;
import com.cadl.inheritance.models.FishKind;
import com.cadl.inheritance.models.Salmon;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class SalmonImpl implements Salmon {
    private SalmonInner innerObject;

    private final com.cadl.inheritance.InheritanceManager serviceManager;

    SalmonImpl(SalmonInner innerObject, com.cadl.inheritance.InheritanceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public int age() {
        return this.innerModel().age();
    }

    public String dna() {
        return this.innerModel().dna();
    }

    public FishKind kind() {
        return this.innerModel().kind();
    }

    public List<Fish> friends() {
        List<FishInner> inner = this.innerModel().friends();
        if (inner != null) {
            return Collections.unmodifiableList(
                inner.stream().map(inner1 -> new FishImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Map<String, Fish> hate() {
        Map<String, FishInner> inner = this.innerModel().hate();
        if (inner != null) {
            return Collections.unmodifiableMap(inner.entrySet()
                .stream()
                .collect(
                    Collectors.toMap(Map.Entry::getKey, inner1 -> new FishImpl(inner1.getValue(), this.manager()))));
        } else {
            return Collections.emptyMap();
        }
    }

    public Fish partner() {
        FishInner inner = this.innerModel().partner();
        if (inner != null) {
            return new FishImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SalmonInner innerModel() {
        return this.innerObject;
    }

    private com.cadl.inheritance.InheritanceManager manager() {
        return this.serviceManager;
    }
}
