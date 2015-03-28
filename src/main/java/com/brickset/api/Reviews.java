
package com.brickset.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for reviews complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reviews"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datePosted" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="overallRating" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="parts" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="buildingExperience" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="playability" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="valueForMoney" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="review" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HTML" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reviews", propOrder = {
    "author",
    "datePosted",
    "overallRating",
    "parts",
    "buildingExperience",
    "playability",
    "valueForMoney",
    "title",
    "review",
    "html"
})
public class Reviews {

    protected String author;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePosted;
    protected int overallRating;
    protected int parts;
    protected int buildingExperience;
    protected int playability;
    protected int valueForMoney;
    protected String title;
    protected String review;
    @XmlElement(name = "HTML")
    protected boolean html;

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the datePosted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePosted() {
        return datePosted;
    }

    /**
     * Sets the value of the datePosted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePosted(XMLGregorianCalendar value) {
        this.datePosted = value;
    }

    /**
     * Gets the value of the overallRating property.
     * 
     */
    public int getOverallRating() {
        return overallRating;
    }

    /**
     * Sets the value of the overallRating property.
     * 
     */
    public void setOverallRating(int value) {
        this.overallRating = value;
    }

    /**
     * Gets the value of the parts property.
     * 
     */
    public int getParts() {
        return parts;
    }

    /**
     * Sets the value of the parts property.
     * 
     */
    public void setParts(int value) {
        this.parts = value;
    }

    /**
     * Gets the value of the buildingExperience property.
     * 
     */
    public int getBuildingExperience() {
        return buildingExperience;
    }

    /**
     * Sets the value of the buildingExperience property.
     * 
     */
    public void setBuildingExperience(int value) {
        this.buildingExperience = value;
    }

    /**
     * Gets the value of the playability property.
     * 
     */
    public int getPlayability() {
        return playability;
    }

    /**
     * Sets the value of the playability property.
     * 
     */
    public void setPlayability(int value) {
        this.playability = value;
    }

    /**
     * Gets the value of the valueForMoney property.
     * 
     */
    public int getValueForMoney() {
        return valueForMoney;
    }

    /**
     * Sets the value of the valueForMoney property.
     * 
     */
    public void setValueForMoney(int value) {
        this.valueForMoney = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the review property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReview() {
        return review;
    }

    /**
     * Sets the value of the review property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReview(String value) {
        this.review = value;
    }

    /**
     * Gets the value of the html property.
     * 
     */
    public boolean isHTML() {
        return html;
    }

    /**
     * Sets the value of the html property.
     * 
     */
    public void setHTML(boolean value) {
        this.html = value;
    }

}
