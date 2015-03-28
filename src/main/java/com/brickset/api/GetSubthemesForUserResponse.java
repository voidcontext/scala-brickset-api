
package com.brickset.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getSubthemesForUserResult" type="{http://brickset.com/api/}ArrayOfSubthemes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getSubthemesForUserResult"
})
@XmlRootElement(name = "getSubthemesForUserResponse")
public class GetSubthemesForUserResponse {

    protected ArrayOfSubthemes getSubthemesForUserResult;

    /**
     * Gets the value of the getSubthemesForUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubthemes }
     *     
     */
    public ArrayOfSubthemes getGetSubthemesForUserResult() {
        return getSubthemesForUserResult;
    }

    /**
     * Sets the value of the getSubthemesForUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubthemes }
     *     
     */
    public void setGetSubthemesForUserResult(ArrayOfSubthemes value) {
        this.getSubthemesForUserResult = value;
    }

}
