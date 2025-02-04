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
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/** I am root, and I ref a model with no meta. */
@Fluent
public final class RootWithRefAndNoMeta implements XmlSerializable<RootWithRefAndNoMeta> {
    /*
     * XML will use RefToModel
     */
    private ComplexTypeNoMeta refToModel;

    /*
     * Something else (just to avoid flattening)
     */
    private String something;

    /** Creates an instance of RootWithRefAndNoMeta class. */
    public RootWithRefAndNoMeta() {}

    /**
     * Get the refToModel property: XML will use RefToModel.
     *
     * @return the refToModel value.
     */
    public ComplexTypeNoMeta getRefToModel() {
        return this.refToModel;
    }

    /**
     * Set the refToModel property: XML will use RefToModel.
     *
     * @param refToModel the refToModel value to set.
     * @return the RootWithRefAndNoMeta object itself.
     */
    public RootWithRefAndNoMeta setRefToModel(ComplexTypeNoMeta refToModel) {
        this.refToModel = refToModel;
        return this;
    }

    /**
     * Get the something property: Something else (just to avoid flattening).
     *
     * @return the something value.
     */
    public String getSomething() {
        return this.something;
    }

    /**
     * Set the something property: Something else (just to avoid flattening).
     *
     * @param something the something value to set.
     * @return the RootWithRefAndNoMeta object itself.
     */
    public RootWithRefAndNoMeta setSomething(String something) {
        this.something = something;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getRefToModel() != null) {
            getRefToModel().validate();
        }
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "RootWithRefAndNoMeta" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeXml(this.refToModel, "RefToModel");
        xmlWriter.writeStringElement("Something", this.something);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of RootWithRefAndNoMeta from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @return An instance of RootWithRefAndNoMeta if the XmlReader was pointing to an instance of it, or null if it was
     *     pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the RootWithRefAndNoMeta.
     */
    public static RootWithRefAndNoMeta fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of RootWithRefAndNoMeta from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     *     cases where the model can deserialize from different root element names.
     * @return An instance of RootWithRefAndNoMeta if the XmlReader was pointing to an instance of it, or null if it was
     *     pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the RootWithRefAndNoMeta.
     */
    public static RootWithRefAndNoMeta fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName =
                CoreUtils.isNullOrEmpty(rootElementName) ? "RootWithRefAndNoMeta" : rootElementName;
        return xmlReader.readObject(
                finalRootElementName,
                reader -> {
                    ComplexTypeNoMeta refToModel = null;
                    String something = null;
                    while (reader.nextElement() != XmlToken.END_ELEMENT) {
                        QName elementName = reader.getElementName();

                        if ("RefToModel".equals(elementName.getLocalPart())) {
                            refToModel = ComplexTypeNoMeta.fromXml(reader, "RefToModel");
                        } else if ("Something".equals(elementName.getLocalPart())) {
                            something = reader.getStringElement();
                        } else {
                            reader.skipElement();
                        }
                    }
                    RootWithRefAndNoMeta deserializedRootWithRefAndNoMeta = new RootWithRefAndNoMeta();
                    deserializedRootWithRefAndNoMeta.refToModel = refToModel;
                    deserializedRootWithRefAndNoMeta.something = something;

                    return deserializedRootWithRefAndNoMeta;
                });
    }
}
