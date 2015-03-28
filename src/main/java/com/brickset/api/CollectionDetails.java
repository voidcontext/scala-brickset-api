
package com.brickset.api;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for collectionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="collectionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collectionID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dateAcquired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pricePaid" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="additionalPricePaid" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="currentEstimatedValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="conditionWhenAcquired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acquiredFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conditionNow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parts" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="minifigs" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="instructions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="box" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="willTrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collectionDetails", propOrder = {
    "collectionID",
    "dateAcquired",
    "currency",
    "pricePaid",
    "additionalPricePaid",
    "currentEstimatedValue",
    "conditionWhenAcquired",
    "acquiredFrom",
    "conditionNow",
    "location",
    "notes",
    "parts",
    "minifigs",
    "instructions",
    "box",
    "willTrade",
    "modified",
    "deleted"
})
public class CollectionDetails {

    protected int collectionID;
    protected String dateAcquired;
    protected String currency;
    @XmlElement(required = true)
    protected BigDecimal pricePaid;
    @XmlElement(required = true)
    protected BigDecimal additionalPricePaid;
    @XmlElement(required = true)
    protected BigDecimal currentEstimatedValue;
    protected String conditionWhenAcquired;
    protected String acquiredFrom;
    protected String conditionNow;
    protected String location;
    protected String notes;
    protected boolean parts;
    protected boolean minifigs;
    protected boolean instructions;
    protected boolean box;
    protected boolean willTrade;
    protected boolean modified;
    protected boolean deleted;

    /**
     * Gets the value of the collectionID property.
     * 
     */
    public int getCollectionID() {
        return collectionID;
    }

    /**
     * Sets the value of the collectionID property.
     * 
     */
    public void setCollectionID(int value) {
        this.collectionID = value;
    }

    /**
     * Gets the value of the dateAcquired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAcquired() {
        return dateAcquired;
    }

    /**
     * Sets the value of the dateAcquired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAcquired(String value) {
        this.dateAcquired = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the pricePaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricePaid() {
        return pricePaid;
    }

    /**
     * Sets the value of the pricePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricePaid(BigDecimal value) {
        this.pricePaid = value;
    }

    /**
     * Gets the value of the additionalPricePaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdditionalPricePaid() {
        return additionalPricePaid;
    }

    /**
     * Sets the value of the additionalPricePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdditionalPricePaid(BigDecimal value) {
        this.additionalPricePaid = value;
    }

    /**
     * Gets the value of the currentEstimatedValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentEstimatedValue() {
        return currentEstimatedValue;
    }

    /**
     * Sets the value of the currentEstimatedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentEstimatedValue(BigDecimal value) {
        this.currentEstimatedValue = value;
    }

    /**
     * Gets the value of the conditionWhenAcquired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionWhenAcquired() {
        return conditionWhenAcquired;
    }

    /**
     * Sets the value of the conditionWhenAcquired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionWhenAcquired(String value) {
        this.conditionWhenAcquired = value;
    }

    /**
     * Gets the value of the acquiredFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquiredFrom() {
        return acquiredFrom;
    }

    /**
     * Sets the value of the acquiredFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquiredFrom(String value) {
        this.acquiredFrom = value;
    }

    /**
     * Gets the value of the conditionNow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionNow() {
        return conditionNow;
    }

    /**
     * Sets the value of the conditionNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionNow(String value) {
        this.conditionNow = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the parts property.
     * 
     */
    public boolean isParts() {
        return parts;
    }

    /**
     * Sets the value of the parts property.
     * 
     */
    public void setParts(boolean value) {
        this.parts = value;
    }

    /**
     * Gets the value of the minifigs property.
     * 
     */
    public boolean isMinifigs() {
        return minifigs;
    }

    /**
     * Sets the value of the minifigs property.
     * 
     */
    public void setMinifigs(boolean value) {
        this.minifigs = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     */
    public boolean isInstructions() {
        return instructions;
    }

    /**
     * Sets the value of the instructions property.
     * 
     */
    public void setInstructions(boolean value) {
        this.instructions = value;
    }

    /**
     * Gets the value of the box property.
     * 
     */
    public boolean isBox() {
        return box;
    }

    /**
     * Sets the value of the box property.
     * 
     */
    public void setBox(boolean value) {
        this.box = value;
    }

    /**
     * Gets the value of the willTrade property.
     * 
     */
    public boolean isWillTrade() {
        return willTrade;
    }

    /**
     * Sets the value of the willTrade property.
     * 
     */
    public void setWillTrade(boolean value) {
        this.willTrade = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     */
    public boolean isModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     */
    public void setModified(boolean value) {
        this.modified = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     */
    public void setDeleted(boolean value) {
        this.deleted = value;
    }

}
