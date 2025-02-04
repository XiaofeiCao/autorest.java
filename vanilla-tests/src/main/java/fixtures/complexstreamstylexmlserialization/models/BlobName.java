// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.complexstreamstylexmlserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlWriter;
import javax.xml.stream.XMLStreamException;

/** The BlobName model. */
@Fluent
public final class BlobName implements XmlSerializable<BlobName> {
    /*
     * Indicates if the blob name is encoded.
     */
    private Boolean encoded;

    /*
     * The name of the blob.
     */
    private String content;

    /** Creates an instance of BlobName class. */
    public BlobName() {}

    /**
     * Get the encoded property: Indicates if the blob name is encoded.
     *
     * @return the encoded value.
     */
    public Boolean isEncoded() {
        return this.encoded;
    }

    /**
     * Set the encoded property: Indicates if the blob name is encoded.
     *
     * @param encoded the encoded value to set.
     * @return the BlobName object itself.
     */
    public BlobName setEncoded(Boolean encoded) {
        this.encoded = encoded;
        return this;
    }

    /**
     * Get the content property: The name of the blob.
     *
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: The name of the blob.
     *
     * @param content the content value to set.
     * @return the BlobName object itself.
     */
    public BlobName setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "BlobName" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeBooleanAttribute("Encoded", this.encoded);
        xmlWriter.writeString(this.content);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of BlobName from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @return An instance of BlobName if the XmlReader was pointing to an instance of it, or null if it was pointing to
     *     XML null.
     * @throws XMLStreamException If an error occurs while reading the BlobName.
     */
    public static BlobName fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of BlobName from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     *     cases where the model can deserialize from different root element names.
     * @return An instance of BlobName if the XmlReader was pointing to an instance of it, or null if it was pointing to
     *     XML null.
     * @throws XMLStreamException If an error occurs while reading the BlobName.
     */
    public static BlobName fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "BlobName" : rootElementName;
        return xmlReader.readObject(
                finalRootElementName,
                reader -> {
                    Boolean encoded = reader.getNullableAttribute(null, "Encoded", Boolean::parseBoolean);
                    String content = reader.getStringElement();
                    BlobName deserializedBlobName = new BlobName();
                    deserializedBlobName.encoded = encoded;
                    deserializedBlobName.content = content;

                    return deserializedBlobName;
                });
    }
}
