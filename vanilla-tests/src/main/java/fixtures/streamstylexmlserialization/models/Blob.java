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

/** An Azure Storage blob. */
@Fluent
public final class Blob implements XmlSerializable<Blob> {
    /*
     * The Name property.
     */
    private String name;

    /*
     * The Deleted property.
     */
    private boolean deleted;

    /*
     * The Snapshot property.
     */
    private String snapshot;

    /*
     * Properties of a blob
     */
    private BlobProperties properties;

    /*
     * Dictionary of <string>
     */
    private Map<String, String> metadata;

    /** Creates an instance of Blob class. */
    public Blob() {}

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
     * @return the Blob object itself.
     */
    public Blob setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the deleted property: The Deleted property.
     *
     * @return the deleted value.
     */
    public boolean isDeleted() {
        return this.deleted;
    }

    /**
     * Set the deleted property: The Deleted property.
     *
     * @param deleted the deleted value to set.
     * @return the Blob object itself.
     */
    public Blob setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get the snapshot property: The Snapshot property.
     *
     * @return the snapshot value.
     */
    public String getSnapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The Snapshot property.
     *
     * @param snapshot the snapshot value to set.
     * @return the Blob object itself.
     */
    public Blob setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the properties property: Properties of a blob.
     *
     * @return the properties value.
     */
    public BlobProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of a blob.
     *
     * @param properties the properties value to set.
     * @return the Blob object itself.
     */
    public Blob setProperties(BlobProperties properties) {
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
     * @return the Blob object itself.
     */
    public Blob setMetadata(Map<String, String> metadata) {
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
            throw new IllegalArgumentException("Missing required property name in model Blob");
        }
        if (getSnapshot() == null) {
            throw new IllegalArgumentException("Missing required property snapshot in model Blob");
        }
        if (getProperties() == null) {
            throw new IllegalArgumentException("Missing required property properties in model Blob");
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
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Blob" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeStringElement("Name", this.name);
        xmlWriter.writeBooleanElement("Deleted", this.deleted);
        xmlWriter.writeStringElement("Snapshot", this.snapshot);
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
     * Reads an instance of Blob from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @return An instance of Blob if the XmlReader was pointing to an instance of it, or null if it was pointing to XML
     *     null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the Blob.
     */
    public static Blob fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of Blob from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     *     cases where the model can deserialize from different root element names.
     * @return An instance of Blob if the XmlReader was pointing to an instance of it, or null if it was pointing to XML
     *     null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the Blob.
     */
    public static Blob fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Blob" : rootElementName;
        return xmlReader.readObject(
                finalRootElementName,
                reader -> {
                    String name = null;
                    boolean deleted = false;
                    String snapshot = null;
                    BlobProperties properties = null;
                    Map<String, String> metadata = null;
                    while (reader.nextElement() != XmlToken.END_ELEMENT) {
                        QName elementName = reader.getElementName();

                        if ("Name".equals(elementName.getLocalPart())) {
                            name = reader.getStringElement();
                        } else if ("Deleted".equals(elementName.getLocalPart())) {
                            deleted = reader.getBooleanElement();
                        } else if ("Snapshot".equals(elementName.getLocalPart())) {
                            snapshot = reader.getStringElement();
                        } else if ("Properties".equals(elementName.getLocalPart())) {
                            properties = BlobProperties.fromXml(reader, "Properties");
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
                    Blob deserializedBlob = new Blob();
                    deserializedBlob.name = name;
                    deserializedBlob.deleted = deleted;
                    deserializedBlob.snapshot = snapshot;
                    deserializedBlob.properties = properties;
                    deserializedBlob.metadata = metadata;

                    return deserializedBlob;
                });
    }
}
