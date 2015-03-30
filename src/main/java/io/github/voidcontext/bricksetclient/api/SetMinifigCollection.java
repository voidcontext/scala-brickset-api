
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
 *         &lt;element name="apiKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minifigNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtyOwned" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="wanted" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "apiKey",
    "userHash",
    "minifigNumber",
    "qtyOwned",
    "wanted"
})
@XmlRootElement(name = "setMinifigCollection")
public class SetMinifigCollection {

    protected String apiKey;
    protected String userHash;
    protected String minifigNumber;
    protected int qtyOwned;
    protected int wanted;

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

    /**
     * Gets the value of the userHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserHash() {
        return userHash;
    }

    /**
     * Sets the value of the userHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserHash(String value) {
        this.userHash = value;
    }

    /**
     * Gets the value of the minifigNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinifigNumber() {
        return minifigNumber;
    }

    /**
     * Sets the value of the minifigNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinifigNumber(String value) {
        this.minifigNumber = value;
    }

    /**
     * Gets the value of the qtyOwned property.
     * 
     */
    public int getQtyOwned() {
        return qtyOwned;
    }

    /**
     * Sets the value of the qtyOwned property.
     * 
     */
    public void setQtyOwned(int value) {
        this.qtyOwned = value;
    }

    /**
     * Gets the value of the wanted property.
     * 
     */
    public int getWanted() {
        return wanted;
    }

    /**
     * Sets the value of the wanted property.
     * 
     */
    public void setWanted(int value) {
        this.wanted = value;
    }

}
