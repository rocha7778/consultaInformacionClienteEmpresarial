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
 * <p>Clase Java para ConsultarInformacionMiembrosJuntaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarInformacionMiembrosJuntaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="miembrosDeJunta" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}MiembrosDeJuntaClienteEmpresarial"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarInformacionMiembrosJuntaResponse", propOrder = {
    "miembrosDeJunta"
})
public class ConsultarInformacionMiembrosJuntaResponse {

    @XmlElement(required = true)
    protected MiembrosDeJuntaClienteEmpresarial miembrosDeJunta;

    /**
     * Obtiene el valor de la propiedad miembrosDeJunta.
     * 
     * @return
     *     possible object is
     *     {@link MiembrosDeJuntaClienteEmpresarial }
     *     
     */
    public MiembrosDeJuntaClienteEmpresarial getMiembrosDeJunta() {
        return miembrosDeJunta;
    }

    /**
     * Define el valor de la propiedad miembrosDeJunta.
     * 
     * @param value
     *     allowed object is
     *     {@link MiembrosDeJuntaClienteEmpresarial }
     *     
     */
    public void setMiembrosDeJunta(MiembrosDeJuntaClienteEmpresarial value) {
        this.miembrosDeJunta = value;
    }

}
