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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para InformacionContacto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InformacionContacto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreContacto" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}NombreCompleto"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionContacto" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}DatosDireccion" minOccurs="0"/>
 *         &lt;element name="cargoContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informacionTelefono" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}InformacionTelefono"/>
 *         &lt;element name="estiloSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="funciones" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}FuncionesContacto" minOccurs="0"/>
 *         &lt;element name="lineasDeNegocio" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}LineasDeNegocio" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionContacto", propOrder = {
    "nombreContacto",
    "titulo",
    "fechaNacimiento",
    "genero",
    "direccionContacto",
    "cargoContacto",
    "email",
    "informacionTelefono",
    "estiloSocial",
    "tipoContacto",
    "funciones",
    "lineasDeNegocio",
    "estado",
    "area"
})
public class InformacionContacto {

    @XmlElement(required = true)
    protected NombreCompleto nombreContacto;
    protected String titulo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaNacimiento;
    protected String genero;
    protected DatosDireccion direccionContacto;
    protected String cargoContacto;
    protected String email;
    @XmlElement(required = true)
    protected InformacionTelefono informacionTelefono;
    protected String estiloSocial;
    protected String tipoContacto;
    protected FuncionesContacto funciones;
    protected LineasDeNegocio lineasDeNegocio;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected String area;

    /**
     * Obtiene el valor de la propiedad nombreContacto.
     * 
     * @return
     *     possible object is
     *     {@link NombreCompleto }
     *     
     */
    public NombreCompleto getNombreContacto() {
        return nombreContacto;
    }

    /**
     * Define el valor de la propiedad nombreContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link NombreCompleto }
     *     
     */
    public void setNombreContacto(NombreCompleto value) {
        this.nombreContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad genero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define el valor de la propiedad genero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionContacto.
     * 
     * @return
     *     possible object is
     *     {@link DatosDireccion }
     *     
     */
    public DatosDireccion getDireccionContacto() {
        return direccionContacto;
    }

    /**
     * Define el valor de la propiedad direccionContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosDireccion }
     *     
     */
    public void setDireccionContacto(DatosDireccion value) {
        this.direccionContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoContacto() {
        return cargoContacto;
    }

    /**
     * Define el valor de la propiedad cargoContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoContacto(String value) {
        this.cargoContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionTelefono.
     * 
     * @return
     *     possible object is
     *     {@link InformacionTelefono }
     *     
     */
    public InformacionTelefono getInformacionTelefono() {
        return informacionTelefono;
    }

    /**
     * Define el valor de la propiedad informacionTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionTelefono }
     *     
     */
    public void setInformacionTelefono(InformacionTelefono value) {
        this.informacionTelefono = value;
    }

    /**
     * Obtiene el valor de la propiedad estiloSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstiloSocial() {
        return estiloSocial;
    }

    /**
     * Define el valor de la propiedad estiloSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstiloSocial(String value) {
        this.estiloSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContacto() {
        return tipoContacto;
    }

    /**
     * Define el valor de la propiedad tipoContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoContacto(String value) {
        this.tipoContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad funciones.
     * 
     * @return
     *     possible object is
     *     {@link FuncionesContacto }
     *     
     */
    public FuncionesContacto getFunciones() {
        return funciones;
    }

    /**
     * Define el valor de la propiedad funciones.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionesContacto }
     *     
     */
    public void setFunciones(FuncionesContacto value) {
        this.funciones = value;
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
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad area.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Define el valor de la propiedad area.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

}
