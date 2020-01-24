
package org.mitre.taxii.messages.xml10;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BAD_MESSAGE"/>
 *     &lt;enumeration value="DENIED"/>
 *     &lt;enumeration value="FAILURE"/>
 *     &lt;enumeration value="NOT_FOUND"/>
 *     &lt;enumeration value="POLLING_UNSUPPORTED"/>
 *     &lt;enumeration value="RETRY"/>
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="UNAUTHORIZED"/>
 *     &lt;enumeration value="UNSUPPORTED_MESSAGE"/>
 *     &lt;enumeration value="UNSUPPORTED_CONTENT"/>
 *     &lt;enumeration value="UNSUPPORTED_PROTOCOL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusTypeEnum")
@XmlEnum
public enum StatusTypeEnum {


    /**
     * Bad Message - Recipient could not interpret the message.
     * 
     */
    BAD_MESSAGE,

    /**
     * Denied - Rejected for reasons other than authentication failure.
     * 
     */
    DENIED,

    /**
     * Failure - General indication of failure.
     * 
     */
    FAILURE,

    /**
     * Not Found - Request was for an unknown target.
     * 
     */
    NOT_FOUND,

    /**
     * Polling Not Supported - Request for polling of content cannot be supported.
     * 
     */
    POLLING_UNSUPPORTED,

    /**
     * Retry - Unable to respond within current session but may be successfuly at a later time.
     * 
     */
    RETRY,

    /**
     * Success - Message successfully received and processed.
     * 
     */
    SUCCESS,

    /**
     * Unauthorized - Authentication missing or incorrect.
     * 
     */
    UNAUTHORIZED,

    /**
     * Unsupported Message Binding - Requested Message Binding not supported.
     * 
     */
    UNSUPPORTED_MESSAGE,

    /**
     * Unsupported Content Binding - Requested Content Binding not supported.
     * 
     */
    UNSUPPORTED_CONTENT,

    /**
     * Unsupported Protocol - Requested Protocol Binding not supported.
     * 
     */
    UNSUPPORTED_PROTOCOL;

    public String value() {
        return name();
    }

    public static StatusTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
