// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.xmlservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.net.URL;

/** The ModelWithUrlProperty model. */
@JacksonXmlRootElement(localName = "ModelWithUrlProperty")
@Fluent
public final class ModelWithUrlProperty {
    /*
     * The Url property.
     */
    @JsonProperty(value = "Url")
    private URL url;

    /** Creates an instance of ModelWithUrlProperty class. */
    public ModelWithUrlProperty() {}

    /**
     * Get the url property: The Url property.
     *
     * @return the url value.
     */
    public URL getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The Url property.
     *
     * @param url the url value to set.
     * @return the ModelWithUrlProperty object itself.
     */
    public ModelWithUrlProperty setUrl(URL url) {
        this.url = url;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
