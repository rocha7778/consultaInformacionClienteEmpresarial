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
 * <p>Clase Java para AccionistaClienteEmpresarial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccionistaClienteEmpresarial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionAccionista" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}DatosIdentificacion"/>
 *         &lt;element name="nombreAccionista" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}NombreCompleto"/>
 *         &lt;element name="datosDireccion" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}DatosDireccion" minOccurs="0"/>
 *         &lt;element name="informacionAccionista" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}InformacionAccionista"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccionistaClienteEmpresarial", propOrder = {
    "identificacionAccionista",
    "nombreAccionista",
    "datosDireccion",
    "informacionAccionista"
})
public class AccionistaClienteEmpresarial {

    @XmlElement(required = true)
    protected DatosIdentificacion identificacionAccionista;
    @XmlElement(required = true)
    protected NombreCompleto nombreAccionista;
    protected DatosDireccion datosDireccion;
    @XmlElement(required = true)
    protected InformacionAccionista informacionAccionista;

    /**
     * Obtiene el valor de la propiedad identificacionAccionista.
     * 
     * @return
     *     possible object is
     *     {@link DatosIdentificacion }
     *     
     */
    public DatosIdentificacion getIdentificacionAccionista() {
        return identificacionAccionista;
    }

    /**
     * Define el valor de la propiedad identificacionAccionista.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosIdentificacion }
     *     
     */
    public void setIdentificacionAccionista(DatosIdentificacion value) {
        this.identificacionAccionista = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAccionista.
     * 
     * @return
     *     possible object is
     *     {@link NombreCompleto }
     *     
     */
    public NombreCompleto getNombreAccionista() {
        return nombreAccionista;
    }

    /**
     * Define el valor de la propiedad nombreAccionista.
     * 
     * @param value
     *     allowed object is
     *     {@link NombreCompleto }
     *     
     */
    public void setNombreAccionista(NombreCompleto value) {
        this.nombreAccionista = value;
    }

    /**
     * Obtiene el valor de la propiedad datosDireccion.
     * 
     * @return
     *     possible object is
     *     {@link DatosDireccion }
     *     
     */
    public DatosDireccion getDatosDireccion() {
        return datosDireccion;
    }

    /**
     * Define el valor de la propiedad datosDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosDireccion }
     *     
     */
    public void setDatosDireccion(DatosDireccion value) {
        this.datosDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionAccionista.
     * 
     * @return
     *     possible object is
     *     {@link InformacionAccionista }
     *     
     */
    public InformacionAccionista getInformacionAccionista() {
        return informacionAccionista;
    }

    /**
     * Define el valor de la propiedad informacionAccionista.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionAccionista }
     *     
     */
    public void setInformacionAccionista(InformacionAccionista value) {
        this.informacionAccionista = value;
    }

}
