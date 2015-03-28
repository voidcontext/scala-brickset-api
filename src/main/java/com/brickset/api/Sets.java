
package com.brickset.api;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for sets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="setID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberVariant" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="theme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="themeGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subtheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pieces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minifigs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="imageFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thumbnailURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="largeThumbnailURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bricksetURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="owned" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="wanted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="qtyOwned" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACMDataCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ownedByTotal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="wantedByTotal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UKRetailPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USRetailPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CARetailPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EURetailPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="reviewCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="packagingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instructionsCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="additionalImageCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sets", propOrder = {
    "setID",
    "number",
    "numberVariant",
    "name",
    "year",
    "theme",
    "themeGroup",
    "subtheme",
    "pieces",
    "minifigs",
    "image",
    "imageFilename",
    "thumbnailURL",
    "largeThumbnailURL",
    "imageURL",
    "bricksetURL",
    "owned",
    "wanted",
    "qtyOwned",
    "userNotes",
    "acmDataCount",
    "ownedByTotal",
    "wantedByTotal",
    "ukRetailPrice",
    "usRetailPrice",
    "caRetailPrice",
    "euRetailPrice",
    "rating",
    "reviewCount",
    "packagingType",
    "availability",
    "instructionsCount",
    "additionalImageCount",
    "ean",
    "upc",
    "description",
    "lastUpdated"
})
public class Sets {

    protected int setID;
    protected String number;
    protected int numberVariant;
    protected String name;
    protected String year;
    protected String theme;
    protected String themeGroup;
    protected String subtheme;
    protected String pieces;
    protected String minifigs;
    protected boolean image;
    protected String imageFilename;
    protected String thumbnailURL;
    protected String largeThumbnailURL;
    protected String imageURL;
    protected String bricksetURL;
    protected boolean owned;
    protected boolean wanted;
    protected int qtyOwned;
    protected String userNotes;
    @XmlElement(name = "ACMDataCount")
    protected int acmDataCount;
    protected int ownedByTotal;
    protected int wantedByTotal;
    @XmlElement(name = "UKRetailPrice")
    protected String ukRetailPrice;
    @XmlElement(name = "USRetailPrice")
    protected String usRetailPrice;
    @XmlElement(name = "CARetailPrice")
    protected String caRetailPrice;
    @XmlElement(name = "EURetailPrice")
    protected String euRetailPrice;
    @XmlElement(required = true)
    protected BigDecimal rating;
    protected int reviewCount;
    protected String packagingType;
    protected String availability;
    protected int instructionsCount;
    protected int additionalImageCount;
    @XmlElement(name = "EAN")
    protected String ean;
    @XmlElement(name = "UPC")
    protected String upc;
    protected String description;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;

    /**
     * Gets the value of the setID property.
     * 
     */
    public int getSetID() {
        return setID;
    }

