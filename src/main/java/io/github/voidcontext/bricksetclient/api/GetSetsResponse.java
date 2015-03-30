
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
 *         &lt;element name="getSetsResult" type="{http://brickset.com/api/}ArrayOfSets" minOccurs="0"/&gt;
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
    "getSetsResult"
})
@XmlRootElement(name = "getSetsResponse")
public class GetSetsResponse {

    protected ArrayOfSets getSetsResult;

    /**
     * Gets the value of the getSetsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSets }
     *     
     */
    public ArrayOfSets getGetSetsResult() {
        return getSetsResult;
    }

    /**
     * Sets the value of the getSetsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSets }
     *     
     */
    public void setGetSetsResult(ArrayOfSets value) {
        this.getSetsResult = value;
    }

}
