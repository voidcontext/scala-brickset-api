
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
 *         &lt;element name="getCollectionDetailConditionsResult" type="{http://brickset.com/api/}ArrayOfConditions" minOccurs="0"/&gt;
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
    "getCollectionDetailConditionsResult"
})
@XmlRootElement(name = "getCollectionDetailConditionsResponse")
public class GetCollectionDetailConditionsResponse {

    protected ArrayOfConditions getCollectionDetailConditionsResult;

    /**
     * Gets the value of the getCollectionDetailConditionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConditions }
     *     
     */
    public ArrayOfConditions getGetCollectionDetailConditionsResult() {
        return getCollectionDetailConditionsResult;
    }

    /**
     * Sets the value of the getCollectionDetailConditionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConditions }
     *     
     */
    public void setGetCollectionDetailConditionsResult(ArrayOfConditions value) {
        this.getCollectionDetailConditionsResult = value;
    }

}
