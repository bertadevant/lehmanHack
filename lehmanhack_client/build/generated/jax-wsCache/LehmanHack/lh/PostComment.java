
package lh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for postComment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postComment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threadID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postComment", propOrder = {
    "inputUsername",
    "inputComment",
    "threadID"
})
public class PostComment {

    protected String inputUsername;
    protected String inputComment;
    protected String threadID;

    /**
     * Gets the value of the inputUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputUsername() {
        return inputUsername;
    }

    /**
     * Sets the value of the inputUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputUsername(String value) {
        this.inputUsername = value;
    }

    /**
     * Gets the value of the inputComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputComment() {
        return inputComment;
    }

    /**
     * Sets the value of the inputComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputComment(String value) {
        this.inputComment = value;
    }

    /**
     * Gets the value of the threadID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadID() {
        return threadID;
    }

    /**
     * Sets the value of the threadID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadID(String value) {
        this.threadID = value;
    }

}
