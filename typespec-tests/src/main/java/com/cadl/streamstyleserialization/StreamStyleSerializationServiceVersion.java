// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.streamstyleserialization;

import com.azure.core.util.ServiceVersion;

/**
 * Service version of StreamStyleSerializationClient.
 */
public enum StreamStyleSerializationServiceVersion implements ServiceVersion {
    /**
     * Enum value 2023-12-01-preview.
     */
    V2023_12_01_PREVIEW("2023-12-01-preview");

    private final String version;

    StreamStyleSerializationServiceVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     * 
     * @return The latest {@link StreamStyleSerializationServiceVersion}.
     */
    public static StreamStyleSerializationServiceVersion getLatest() {
        return V2023_12_01_PREVIEW;
    }
}
