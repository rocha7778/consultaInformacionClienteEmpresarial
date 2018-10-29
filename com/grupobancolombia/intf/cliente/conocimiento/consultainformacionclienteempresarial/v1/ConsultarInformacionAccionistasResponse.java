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
 * <p>Clase Java para ConsultarInformacionAccionistasResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarInformacionAccionistasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accionistas" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}AccionistasClienteEmpresarial"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarInformacionAccionistasResponse", propOrder = {
    "accionistas"
})
public class ConsultarInformacionAccionistasResponse {

    @XmlElement(required = true)
    protected AccionistasClienteEmpresarial accionistas;

    /**
     * Obtiene el valor de la propiedad accionistas.
     * 
     * @return
     *     possible object is
     *     {@link AccionistasClienteEmpresarial }
     *     
     */
    public AccionistasClienteEmpresarial getAccionistas() {
        return accionistas;
    }

    /**
     * Define el valor de la propiedad accionistas.
     * 
     * @param value
     *     allowed object is
     *     {@link AccionistasClienteEmpresarial }
     *     
     */
    public void setAccionistas(AccionistasClienteEmpresarial value) {
        this.accionistas = value;
    }

}
