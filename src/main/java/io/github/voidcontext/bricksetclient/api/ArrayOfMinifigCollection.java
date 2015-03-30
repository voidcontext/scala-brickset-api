
package io.github.voidcontext.bricksetclient.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMinifigCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMinifigCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minifigCollection" type="{http://brickset.com/api/}minifigCollection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMinifigCollection", propOrder = {
    "minifigCollection"
})
public class ArrayOfMinifigCollection {

    @XmlElement(nillable = true)
    protected List<MinifigCollection> minifigCollection;

    /**
     * Gets the value of the minifigCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minifigCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinifigCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MinifigCollection }
     * 
     * 
     */
    public List<MinifigCollection> getMinifigCollection() {
        if (minifigCollection == null) {
            minifigCollection = new ArrayList<MinifigCollection>();
        }
        return this.minifigCollection;
    }

}
