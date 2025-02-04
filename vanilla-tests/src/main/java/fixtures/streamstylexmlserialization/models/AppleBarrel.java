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
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/** A barrel of apples. */
@Fluent
public final class AppleBarrel implements XmlSerializable<AppleBarrel> {
    static final class GoodApplesWrapper implements XmlSerializable<GoodApplesWrapper> {
        private final List<String> items;

        private GoodApplesWrapper(List<String> items) {
            this.items = items;
        }

        @Override
        public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
            return toXml(xmlWriter, null);
        }

        @Override
        public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
            rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "GoodApples" : rootElementName;
            xmlWriter.writeStartElement(rootElementName);
            if (items != null) {
                for (String element : items) {
                    xmlWriter.writeStringElement("Apple", element);
                }
            }
            return xmlWriter.writeEndElement();
        }

        public static GoodApplesWrapper fromXml(XmlReader xmlReader) throws XMLStreamException {
            return fromXml(xmlReader, null);
        }

        public static GoodApplesWrapper fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
            rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "GoodApples" : rootElementName;
            return xmlReader.readObject(
                    rootElementName,
                    reader -> {
                        List<String> items = null;

                        while (reader.nextElement() != XmlToken.END_ELEMENT) {
                            String elementName = reader.getElementName().getLocalPart();

                            if ("Apple".equals(elementName)) {
                                if (items == null) {
                                    items = new ArrayList<>();
                                }

                                items.add(reader.getStringElement());
                            } else {
                                reader.nextElement();
                            }
                        }
                        return new GoodApplesWrapper(items);
                    });
        }
    }

    /*
     * The GoodApples property.
     */
    private GoodApplesWrapper goodApples;

    static final class BadApplesWrapper implements XmlSerializable<BadApplesWrapper> {
        private final List<String> items;

        private BadApplesWrapper(List<String> items) {
            this.items = items;
        }

        @Override
        public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
            return toXml(xmlWriter, null);
        }

        @Override
        public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
            rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "BadApples" : rootElementName;
            xmlWriter.writeStartElement(rootElementName);
            if (items != null) {
                for (String element : items) {
                    xmlWriter.writeStringElement("Apple", element);
                }
            }
            return xmlWriter.writeEndElement();
        }

        public static BadApplesWrapper fromXml(XmlReader xmlReader) throws XMLStreamException {
            return fromXml(xmlReader, null);
        }

        public static BadApplesWrapper fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
            rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "BadApples" : rootElementName;
            return xmlReader.readObject(
                    rootElementName,
                    reader -> {
                        List<String> items = null;

                        while (reader.nextElement() != XmlToken.END_ELEMENT) {
                            String elementName = reader.getElementName().getLocalPart();

                            if ("Apple".equals(elementName)) {
                                if (items == null) {
                                    items = new ArrayList<>();
                                }

                                items.add(reader.getStringElement());
                            } else {
                                reader.nextElement();
                            }
                        }
                        return new BadApplesWrapper(items);
                    });
        }
    }

    /*
     * The BadApples property.
     */
    private BadApplesWrapper badApples;

    /** Creates an instance of AppleBarrel class. */
    public AppleBarrel() {}

    /**
     * Get the goodApples property: The GoodApples property.
     *
     * @return the goodApples value.
     */
    public List<String> getGoodApples() {
        if (this.goodApples == null) {
            this.goodApples = new GoodApplesWrapper(new ArrayList<String>());
        }
        return this.goodApples.items;
    }

    /**
     * Set the goodApples property: The GoodApples property.
     *
     * @param goodApples the goodApples value to set.
     * @return the AppleBarrel object itself.
     */
    public AppleBarrel setGoodApples(List<String> goodApples) {
        this.goodApples = new GoodApplesWrapper(goodApples);
        return this;
    }

    /**
     * Get the badApples property: The BadApples property.
     *
     * @return the badApples value.
     */
    public List<String> getBadApples() {
        if (this.badApples == null) {
            this.badApples = new BadApplesWrapper(new ArrayList<String>());
        }
        return this.badApples.items;
    }

    /**
     * Set the badApples property: The BadApples property.
     *
     * @param badApples the badApples value to set.
     * @return the AppleBarrel object itself.
     */
    public AppleBarrel setBadApples(List<String> badApples) {
        this.badApples = new BadApplesWrapper(badApples);
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
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "AppleBarrel" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeXml(this.goodApples);
        xmlWriter.writeXml(this.badApples);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of AppleBarrel from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @return An instance of AppleBarrel if the XmlReader was pointing to an instance of it, or null if it was pointing
     *     to XML null.
     * @throws XMLStreamException If an error occurs while reading the AppleBarrel.
     */
    public static AppleBarrel fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of AppleBarrel from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     *     cases where the model can deserialize from different root element names.
     * @return An instance of AppleBarrel if the XmlReader was pointing to an instance of it, or null if it was pointing
     *     to XML null.
     * @throws XMLStreamException If an error occurs while reading the AppleBarrel.
     */
    public static AppleBarrel fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "AppleBarrel" : rootElementName;
        return xmlReader.readObject(
                finalRootElementName,
                reader -> {
                    GoodApplesWrapper goodApples = null;
                    BadApplesWrapper badApples = null;
                    while (reader.nextElement() != XmlToken.END_ELEMENT) {
                        QName elementName = reader.getElementName();

                        if ("GoodApples".equals(elementName.getLocalPart())) {
                            goodApples = GoodApplesWrapper.fromXml(reader);
                        } else if ("BadApples".equals(elementName.getLocalPart())) {
                            badApples = BadApplesWrapper.fromXml(reader);
                        } else {
                            reader.skipElement();
                        }
                    }
                    AppleBarrel deserializedAppleBarrel = new AppleBarrel();
                    deserializedAppleBarrel.goodApples = goodApples;
                    deserializedAppleBarrel.badApples = badApples;

                    return deserializedAppleBarrel;
                });
    }
}
