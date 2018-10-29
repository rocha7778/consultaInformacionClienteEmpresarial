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
 * <p>Clase Java para ConsultarInformacionFinancieraResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarInformacionFinancieraResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionFinanciera" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}InformacionFinancieraClienteEmpresarial"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarInformacionFinancieraResponse", propOrder = {
    "informacionFinanciera"
})
public class ConsultarInformacionFinancieraResponse {

    @XmlElement(required = true)
    protected InformacionFinancieraClienteEmpresarial informacionFinanciera;

    /**
     * Obtiene el valor de la propiedad informacionFinanciera.
     * 
     * @return
     *     possible object is
     *     {@link InformacionFinancieraClienteEmpresarial }
     *     
     */
    public InformacionFinancieraClienteEmpresarial getInformacionFinanciera() {
        return informacionFinanciera;
    }

    /**
     * Define el valor de la propiedad informacionFinanciera.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionFinancieraClienteEmpresarial }
     *     
     */
    public void setInformacionFinanciera(InformacionFinancieraClienteEmpresarial value) {
        this.informacionFinanciera = value;
    }

}
