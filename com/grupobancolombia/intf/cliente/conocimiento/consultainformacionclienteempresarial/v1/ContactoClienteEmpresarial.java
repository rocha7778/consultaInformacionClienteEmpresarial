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
 * <p>Clase Java para ContactoClienteEmpresarial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContactoClienteEmpresarial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionContacto" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}DatosIdentificacion"/>
 *         &lt;element name="informacionContacto" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}InformacionContacto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactoClienteEmpresarial", propOrder = {
    "identificacionContacto",
    "informacionContacto"
})
public class ContactoClienteEmpresarial {

    @XmlElement(required = true)
    protected DatosIdentificacion identificacionContacto;
    @XmlElement(required = true)
    protected InformacionContacto informacionContacto;

    /**
     * Obtiene el valor de la propiedad identificacionContacto.
     * 
     * @return
     *     possible object is
     *     {@link DatosIdentificacion }
     *     
     */
    public DatosIdentificacion getIdentificacionContacto() {
        return identificacionContacto;
    }

    /**
     * Define el valor de la propiedad identificacionContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosIdentificacion }
     *     
     */
    public void setIdentificacionContacto(DatosIdentificacion value) {
        this.identificacionContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionContacto.
     * 
     * @return
     *     possible object is
     *     {@link InformacionContacto }
     *     
     */
    public InformacionContacto getInformacionContacto() {
        return informacionContacto;
    }

    /**
     * Define el valor de la propiedad informacionContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionContacto }
     *     
     */
    public void setInformacionContacto(InformacionContacto value) {
        this.informacionContacto = value;
    }

}
