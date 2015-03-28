
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
 *         &lt;element name="getMinifigCollectionResult" type="{http://brickset.com/api/}ArrayOfMinifigCollection" minOccurs="0"/&gt;
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
    "getMinifigCollectionResult"
})
@XmlRootElement(name = "getMinifigCollectionResponse")
public class GetMinifigCollectionResponse {

    protected ArrayOfMinifigCollection getMinifigCollectionResult;

    /**
     * Gets the value of the getMinifigCollectionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMinifigCollection }
     *     
     */
    public ArrayOfMinifigCollection getGetMinifigCollectionResult() {
        return getMinifigCollectionResult;
    }

    /**
     * Sets the value of the getMinifigCollectionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMinifigCollection }
     *     
     */
    public void setGetMinifigCollectionResult(ArrayOfMinifigCollection value) {
        this.getMinifigCollectionResult = value;
    }

}
