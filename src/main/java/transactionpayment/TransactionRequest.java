//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.04 at 01:16:44 AM MSK 
//


package transactionpayment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardValidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cvvCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="transactionAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cardNumber",
    "cardOwner",
    "cardValidity",
    "cvvCode",
    "transactionAmount"
})
@XmlRootElement(name = "transactionRequest")
public class TransactionRequest {

    @XmlElement(required = true)
    protected String cardNumber;
    @XmlElement(required = true)
    protected String cardOwner;
    @XmlElement(required = true)
    protected String cardValidity;
    protected short cvvCode;
    protected double transactionAmount;

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOwner() {
        return cardOwner;
    }

    /**
     * Sets the value of the cardOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOwner(String value) {
        this.cardOwner = value;
    }

    /**
     * Gets the value of the cardValidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardValidity() {
        return cardValidity;
    }

    /**
     * Sets the value of the cardValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardValidity(String value) {
        this.cardValidity = value;
    }

    /**
     * Gets the value of the cvvCode property.
     * 
     */
    public short getCvvCode() {
        return cvvCode;
    }

    /**
     * Sets the value of the cvvCode property.
     * 
     */
    public void setCvvCode(short value) {
        this.cvvCode = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     */
    public double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     */
    public void setTransactionAmount(double value) {
        this.transactionAmount = value;
    }

}
