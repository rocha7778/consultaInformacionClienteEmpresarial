//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.29 a las 04:54:51 PM COT 
//


package com.grupobancolombia.intf.cliente.conocimiento.consultainformacionclienteempresarial.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MiembroDeJunta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MiembroDeJunta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionMiembroJunta" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}DatosIdentificacion"/>
 *         &lt;element name="nombreCompleto" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}NombreCompleto"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiembroDeJunta", propOrder = {
    "identificacionMiembroJunta",
    "nombreCompleto",
    "observaciones"
})
public class MiembroDeJunta {

    @XmlElement(required = true)
    protected DatosIdentificacion identificacionMiembroJunta;
    @XmlElement(required = true)
    protected NombreCompleto nombreCompleto;
    protected String observaciones;

    /**
     * Obtiene el valor de la propiedad identificacionMiembroJunta.
     * 
     * @return
     *     possible object is
     *     {@link DatosIdentificacion }
     *     
     */
    public DatosIdentificacion getIdentificacionMiembroJunta() {
        return identificacionMiembroJunta;
    }

    /**
     * Define el valor de la propiedad identificacionMiembroJunta.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosIdentificacion }
     *     
     */
    public void setIdentificacionMiembroJunta(DatosIdentificacion value) {
        this.identificacionMiembroJunta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCompleto.
     * 
     * @return
     *     possible object is
     *     {@link NombreCompleto }
     *     
     */
    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Define el valor de la propiedad nombreCompleto.
     * 
     * @param value
     *     allowed object is
     *     {@link NombreCompleto }
     *     
     */
    public void setNombreCompleto(NombreCompleto value) {
        this.nombreCompleto = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

}
