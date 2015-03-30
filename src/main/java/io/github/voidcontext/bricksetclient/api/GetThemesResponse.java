
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
 *         &lt;element name="getThemesResult" type="{http://brickset.com/api/}ArrayOfThemes" minOccurs="0"/&gt;
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
    "getThemesResult"
})
@XmlRootElement(name = "getThemesResponse")
public class GetThemesResponse {

    protected ArrayOfThemes getThemesResult;

    /**
     * Gets the value of the getThemesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfThemes }
     *     
     */
    public ArrayOfThemes getGetThemesResult() {
        return getThemesResult;
    }

    /**
     * Sets the value of the getThemesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfThemes }
     *     
     */
    public void setGetThemesResult(ArrayOfThemes value) {
        this.getThemesResult = value;
    }

}
