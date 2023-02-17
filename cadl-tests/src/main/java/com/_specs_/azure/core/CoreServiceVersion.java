// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com._specs_.azure.core;

import com.azure.core.util.ServiceVersion;

/** Service version of CoreClient. */
public enum CoreServiceVersion implements ServiceVersion {
    /** Enum value 2022-12-01-preview. */
    V2022_12_01_PREVIEW("2022-12-01-preview");

    private final String version;

    CoreServiceVersion(String version) {
        this.version = version;
    }

    /** {@inheritDoc} */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link CoreServiceVersion}.
     */
    public static CoreServiceVersion getLatest() {
        return V2022_12_01_PREVIEW;
    }
}
