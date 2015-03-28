
package com.brickset.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="setCollection_qtyOwnedResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "setCollectionQtyOwnedResult"
})
@XmlRootElement(name = "setCollection_qtyOwnedResponse")
public class SetCollectionQtyOwnedResponse {

    @XmlElement(name = "setCollection_qtyOwnedResult")
    protected String setCollectionQtyOwnedResult;

    /**
     * Gets the value of the setCollectionQtyOwnedResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetCollectionQtyOwnedResult() {
        return setCollectionQtyOwnedResult;
    }

    /**
     * Sets the value of the setCollectionQtyOwnedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetCollectionQtyOwnedResult(String value) {
        this.setCollectionQtyOwnedResult = value;
    }

}
