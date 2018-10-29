//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.29 a las 04:31:01 PM COT 
//


package com.grupobancolombia.intf.cliente.conocimiento.consultainformacionclienteempresarial.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProductoClienteEmpresarial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProductoClienteEmpresarial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="montoProducto">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;pattern value="[\-+]?[0-9]{1,20}[.][0-9]{0,5}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionProducto" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}DatosDireccion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductoClienteEmpresarial", propOrder = {
    "nombreProducto",
    "tipoProducto",
    "numeroProducto",
    "montoProducto",
    "moneda",
    "direccionProducto"
})
public class ProductoClienteEmpresarial {

    @XmlElement(required = true)
    protected String nombreProducto;
    @XmlElement(required = true)
    protected String tipoProducto;
    @XmlElement(required = true)
    protected String numeroProducto;
    @XmlElement(required = true)
    protected BigDecimal montoProducto;
    protected String moneda;
    protected DatosDireccion direccionProducto;

    /**
     * Obtiene el valor de la propiedad nombreProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Define el valor de la propiedad nombreProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProducto(String value) {
        this.nombreProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProducto() {
        return tipoProducto;
    }

    /**
     * Define el valor de la propiedad tipoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProducto(String value) {
        this.tipoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProducto() {
        return numeroProducto;
    }

    /**
     * Define el valor de la propiedad numeroProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProducto(String value) {
        this.numeroProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad montoProducto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoProducto() {
        return montoProducto;
    }

    /**
     * Define el valor de la propiedad montoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoProducto(BigDecimal value) {
        this.montoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionProducto.
     * 
     * @return
     *     possible object is
     *     {@link DatosDireccion }
     *     
     */
    public DatosDireccion getDireccionProducto() {
        return direccionProducto;
    }

    /**
     * Define el valor de la propiedad direccionProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosDireccion }
     *     
     */
    public void setDireccionProducto(DatosDireccion value) {
        this.direccionProducto = value;
    }

}
