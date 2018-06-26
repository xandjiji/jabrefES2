//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.26 at 10:54:04 AM BRT 
//


package org.jabref.logic.importer.fileformat.mods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for physicalDescriptionDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="physicalDescriptionDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.loc.gov/mods/v3}form"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}reformattingQuality"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}internetMediaType"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}extent"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}digitalOrigin"/>
 *         &lt;element name="note" type="{http://www.loc.gov/mods/v3}physicalDescriptionNote"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.loc.gov/mods/v3}languageAttributeGroup"/>
 *       &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="altRepGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "physicalDescriptionDefinition", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "formOrReformattingQualityOrInternetMediaType"
})
public class PhysicalDescriptionDefinition {

    @XmlElements({
        @XmlElement(name = "form", namespace = "http://www.loc.gov/mods/v3", type = FormDefinition.class),
        @XmlElement(name = "reformattingQuality", namespace = "http://www.loc.gov/mods/v3", type = ReformattingQualityDefinition.class),
        @XmlElement(name = "internetMediaType", namespace = "http://www.loc.gov/mods/v3", type = StringPlusLanguage.class),
        @XmlElement(name = "extent", namespace = "http://www.loc.gov/mods/v3", type = Extent.class),
        @XmlElement(name = "digitalOrigin", namespace = "http://www.loc.gov/mods/v3", type = DigitalOriginDefinition.class),
        @XmlElement(name = "note", namespace = "http://www.loc.gov/mods/v3", type = PhysicalDescriptionNote.class)
    })
    protected List<Object> formOrReformattingQualityOrInternetMediaType;
    @XmlAttribute(name = "displayLabel")
    protected String displayLabel;
    @XmlAttribute(name = "altRepGroup")
    protected String altRepGroup;
    @XmlAttribute(name = "lang")
    protected String atlang;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "script")
    protected String script;
    @XmlAttribute(name = "transliteration")
    protected String transliteration;

    /**
     * Gets the value of the formOrReformattingQualityOrInternetMediaType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOrReformattingQualityOrInternetMediaType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOrReformattingQualityOrInternetMediaType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormDefinition }
     * {@link ReformattingQualityDefinition }
     * {@link StringPlusLanguage }
     * {@link Extent }
     * {@link DigitalOriginDefinition }
     * {@link PhysicalDescriptionNote }
     * 
     * 
     */
    public List<Object> getFormOrReformattingQualityOrInternetMediaType() {
        if (formOrReformattingQualityOrInternetMediaType == null) {
            formOrReformattingQualityOrInternetMediaType = new ArrayList<Object>();
        }
        return this.formOrReformattingQualityOrInternetMediaType;
    }

    /**
     * Gets the value of the displayLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayLabel() {
        return displayLabel;
    }

    /**
     * Sets the value of the displayLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayLabel(String value) {
        this.displayLabel = value;
    }

    /**
     * Gets the value of the altRepGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltRepGroup() {
        return altRepGroup;
    }

    /**
     * Sets the value of the altRepGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltRepGroup(String value) {
        this.altRepGroup = value;
    }

    /**
     * Gets the value of the atlang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtlang() {
        return atlang;
    }

    /**
     * Sets the value of the atlang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtlang(String value) {
        this.atlang = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Gets the value of the transliteration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransliteration() {
        return transliteration;
    }

    /**
     * Sets the value of the transliteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransliteration(String value) {
        this.transliteration = value;
    }

}
