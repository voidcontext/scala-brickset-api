
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
 *         &lt;element name="getInstructionsResult" type="{http://brickset.com/api/}ArrayOfInstructions" minOccurs="0"/&gt;
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
    "getInstructionsResult"
})
@XmlRootElement(name = "getInstructionsResponse")
public class GetInstructionsResponse {

    protected ArrayOfInstructions getInstructionsResult;

    /**
     * Gets the value of the getInstructionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstructions }
     *     
     */
    public ArrayOfInstructions getGetInstructionsResult() {
        return getInstructionsResult;
    }

    /**
     * Sets the value of the getInstructionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstructions }
     *     
     */
    public void setGetInstructionsResult(ArrayOfInstructions value) {
        this.getInstructionsResult = value;
    }

}
