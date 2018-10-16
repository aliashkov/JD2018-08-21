//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1-b171012.0423 
//         See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.10.13 at 02:43:05 PM MSK 
//


package by.it.yaroshchuk.jd02_09.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for experience complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="experience"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="workplace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="post" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="workPeriodStart" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *         &lt;element name="workPeriodEnd" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "experience", propOrder = {
    "workplace",
    "post",
    "workPeriodStart",
    "workPeriodEnd"
})
public class Experience {

    @XmlElement(required = true)
    protected String workplace;
    @XmlElement(required = true)
    protected String post;
    @XmlElement(required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar workPeriodStart;
    @XmlElement(required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar workPeriodEnd;

    @Override
    public String toString() {
        return "Experience{" +
                "workplace='" + workplace + '\'' +
                ", post='" + post + '\'' +
                ", workPeriodStart=" + workPeriodStart +
                ", workPeriodEnd=" + workPeriodEnd +
                '}';
    }

    /**
     * Gets the value of the workplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplace() {
        return workplace;
    }

    /**
     * Sets the value of the workplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplace(String value) {
        this.workplace = value;
    }

    /**
     * Gets the value of the post property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPost() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPost(String value) {
        this.post = value;
    }

    /**
     * Gets the value of the workPeriodStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWorkPeriodStart() {
        return workPeriodStart;
    }

    /**
     * Sets the value of the workPeriodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWorkPeriodStart(XMLGregorianCalendar value) {
        this.workPeriodStart = value;
    }

    /**
     * Gets the value of the workPeriodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWorkPeriodEnd() {
        return workPeriodEnd;
    }

    /**
     * Sets the value of the workPeriodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWorkPeriodEnd(XMLGregorianCalendar value) {
        this.workPeriodEnd = value;
    }

}
