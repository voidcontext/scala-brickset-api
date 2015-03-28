
package com.brickset.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for themes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="themes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="theme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="setCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="subthemeCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="yearFrom" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="yearTo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "themes", propOrder = {
    "theme",
    "setCount",
    "subthemeCount",
    "yearFrom",
    "yearTo"
})
public class Themes {

    protected String theme;
    protected int setCount;
    protected int subthemeCount;
    protected int yearFrom;
    protected int yearTo;

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
     * Gets the value of the setCount property.
     * 
     */
    public int getSetCount() {
        return setCount;
    }

    /**
     * Sets the value of the setCount property.
     * 
     */
    public void setSetCount(int value) {
        this.setCount = value;
    }

    /**
     * Gets the value of the subthemeCount property.
     * 
     */
    public int getSubthemeCount() {
        return subthemeCount;
    }

    /**
     * Sets the value of the subthemeCount property.
     * 
     */
    public void setSubthemeCount(int value) {
        this.subthemeCount = value;
    }

    /**
     * Gets the value of the yearFrom property.
     * 
     */
    public int getYearFrom() {
        return yearFrom;
    }

    /**
     * Sets the value of the yearFrom property.
     * 
     */
    public void setYearFrom(int value) {
        this.yearFrom = value;
    }

    /**
     * Gets the value of the yearTo property.
     * 
     */
    public int getYearTo() {
        return yearTo;
    }

    /**
     * Sets the value of the yearTo property.
     * 
     */
    public void setYearTo(int value) {
        this.yearTo = value;
    }

}
