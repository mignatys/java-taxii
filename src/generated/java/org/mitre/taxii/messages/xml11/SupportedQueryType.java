
package org.mitre.taxii.messages.xml11;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Contains paramters for a particular Query Format
 * 
 * <p>Java class for SupportedQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportedQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}AnyMixedContentType">
 *       &lt;attribute name="format_id" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportedQueryType")
public class SupportedQueryType
    extends AnyMixedContentType
    implements Equals, HashCode
{

    @XmlAttribute(name = "format_id", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String formatId;

    /**
     * Default no-arg constructor
     * 
     */
    public SupportedQueryType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SupportedQueryType(final List<Object> content, final String formatId) {
        super(content);
        this.formatId = formatId;
    }

    /**
     * Gets the value of the formatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatId() {
        return formatId;
    }

    /**
     * Sets the value of the formatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatId(String value) {
        this.formatId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SupportedQueryType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SupportedQueryType that = ((SupportedQueryType) object);
        {
            String lhsFormatId;
            lhsFormatId = this.getFormatId();
            String rhsFormatId;
            rhsFormatId = that.getFormatId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "formatId", lhsFormatId), LocatorUtils.property(thatLocator, "formatId", rhsFormatId), lhsFormatId, rhsFormatId)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theFormatId;
            theFormatId = this.getFormatId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "formatId", theFormatId), currentHashCode, theFormatId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public SupportedQueryType withFormatId(String value) {
        setFormatId(value);
        return this;
    }

    @Override
    public SupportedQueryType withContent(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getContent().add(value);
            }
        }
        return this;
    }

    @Override
    public SupportedQueryType withContent(Collection<Object> values) {
        if (values!= null) {
            getContent().addAll(values);
        }
        return this;
    }

}
