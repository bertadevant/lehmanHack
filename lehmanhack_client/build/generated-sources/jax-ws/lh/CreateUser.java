
package lh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usernaname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passoword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="card" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUser", propOrder = {
    "usernaname",
    "passoword",
    "card"
})
public class CreateUser {

    protected String usernaname;
    protected String passoword;
    protected String card;

    /**
     * Gets the value of the usernaname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsernaname() {
        return usernaname;
    }

    /**
     * Sets the value of the usernaname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsernaname(String value) {
        this.usernaname = value;
    }

    /**
     * Gets the value of the passoword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassoword() {
        return passoword;
    }

    /**
     * Sets the value of the passoword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassoword(String value) {
        this.passoword = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCard(String value) {
        this.card = value;
    }

}
