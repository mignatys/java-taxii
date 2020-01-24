
package org.mitre.taxii.messages.xml11;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COUNT_ONLY"/>
 *     &lt;enumeration value="FULL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResponseTypeEnum")
@XmlEnum
public enum ResponseTypeEnum {


    /**
     * A request for only the number of applicable records.
     * 
     */
    COUNT_ONLY,

    /**
     * A request for the full content of all applicable records.
     * 
     */
    FULL;

    public String value() {
        return name();
    }

    public static ResponseTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
