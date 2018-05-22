
package com._27seconds.holidays.us.dates;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="GetSaintPatricksDayResult" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
    "getSaintPatricksDayResult"
})
@XmlRootElement(name = "GetSaintPatricksDayResponse")
public class GetSaintPatricksDayResponse {

    @XmlElement(name = "GetSaintPatricksDayResult", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar getSaintPatricksDayResult;

    /**
     * Gets the value of the getSaintPatricksDayResult property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGetSaintPatricksDayResult() {
        return getSaintPatricksDayResult;
    }

    /**
     * Sets the value of the getSaintPatricksDayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGetSaintPatricksDayResult(XMLGregorianCalendar value) {
        this.getSaintPatricksDayResult = value;
    }

}
