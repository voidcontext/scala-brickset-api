
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
 *         &lt;element name="getReviewsResult" type="{http://brickset.com/api/}ArrayOfReviews" minOccurs="0"/&gt;
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
    "getReviewsResult"
})
@XmlRootElement(name = "getReviewsResponse")
public class GetReviewsResponse {

    protected ArrayOfReviews getReviewsResult;

    /**
     * Gets the value of the getReviewsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReviews }
     *     
     */
    public ArrayOfReviews getGetReviewsResult() {
        return getReviewsResult;
    }

    /**
     * Sets the value of the getReviewsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReviews }
     *     
     */
    public void setGetReviewsResult(ArrayOfReviews value) {
        this.getReviewsResult = value;
    }

}
