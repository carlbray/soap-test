
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
 *         &lt;element name="GetGeorgeWashingtonsBirthdayResult" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
    "getGeorgeWashingtonsBirthdayResult"
})
@XmlRootElement(name = "GetGeorgeWashingtonsBirthdayResponse")
public class GetGeorgeWashingtonsBirthdayResponse {

    @XmlElement(name = "GetGeorgeWashingtonsBirthdayResult", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar getGeorgeWashingtonsBirthdayResult;

    /**
     * Gets the value of the getGeorgeWashingtonsBirthdayResult property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGetGeorgeWashingtonsBirthdayResult() {
        return getGeorgeWashingtonsBirthdayResult;
    }

    /**
     * Sets the value of the getGeorgeWashingtonsBirthdayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGetGeorgeWashingtonsBirthdayResult(XMLGregorianCalendar value) {
        this.getGeorgeWashingtonsBirthdayResult = value;
    }

}
