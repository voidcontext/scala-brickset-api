
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
 *         &lt;element name="getAdditionalImagesResult" type="{http://brickset.com/api/}ArrayOfAdditionalImages" minOccurs="0"/&gt;
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
    "getAdditionalImagesResult"
})
@XmlRootElement(name = "getAdditionalImagesResponse")
public class GetAdditionalImagesResponse {

    protected ArrayOfAdditionalImages getAdditionalImagesResult;

    /**
     * Gets the value of the getAdditionalImagesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdditionalImages }
     *     
     */
    public ArrayOfAdditionalImages getGetAdditionalImagesResult() {
        return getAdditionalImagesResult;
    }

    /**
     * Sets the value of the getAdditionalImagesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdditionalImages }
     *     
     */
    public void setGetAdditionalImagesResult(ArrayOfAdditionalImages value) {
        this.getAdditionalImagesResult = value;
    }

}
