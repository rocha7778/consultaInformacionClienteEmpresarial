//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.29 a las 04:31:01 PM COT 
//


package com.grupobancolombia.intf.cliente.conocimiento.consultainformacionclienteempresarial.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoPersona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personaNatural" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personaJuridica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoPersona", propOrder = {
    "personaNatural",
    "personaJuridica"
})
public class TipoPersona {

    @XmlElement(required = true)
    protected String personaNatural;
    @XmlElement(required = true)
    protected String personaJuridica;

    /**
     * Obtiene el valor de la propiedad personaNatural.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaNatural() {
        return personaNatural;
    }

    /**
     * Define el valor de la propiedad personaNatural.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaNatural(String value) {
        this.personaNatural = value;
    }

    /**
     * Obtiene el valor de la propiedad personaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaJuridica() {
        return personaJuridica;
    }

    /**
     * Define el valor de la propiedad personaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaJuridica(String value) {
        this.personaJuridica = value;
    }

}
