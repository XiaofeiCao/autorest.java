// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstylexmlserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/** An Azure Storage container. */
@Fluent
public final class Container implements XmlSerializable<Container> {
    /*
     * The Name property.
     */
    private String name;

    /*
     * Properties of a container
     */
    private ContainerProperties properties;

    /*
     * Dictionary of <string>
     */
    private Map<String, String> metadata;

    /** Creates an instance of Container class. */
    public Container() {}

    /**
     * Get the name property: The Name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The Name property.
     *
     * @param name the name value to set.
     * @return the Container object itself.
     */
    public Container setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: Properties of a container.
     *
     * @return the properties value.
     */
    public ContainerProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of a container.
     *
     * @param properties the properties value to set.
     * @return the Container object itself.
     */
    public Container setProperties(ContainerProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the metadata property: Dictionary of &lt;string&gt;.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Dictionary of &lt;string&gt;.
     *
     * @param metadata the metadata value to set.
     * @return the Container object itself.
     */
    public Container setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getName() == null) {
            throw new IllegalArgumentException("Missing required property name in model Container");
        }
        if (getProperties() == null) {
            throw new IllegalArgumentException("Missing required property properties in model Container");
        } else {
            getProperties().validate();
        }
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Container" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeStringElement("Name", this.name);
        xmlWriter.writeXml(this.properties, "Properties");
        if (this.metadata != null) {
            xmlWriter.writeStartElement("Metadata");
            for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
                xmlWriter.writeStringElement(entry.getKey(), entry.getValue());
            }
            xmlWriter.writeEndElement();
        }
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of Container from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @return An instance of Container if the XmlReader was pointing to an instance of it, or null if it was pointing
     *     to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the Container.
     */
    public static Container fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of Container from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     *     cases where the model can deserialize from different root element names.
     * @return An instance of Container if the XmlReader was pointing to an instance of it, or null if it was pointing
     *     to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the Container.
     */
    public static Container fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Container" : rootElementName;
        return xmlReader.readObject(
                finalRootElementName,
                reader -> {
                    String name = null;
                    ContainerProperties properties = null;
                    Map<String, String> metadata = null;
                    while (reader.nextElement() != XmlToken.END_ELEMENT) {
                        QName elementName = reader.getElementName();

                        if ("Name".equals(elementName.getLocalPart())) {
                            name = reader.getStringElement();
                        } else if ("Properties".equals(elementName.getLocalPart())) {
                            properties = ContainerProperties.fromXml(reader, "Properties");
                        } else if ("Metadata".equals(elementName.getLocalPart())) {
                            if (metadata == null) {
                                metadata = new LinkedHashMap<>();
                            }
                            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                                metadata.put(reader.getElementName().getLocalPart(), reader.getStringElement());
                            }
                        } else {
                            reader.skipElement();
                        }
                    }
                    Container deserializedContainer = new Container();
                    deserializedContainer.name = name;
                    deserializedContainer.properties = properties;
                    deserializedContainer.metadata = metadata;

                    return deserializedContainer;
                });
    }
}