    /**
     * Sets the value of the setID property.
     * 
     */
    public void setSetID(int value) {
        this.setID = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the numberVariant property.
     * 
     */
    public int getNumberVariant() {
        return numberVariant;
    }

    /**
     * Sets the value of the numberVariant property.
     * 
     */
    public void setNumberVariant(int value) {
        this.numberVariant = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

    /**
     * Gets the value of the themeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThemeGroup() {
        return themeGroup;
    }

    /**
     * Sets the value of the themeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThemeGroup(String value) {
        this.themeGroup = value;
    }

    /**
     * Gets the value of the subtheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtheme() {
        return subtheme;
    }

    /**
     * Sets the value of the subtheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtheme(String value) {
        this.subtheme = value;
    }

    /**
     * Gets the value of the pieces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPieces() {
        return pieces;
    }

    /**
     * Sets the value of the pieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPieces(String value) {
        this.pieces = value;
    }

    /**
     * Gets the value of the minifigs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinifigs() {
        return minifigs;
    }

    /**
     * Sets the value of the minifigs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinifigs(String value) {
        this.minifigs = value;
    }

    /**
     * Gets the value of the image property.
     * 
     */
    public boolean isImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     */
    public void setImage(boolean value) {
        this.image = value;
    }

    /**
     * Gets the value of the imageFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFilename() {
        return imageFilename;
    }

    /**
     * Sets the value of the imageFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFilename(String value) {
        this.imageFilename = value;
    }

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

    /**
     * Gets the value of the bricksetURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBricksetURL() {
        return bricksetURL;
    }

    /**
     * Sets the value of the bricksetURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBricksetURL(String value) {
        this.bricksetURL = value;
    }

    /**
     * Gets the value of the owned property.
     * 
     */
    public boolean isOwned() {
        return owned;
    }

    /**
     * Sets the value of the owned property.
     * 
     */
    public void setOwned(boolean value) {
        this.owned = value;
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
     * Gets the value of the userNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNotes() {
        return userNotes;
    }

    /**
     * Sets the value of the userNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNotes(String value) {
        this.userNotes = value;
    }

    /**
     * Gets the value of the acmDataCount property.
     * 
     */
    public int getACMDataCount() {
        return acmDataCount;
    }

    /**
     * Sets the value of the acmDataCount property.
     * 
     */
    public void setACMDataCount(int value) {
        this.acmDataCount = value;
    }

    /**
     * Gets the value of the ownedByTotal property.
     * 
     */
    public int getOwnedByTotal() {
        return ownedByTotal;
    }

    /**
     * Sets the value of the ownedByTotal property.
     * 
     */
    public void setOwnedByTotal(int value) {
        this.ownedByTotal = value;
    }

    /**
     * Gets the value of the wantedByTotal property.
     * 
     */
    public int getWantedByTotal() {
        return wantedByTotal;
    }

    /**
     * Sets the value of the wantedByTotal property.
     * 
     */
    public void setWantedByTotal(int value) {
        this.wantedByTotal = value;
    }

    /**
     * Gets the value of the ukRetailPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUKRetailPrice() {
        return ukRetailPrice;
    }

    /**
     * Sets the value of the ukRetailPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUKRetailPrice(String value) {
        this.ukRetailPrice = value;
    }

    /**
     * Gets the value of the usRetailPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSRetailPrice() {
        return usRetailPrice;
    }

    /**
     * Sets the value of the usRetailPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSRetailPrice(String value) {
        this.usRetailPrice = value;
    }

    /**
     * Gets the value of the caRetailPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARetailPrice() {
        return caRetailPrice;
    }

    /**
     * Sets the value of the caRetailPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARetailPrice(String value) {
        this.caRetailPrice = value;
    }

    /**
     * Gets the value of the euRetailPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEURetailPrice() {
        return euRetailPrice;
    }

    /**
     * Sets the value of the euRetailPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEURetailPrice(String value) {
        this.euRetailPrice = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRating(BigDecimal value) {
        this.rating = value;
    }

    /**
     * Gets the value of the reviewCount property.
     * 
     */
    public int getReviewCount() {
        return reviewCount;
    }

    /**
     * Sets the value of the reviewCount property.
     * 
     */
    public void setReviewCount(int value) {
        this.reviewCount = value;
    }

    /**
     * Gets the value of the packagingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingType() {
        return packagingType;
    }

    /**
     * Sets the value of the packagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingType(String value) {
        this.packagingType = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailability(String value) {
        this.availability = value;
    }

    /**
     * Gets the value of the instructionsCount property.
     * 
     */
    public int getInstructionsCount() {
        return instructionsCount;
    }

    /**
     * Sets the value of the instructionsCount property.
     * 
     */
    public void setInstructionsCount(int value) {
        this.instructionsCount = value;
    }

    /**
     * Gets the value of the additionalImageCount property.
     * 
     */
    public int getAdditionalImageCount() {
        return additionalImageCount;
    }

    /**
     * Sets the value of the additionalImageCount property.
     * 
     */
    public void setAdditionalImageCount(int value) {
        this.additionalImageCount = value;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN(String value) {
        this.ean = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

}
