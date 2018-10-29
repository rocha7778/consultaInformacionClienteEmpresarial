//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.29 a las 04:31:01 PM COT 
//


package com.grupobancolombia.intf.cliente.conocimiento.consultainformacionclienteempresarial.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccionistasClienteEmpresarial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccionistasClienteEmpresarial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accionista" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}AccionistaClienteEmpresarial" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccionistasClienteEmpresarial", propOrder = {
    "accionista"
})
public class AccionistasClienteEmpresarial {

    @XmlElement(required = true)
    protected List<AccionistaClienteEmpresarial> accionista;

    /**
     * Gets the value of the accionista property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accionista property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccionista().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccionistaClienteEmpresarial }
     * 
     * 
     */
    public List<AccionistaClienteEmpresarial> getAccionista() {
        if (accionista == null) {
            accionista = new ArrayList<AccionistaClienteEmpresarial>();
        }
        return this.accionista;
    }

}
