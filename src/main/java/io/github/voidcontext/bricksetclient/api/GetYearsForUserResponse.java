
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
 *         &lt;element name="getYearsForUserResult" type="{http://brickset.com/api/}ArrayOfYears" minOccurs="0"/&gt;
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
    "getYearsForUserResult"
})
@XmlRootElement(name = "getYearsForUserResponse")
public class GetYearsForUserResponse {

    protected ArrayOfYears getYearsForUserResult;

    /**
     * Gets the value of the getYearsForUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfYears }
     *     
     */
    public ArrayOfYears getGetYearsForUserResult() {
        return getYearsForUserResult;
    }

    /**
     * Sets the value of the getYearsForUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfYears }
     *     
     */
    public void setGetYearsForUserResult(ArrayOfYears value) {
        this.getYearsForUserResult = value;
    }

}
