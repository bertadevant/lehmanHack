
package lh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fadsfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation", propOrder = {
    "fadsfs"
})
public class Operation {

    protected String fadsfs;

    /**
     * Gets the value of the fadsfs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFadsfs() {
        return fadsfs;
    }

    /**
     * Sets the value of the fadsfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFadsfs(String value) {
        this.fadsfs = value;
    }

}
