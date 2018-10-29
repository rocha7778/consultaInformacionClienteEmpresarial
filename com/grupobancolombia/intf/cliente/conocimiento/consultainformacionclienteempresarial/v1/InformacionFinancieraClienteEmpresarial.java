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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para InformacionFinancieraClienteEmpresarial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InformacionFinancieraClienteEmpresarial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ventasAnuales" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;pattern value="[\-+]?[0-9]{1,17}[.][0-9]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="activos" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;pattern value="[\-+]?[0-9]{1,17}[.][0-9]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="egresos" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;pattern value="[\-+]?[0-9]{1,17}[.][0-9]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pasivos" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;pattern value="[\-+]?[0-9]{1,17}[.][0-9]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ingresosNoOperacionales" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;pattern value="[\-+]?[0-9]{1,17}[.][0-9]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ingresosOperacionales" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;pattern value="[\-+]?[0-9]{1,17}[.][0-9]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fechaActualizacionVentas" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="naturalezaTributaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origenesDeBienes" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}OrigenesDeBienes" minOccurs="0"/>
 *         &lt;element name="origenesDeRecursos" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}OrigenesDeRecursos" minOccurs="0"/>
 *         &lt;element name="otroOrigenDeBienes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otroOrigenDeRecursos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisOrigenFondos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudadOrigenFondos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoOperacionesNoInternacionales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operacionesMonedaExtranjera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otraOperacionMonedaExtranjera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operacionesMonedaExt" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}OperacionesMonedaExt" minOccurs="0"/>
 *         &lt;element name="lineasDeNegocio" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}LineasDeNegocio" minOccurs="0"/>
 *         &lt;element name="productos" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}ProductosClienteEmpresarial" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionFinancieraClienteEmpresarial", propOrder = {
    "ventasAnuales",
    "activos",
    "egresos",
    "pasivos",
    "ingresosNoOperacionales",
    "ingresosOperacionales",
    "fechaActualizacionVentas",
    "naturalezaTributaria",
    "origenesDeBienes",
    "origenesDeRecursos",
    "otroOrigenDeBienes",
    "otroOrigenDeRecursos",
    "paisOrigenFondos",
    "ciudadOrigenFondos",
    "montoOperacionesNoInternacionales",
    "operacionesMonedaExtranjera",
    "otraOperacionMonedaExtranjera",
    "operacionesMonedaExt",
    "lineasDeNegocio",
    "productos"
})
public class InformacionFinancieraClienteEmpresarial {

    protected BigDecimal ventasAnuales;
    protected BigDecimal activos;
    protected BigDecimal egresos;
    protected BigDecimal pasivos;
    protected BigDecimal ingresosNoOperacionales;
    protected BigDecimal ingresosOperacionales;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaActualizacionVentas;
    protected String naturalezaTributaria;
    protected OrigenesDeBienes origenesDeBienes;
    protected OrigenesDeRecursos origenesDeRecursos;
    protected String otroOrigenDeBienes;
    protected String otroOrigenDeRecursos;
    protected String paisOrigenFondos;
    protected String ciudadOrigenFondos;
    protected String montoOperacionesNoInternacionales;
    protected String operacionesMonedaExtranjera;
    protected String otraOperacionMonedaExtranjera;
    protected OperacionesMonedaExt operacionesMonedaExt;
    protected LineasDeNegocio lineasDeNegocio;
    protected ProductosClienteEmpresarial productos;

    /**
     * Obtiene el valor de la propiedad ventasAnuales.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVentasAnuales() {
        return ventasAnuales;
    }

    /**
     * Define el valor de la propiedad ventasAnuales.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVentasAnuales(BigDecimal value) {
        this.ventasAnuales = value;
    }

    /**
     * Obtiene el valor de la propiedad activos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActivos() {
        return activos;
    }

    /**
     * Define el valor de la propiedad activos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActivos(BigDecimal value) {
        this.activos = value;
    }

    /**
     * Obtiene el valor de la propiedad egresos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEgresos() {
        return egresos;
    }

    /**
     * Define el valor de la propiedad egresos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEgresos(BigDecimal value) {
        this.egresos = value;
    }

    /**
     * Obtiene el valor de la propiedad pasivos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPasivos() {
        return pasivos;
    }

    /**
     * Define el valor de la propiedad pasivos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPasivos(BigDecimal value) {
        this.pasivos = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresosNoOperacionales.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosNoOperacionales() {
        return ingresosNoOperacionales;
    }

    /**
     * Define el valor de la propiedad ingresosNoOperacionales.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosNoOperacionales(BigDecimal value) {
        this.ingresosNoOperacionales = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresosOperacionales.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosOperacionales() {
        return ingresosOperacionales;
    }

    /**
     * Define el valor de la propiedad ingresosOperacionales.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosOperacionales(BigDecimal value) {
        this.ingresosOperacionales = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActualizacionVentas.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActualizacionVentas() {
        return fechaActualizacionVentas;
    }

    /**
     * Define el valor de la propiedad fechaActualizacionVentas.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActualizacionVentas(XMLGregorianCalendar value) {
        this.fechaActualizacionVentas = value;
    }

    /**
     * Obtiene el valor de la propiedad naturalezaTributaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalezaTributaria() {
        return naturalezaTributaria;
    }

    /**
     * Define el valor de la propiedad naturalezaTributaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturalezaTributaria(String value) {
        this.naturalezaTributaria = value;
    }

    /**
     * Obtiene el valor de la propiedad origenesDeBienes.
     * 
     * @return
     *     possible object is
     *     {@link OrigenesDeBienes }
     *     
     */
    public OrigenesDeBienes getOrigenesDeBienes() {
        return origenesDeBienes;
    }

