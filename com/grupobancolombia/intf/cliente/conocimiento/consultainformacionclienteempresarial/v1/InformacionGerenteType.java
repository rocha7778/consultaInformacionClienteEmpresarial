//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.29 a las 04:54:51 PM COT 
//


package com.grupobancolombia.intf.cliente.conocimiento.consultainformacionclienteempresarial.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InformacionGerenteType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InformacionGerenteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreGerente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineasNegocioGerente" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}LineasNegocioGerenteType" minOccurs="0"/>
 *         &lt;element name="cargoGerente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informacionAsistenteGerente" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}InformacionAsistenteGerenteType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionGerenteType", propOrder = {
    "nombreGerente",
    "lineasNegocioGerente",
    "cargoGerente",
    "informacionAsistenteGerente"
})
public class InformacionGerenteType {

    @XmlElement(required = true)
    protected String nombreGerente;
    protected LineasNegocioGerenteType lineasNegocioGerente;
    @XmlElement(required = true)
    protected String cargoGerente;
    protected List<InformacionAsistenteGerenteType> informacionAsistenteGerente;

    /**
     * Obtiene el valor de la propiedad nombreGerente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreGerente() {
        return nombreGerente;
    }

    /**
     * Define el valor de la propiedad nombreGerente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreGerente(String value) {
        this.nombreGerente = value;
    }

    /**
     * Obtiene el valor de la propiedad lineasNegocioGerente.
     * 
     * @return
     *     possible object is
     *     {@link LineasNegocioGerenteType }
     *     
     */
    public LineasNegocioGerenteType getLineasNegocioGerente() {
        return lineasNegocioGerente;
    }

    /**
     * Define el valor de la propiedad lineasNegocioGerente.
     * 
     * @param value
     *     allowed object is
     *     {@link LineasNegocioGerenteType }
     *     
     */
    public void setLineasNegocioGerente(LineasNegocioGerenteType value) {
        this.lineasNegocioGerente = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoGerente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoGerente() {
        return cargoGerente;
    }

    /**
     * Define el valor de la propiedad cargoGerente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoGerente(String value) {
        this.cargoGerente = value;
    }

    /**
     * Gets the value of the informacionAsistenteGerente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informacionAsistenteGerente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformacionAsistenteGerente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformacionAsistenteGerenteType }
     * 
     * 
     */
    public List<InformacionAsistenteGerenteType> getInformacionAsistenteGerente() {
        if (informacionAsistenteGerente == null) {
            informacionAsistenteGerente = new ArrayList<InformacionAsistenteGerenteType>();
        }
        return this.informacionAsistenteGerente;
    }

}
