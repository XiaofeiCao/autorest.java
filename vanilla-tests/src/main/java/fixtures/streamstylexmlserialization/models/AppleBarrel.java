// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstylexmlserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/** A barrel of apples. */
@Fluent
public final class AppleBarrel implements XmlSerializable<AppleBarrel> {
    private static final class GoodApplesWrapper implements XmlSerializable<GoodApplesWrapper> {
        private final List<String> items;

        private GoodApplesWrapper(List<String> items) {
            this.items = items;
        }

        @Override
        public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
            xmlWriter.writeStartElement("GoodApples");
            if (items != null) {
                for (String element : items) {
                    xmlWriter.writeStringElement("Apple", element);
                }
            }
            return xmlWriter.writeEndElement();
        }

        public static GoodApplesWrapper fromXml(XmlReader xmlReader) throws XMLStreamException {
            return xmlReader.readObject(
                    "GoodApples",
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

    private static final class BadApplesWrapper implements XmlSerializable<BadApplesWrapper> {
        private final List<String> items;

        private BadApplesWrapper(List<String> items) {
            this.items = items;
        }

        @Override
        public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
            xmlWriter.writeStartElement("BadApples");
            if (items != null) {
                for (String element : items) {
                    xmlWriter.writeStringElement("Apple", element);
                }
            }
            return xmlWriter.writeEndElement();
        }

        public static BadApplesWrapper fromXml(XmlReader xmlReader) throws XMLStreamException {
            return xmlReader.readObject(
                    "BadApples",
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
        xmlWriter.writeStartElement("AppleBarrel");
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
     */
    public static AppleBarrel fromXml(XmlReader xmlReader) throws XMLStreamException {
        return xmlReader.readObject(
                "AppleBarrel",
                reader -> {
                    List<String> goodApples = null;
                    List<String> badApples = null;
                    while (reader.nextElement() != XmlToken.END_ELEMENT) {
                        QName fieldName = reader.getElementName();

                        if ("GoodApples".equals(fieldName.getLocalPart())) {
                            if (goodApples == null) {
                                goodApples = new LinkedList<>();
                            }
                            goodApples.add(reader.getStringElement());
                        } else if ("BadApples".equals(fieldName.getLocalPart())) {
                            if (badApples == null) {
                                badApples = new LinkedList<>();
                            }
                            badApples.add(reader.getStringElement());
                        } else {
                            reader.skipElement();
                        }
                    }
                    AppleBarrel deserializedValue = new AppleBarrel();
                    deserializedValue.setGoodApples(goodApples);
                    deserializedValue.setBadApples(badApples);

                    return deserializedValue;
                });
    }
}