    /**
     * Define el valor de la propiedad origenesDeBienes.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigenesDeBienes }
     *     
     */
    public void setOrigenesDeBienes(OrigenesDeBienes value) {
        this.origenesDeBienes = value;
    }

    /**
     * Obtiene el valor de la propiedad origenesDeRecursos.
     * 
     * @return
     *     possible object is
     *     {@link OrigenesDeRecursos }
     *     
     */
    public OrigenesDeRecursos getOrigenesDeRecursos() {
        return origenesDeRecursos;
    }

    /**
     * Define el valor de la propiedad origenesDeRecursos.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigenesDeRecursos }
     *     
     */
    public void setOrigenesDeRecursos(OrigenesDeRecursos value) {
        this.origenesDeRecursos = value;
    }

    /**
     * Obtiene el valor de la propiedad otroOrigenDeBienes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtroOrigenDeBienes() {
        return otroOrigenDeBienes;
    }

    /**
     * Define el valor de la propiedad otroOrigenDeBienes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtroOrigenDeBienes(String value) {
        this.otroOrigenDeBienes = value;
    }

    /**
     * Obtiene el valor de la propiedad otroOrigenDeRecursos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtroOrigenDeRecursos() {
        return otroOrigenDeRecursos;
    }

    /**
     * Define el valor de la propiedad otroOrigenDeRecursos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtroOrigenDeRecursos(String value) {
        this.otroOrigenDeRecursos = value;
    }

    /**
     * Obtiene el valor de la propiedad paisOrigenFondos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisOrigenFondos() {
        return paisOrigenFondos;
    }

    /**
     * Define el valor de la propiedad paisOrigenFondos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigenFondos(String value) {
        this.paisOrigenFondos = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadOrigenFondos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadOrigenFondos() {
        return ciudadOrigenFondos;
    }

    /**
     * Define el valor de la propiedad ciudadOrigenFondos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadOrigenFondos(String value) {
        this.ciudadOrigenFondos = value;
    }

    /**
     * Obtiene el valor de la propiedad montoOperacionesNoInternacionales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoOperacionesNoInternacionales() {
        return montoOperacionesNoInternacionales;
    }

    /**
     * Define el valor de la propiedad montoOperacionesNoInternacionales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoOperacionesNoInternacionales(String value) {
        this.montoOperacionesNoInternacionales = value;
    }

    /**
     * Obtiene el valor de la propiedad operacionesMonedaExtranjera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacionesMonedaExtranjera() {
        return operacionesMonedaExtranjera;
    }

    /**
     * Define el valor de la propiedad operacionesMonedaExtranjera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacionesMonedaExtranjera(String value) {
        this.operacionesMonedaExtranjera = value;
    }

    /**
     * Obtiene el valor de la propiedad otraOperacionMonedaExtranjera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtraOperacionMonedaExtranjera() {
        return otraOperacionMonedaExtranjera;
    }

    /**
     * Define el valor de la propiedad otraOperacionMonedaExtranjera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtraOperacionMonedaExtranjera(String value) {
        this.otraOperacionMonedaExtranjera = value;
    }

    /**
     * Obtiene el valor de la propiedad operacionesMonedaExt.
     * 
     * @return
     *     possible object is
     *     {@link OperacionesMonedaExt }
     *     
     */
    public OperacionesMonedaExt getOperacionesMonedaExt() {
        return operacionesMonedaExt;
    }

    /**
     * Define el valor de la propiedad operacionesMonedaExt.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacionesMonedaExt }
     *     
     */
    public void setOperacionesMonedaExt(OperacionesMonedaExt value) {
        this.operacionesMonedaExt = value;
    }

    /**
     * Obtiene el valor de la propiedad lineasDeNegocio.
     * 
     * @return
     *     possible object is
     *     {@link LineasDeNegocio }
     *     
     */
    public LineasDeNegocio getLineasDeNegocio() {
        return lineasDeNegocio;
    }

    /**
     * Define el valor de la propiedad lineasDeNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link LineasDeNegocio }
     *     
     */
    public void setLineasDeNegocio(LineasDeNegocio value) {
        this.lineasDeNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad productos.
     * 
     * @return
     *     possible object is
     *     {@link ProductosClienteEmpresarial }
     *     
     */
    public ProductosClienteEmpresarial getProductos() {
        return productos;
    }

    /**
     * Define el valor de la propiedad productos.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductosClienteEmpresarial }
     *     
     */
    public void setProductos(ProductosClienteEmpresarial value) {
        this.productos = value;
    }

}
