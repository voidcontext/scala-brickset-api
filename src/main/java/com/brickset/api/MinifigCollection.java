
package com.brickset.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for minifigCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="minifigCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minifigNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownedInSets" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ownedLoose" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ownedTotal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="wanted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "minifigCollection", propOrder = {
    "minifigNumber",
    "ownedInSets",
    "ownedLoose",
    "ownedTotal",
    "wanted"
})
public class MinifigCollection {

    protected String minifigNumber;
    protected int ownedInSets;
    protected int ownedLoose;
    protected int ownedTotal;
    protected boolean wanted;

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
     * Gets the value of the ownedInSets property.
     * 
     */
    public int getOwnedInSets() {
        return ownedInSets;
    }

    /**
     * Sets the value of the ownedInSets property.
     * 
     */
    public void setOwnedInSets(int value) {
        this.ownedInSets = value;
    }

    /**
     * Gets the value of the ownedLoose property.
     * 
     */
    public int getOwnedLoose() {
        return ownedLoose;
    }

    /**
     * Sets the value of the ownedLoose property.
     * 
     */
    public void setOwnedLoose(int value) {
        this.ownedLoose = value;
    }

    /**
     * Gets the value of the ownedTotal property.
     * 
     */
    public int getOwnedTotal() {
        return ownedTotal;
    }

    /**
     * Sets the value of the ownedTotal property.
     * 
     */
    public void setOwnedTotal(int value) {
        this.ownedTotal = value;
    }

    /**
     * Gets the value of the wanted property.
     * 
     */
    public boolean isWanted() {
        return wanted;
    }

    /**
     * Sets the value of the wanted property.
     * 
     */
    public void setWanted(boolean value) {
        this.wanted = value;
    }

}
