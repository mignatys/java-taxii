
package org.mitre.taxii.messages.xml10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
import org.mitre.taxii.messages.xmldsig.Signature;


/**
 * Indicates a successful response to a Feed Management Request message.
 * 
 * <p>Java class for TAXIISubscriptionManagementResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAXIISubscriptionManagementResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://taxii.mitre.org/messages/taxii_xml_binding-1}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subscription" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1}SubscriptionRecordType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="feed_name" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAXIISubscriptionManagementResponseType", propOrder = {
    "message",
    "subscriptions",
    "signature"
})
@XmlRootElement(name = "Subscription_Management_Response")
public class SubscriptionManagementResponse
    extends ResponseMessageType
    implements Equals, HashCode
{

    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "Subscription")
    protected List<SubscriptionRecordType> subscriptions;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected Signature signature;
    @XmlAttribute(name = "feed_name", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String feedName;

    /**
     * Default no-arg constructor
     * 
     */
    public SubscriptionManagementResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SubscriptionManagementResponse(final ExtendedHeadersType extendedHeaders, final String messageId, final String inResponseTo, final String message, final List<SubscriptionRecordType> subscriptions, final Signature signature, final String feedName) {
        super(extendedHeaders, messageId, inResponseTo);
        this.message = message;
        this.subscriptions = subscriptions;
        this.signature = signature;
        this.feedName = feedName;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the subscriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionRecordType }
     * 
     * 
     */
    public List<SubscriptionRecordType> getSubscriptions() {
        if (subscriptions == null) {
            subscriptions = new ArrayList<SubscriptionRecordType>();
        }
        return this.subscriptions;
    }

    /**
     * An XML Digital Signature scoped to this message.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setSignature(Signature value) {
        this.signature = value;
    }

    /**
     * Gets the value of the feedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets the value of the feedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedName(String value) {
        this.feedName = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SubscriptionManagementResponse)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SubscriptionManagementResponse that = ((SubscriptionManagementResponse) object);
        {
            String lhsMessage;
            lhsMessage = this.getMessage();
            String rhsMessage;
            rhsMessage = that.getMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage), lhsMessage, rhsMessage)) {
                return false;
            }
        }
        {
            List<SubscriptionRecordType> lhsSubscriptions;
            lhsSubscriptions = (((this.subscriptions!= null)&&(!this.subscriptions.isEmpty()))?this.getSubscriptions():null);
            List<SubscriptionRecordType> rhsSubscriptions;
            rhsSubscriptions = (((that.subscriptions!= null)&&(!that.subscriptions.isEmpty()))?that.getSubscriptions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscriptions", lhsSubscriptions), LocatorUtils.property(thatLocator, "subscriptions", rhsSubscriptions), lhsSubscriptions, rhsSubscriptions)) {
                return false;
            }
        }
        {
            Signature lhsSignature;
            lhsSignature = this.getSignature();
            Signature rhsSignature;
            rhsSignature = that.getSignature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signature", lhsSignature), LocatorUtils.property(thatLocator, "signature", rhsSignature), lhsSignature, rhsSignature)) {
                return false;
            }
        }
        {
            String lhsFeedName;
            lhsFeedName = this.getFeedName();
            String rhsFeedName;
            rhsFeedName = that.getFeedName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feedName", lhsFeedName), LocatorUtils.property(thatLocator, "feedName", rhsFeedName), lhsFeedName, rhsFeedName)) {
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
            String theMessage;
            theMessage = this.getMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "message", theMessage), currentHashCode, theMessage);
        }
        {
            List<SubscriptionRecordType> theSubscriptions;
            theSubscriptions = (((this.subscriptions!= null)&&(!this.subscriptions.isEmpty()))?this.getSubscriptions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subscriptions", theSubscriptions), currentHashCode, theSubscriptions);
        }
        {
            Signature theSignature;
            theSignature = this.getSignature();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signature", theSignature), currentHashCode, theSignature);
        }
        {
            String theFeedName;
            theFeedName = this.getFeedName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feedName", theFeedName), currentHashCode, theFeedName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public SubscriptionManagementResponse withMessage(String value) {
        setMessage(value);
        return this;
    }

    public SubscriptionManagementResponse withSubscriptions(SubscriptionRecordType... values) {
        if (values!= null) {
            for (SubscriptionRecordType value: values) {
                getSubscriptions().add(value);
            }
        }
        return this;
    }

    public SubscriptionManagementResponse withSubscriptions(Collection<SubscriptionRecordType> values) {
        if (values!= null) {
            getSubscriptions().addAll(values);
        }
        return this;
    }

    public SubscriptionManagementResponse withSignature(Signature value) {
        setSignature(value);
        return this;
    }

    public SubscriptionManagementResponse withFeedName(String value) {
        setFeedName(value);
        return this;
    }

    @Override
    public SubscriptionManagementResponse withInResponseTo(String value) {
        setInResponseTo(value);
        return this;
    }

    @Override
    public SubscriptionManagementResponse withExtendedHeaders(ExtendedHeadersType value) {
        setExtendedHeaders(value);
        return this;
    }

    @Override
    public SubscriptionManagementResponse withMessageId(String value) {
        setMessageId(value);
        return this;
    }

}
