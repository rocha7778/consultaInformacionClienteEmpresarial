//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.29 a las 04:31:01 PM COT 
//


package com.grupobancolombia.intf.cliente.conocimiento.consultainformacionclienteempresarial.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InformacionAsistenteGerenteType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InformacionAsistenteGerenteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreAsistente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoAsistente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionAsistenteGerenteType", propOrder = {
    "nombreAsistente",
    "cargoAsistente"
})
public class InformacionAsistenteGerenteType {

    protected String nombreAsistente;
    protected String cargoAsistente;

    /**
     * Obtiene el valor de la propiedad nombreAsistente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAsistente() {
        return nombreAsistente;
    }

    /**
     * Define el valor de la propiedad nombreAsistente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAsistente(String value) {
        this.nombreAsistente = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoAsistente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoAsistente() {
        return cargoAsistente;
    }

    /**
     * Define el valor de la propiedad cargoAsistente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoAsistente(String value) {
        this.cargoAsistente = value;
    }

}
