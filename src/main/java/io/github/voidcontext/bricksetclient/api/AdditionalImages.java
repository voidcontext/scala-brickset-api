
package io.github.voidcontext.bricksetclient.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additionalImages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additionalImages"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="thumbnailURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="largeThumbnailURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionalImages", propOrder = {
    "thumbnailURL",
    "largeThumbnailURL",
    "imageURL"
})
public class AdditionalImages {

    protected String thumbnailURL;
    protected String largeThumbnailURL;
    protected String imageURL;

    /**
     * Gets the value of the thumbnailURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailURL() {
        return thumbnailURL;
    }

    /**
     * Sets the value of the thumbnailURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailURL(String value) {
        this.thumbnailURL = value;
    }

    /**
     * Gets the value of the largeThumbnailURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargeThumbnailURL() {
        return largeThumbnailURL;
    }

    /**
     * Sets the value of the largeThumbnailURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargeThumbnailURL(String value) {
        this.largeThumbnailURL = value;
    }

    /**
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

}
