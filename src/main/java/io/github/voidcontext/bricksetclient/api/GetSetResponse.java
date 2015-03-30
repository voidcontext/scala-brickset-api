
package io.github.voidcontext.bricksetclient.api;

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
 *         &lt;element name="getSetResult" type="{http://brickset.com/api/}ArrayOfSets" minOccurs="0"/&gt;
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
    "getSetResult"
})
@XmlRootElement(name = "getSetResponse")
public class GetSetResponse {

    protected ArrayOfSets getSetResult;

    /**
     * Gets the value of the getSetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSets }
     *     
     */
    public ArrayOfSets getGetSetResult() {
        return getSetResult;
    }

    /**
     * Sets the value of the getSetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSets }
     *     
     */
    public void setGetSetResult(ArrayOfSets value) {
        this.getSetResult = value;
    }

}
