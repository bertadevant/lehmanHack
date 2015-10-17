
package lh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getThreadDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getThreadDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputThreadId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getThreadDetails", propOrder = {
    "inputThreadId"
})
public class GetThreadDetails {

    protected String inputThreadId;

    /**
     * Gets the value of the inputThreadId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputThreadId() {
        return inputThreadId;
    }

    /**
     * Sets the value of the inputThreadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputThreadId(String value) {
        this.inputThreadId = value;
    }

}
