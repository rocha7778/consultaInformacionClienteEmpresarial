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
 * <p>Clase Java para ConsultarInformacionAccionistas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarInformacionAccionistas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionCliente" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}DatosIdentificacion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarInformacionAccionistas", propOrder = {
    "identificacionCliente"
})
public class ConsultarInformacionAccionistas {

    @XmlElement(required = true)
    protected DatosIdentificacion identificacionCliente;

    /**
     * Obtiene el valor de la propiedad identificacionCliente.
     * 
     * @return
     *     possible object is
     *     {@link DatosIdentificacion }
     *     
     */
    public DatosIdentificacion getIdentificacionCliente() {
        return identificacionCliente;
    }

    /**
     * Define el valor de la propiedad identificacionCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosIdentificacion }
     *     
     */
    public void setIdentificacionCliente(DatosIdentificacion value) {
        this.identificacionCliente = value;
    }

}
