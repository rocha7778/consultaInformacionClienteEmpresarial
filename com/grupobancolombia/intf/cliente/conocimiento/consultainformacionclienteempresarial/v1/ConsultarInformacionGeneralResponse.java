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
 * <p>Clase Java para ConsultarInformacionGeneralResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarInformacionGeneralResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaModificacion" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fechaUltimaModificacion" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="centroDeDecision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gerenciado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="justificacionNoGerenciado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipologiaCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estadoVinculacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciiu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subciiu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sectorEconomico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subSectorEconomico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estrategiaSectorial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estadoCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grupoEconomico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="calificacionInterna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rolNegocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="segmento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subSegmento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extractoVirtual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificadorCelula" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="grupoRiesgo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificadoNoAccionistas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contextoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineasNegocio" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}LineasDeNegocio" minOccurs="0"/>
 *         &lt;element name="reporteCostosVirtual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informacionDireccion" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}DatosDireccion"/>
 *         &lt;element name="numeroTelefonico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informacionGerente" type="{http://grupobancolombia.com/intf/Cliente/Conocimiento/ConsultaInformacionClienteEmpresarial/V1.0}InformacionGerenteType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarInformacionGeneralResponse", propOrder = {
    "nombreCliente",
    "fechaModificacion",
    "fechaUltimaModificacion",
    "centroDeDecision",
    "gerenciado",
    "justificacionNoGerenciado",
    "tipoCliente",
    "tipologiaCliente",
    "estadoVinculacion",
    "ciiu",
    "subciiu",
    "sectorEconomico",
    "subSectorEconomico",
    "estrategiaSectorial",
    "estadoCliente",
    "grupoEconomico",
    "calificacionInterna",
    "rolNegocio",
    "segmento",
    "subSegmento",
    "extractoVirtual",
    "identificadorCelula",
    "grupoRiesgo",
    "certificadoNoAccionistas",
    "contextoCliente",
    "lineasNegocio",
    "reporteCostosVirtual",
    "informacionDireccion",
    "numeroTelefonico",
    "informacionGerente"
})
public class ConsultarInformacionGeneralResponse {

    protected String nombreCliente;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaModificacion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaModificacion;
    @XmlElement(required = true)
    protected String centroDeDecision;
    @XmlElement(required = true)
    protected String gerenciado;
    @XmlElement(required = true)
    protected String justificacionNoGerenciado;
    @XmlElement(required = true)
    protected String tipoCliente;
    @XmlElement(required = true)
    protected String tipologiaCliente;
    @XmlElement(required = true)
    protected String estadoVinculacion;
    @XmlElement(required = true)
    protected String ciiu;
    protected int subciiu;
    @XmlElement(required = true)
    protected String sectorEconomico;
    @XmlElement(required = true)
    protected String subSectorEconomico;
    @XmlElement(required = true)
    protected String estrategiaSectorial;
    @XmlElement(required = true)
    protected String estadoCliente;
    @XmlElement(required = true)
    protected String grupoEconomico;
    protected String calificacionInterna;
    @XmlElement(required = true)
    protected String rolNegocio;
    @XmlElement(required = true)
    protected String segmento;
    @XmlElement(required = true)
    protected String subSegmento;
    @XmlElement(required = true)
    protected String extractoVirtual;
    protected int identificadorCelula;
    protected String grupoRiesgo;
    protected String certificadoNoAccionistas;
    protected String contextoCliente;
    protected LineasDeNegocio lineasNegocio;
    @XmlElement(required = true)
    protected String reporteCostosVirtual;
    @XmlElement(required = true)
    protected DatosDireccion informacionDireccion;
    @XmlElement(required = true)
    protected String numeroTelefonico;
    @XmlElement(required = true)
    protected InformacionGerenteType informacionGerente;

    /**
     * Obtiene el valor de la propiedad nombreCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Define el valor de la propiedad nombreCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCliente(String value) {
        this.nombreCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaModificacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Define el valor de la propiedad fechaModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaModificacion(XMLGregorianCalendar value) {
        this.fechaModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaModificacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    /**
     * Define el valor de la propiedad fechaUltimaModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaModificacion(XMLGregorianCalendar value) {
        this.fechaUltimaModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad centroDeDecision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroDeDecision() {
        return centroDeDecision;
    }

    /**
     * Define el valor de la propiedad centroDeDecision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroDeDecision(String value) {
        this.centroDeDecision = value;
    }

    /**
     * Obtiene el valor de la propiedad gerenciado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGerenciado() {
        return gerenciado;
    }

    /**
     * Define el valor de la propiedad gerenciado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGerenciado(String value) {
        this.gerenciado = value;
    }

    /**
     * Obtiene el valor de la propiedad justificacionNoGerenciado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificacionNoGerenciado() {
        return justificacionNoGerenciado;
    }

    /**
     * Define el valor de la propiedad justificacionNoGerenciado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificacionNoGerenciado(String value) {
        this.justificacionNoGerenciado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * Define el valor de la propiedad tipoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCliente(String value) {
        this.tipoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipologiaCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipologiaCliente() {
        return tipologiaCliente;
    }

    /**
     * Define el valor de la propiedad tipologiaCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipologiaCliente(String value) {
        this.tipologiaCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoVinculacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoVinculacion() {
        return estadoVinculacion;
    }

    /**
     * Define el valor de la propiedad estadoVinculacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoVinculacion(String value) {
        this.estadoVinculacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ciiu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiiu() {
        return ciiu;
    }

    /**
     * Define el valor de la propiedad ciiu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiiu(String value) {
        this.ciiu = value;
    }

    /**
     * Obtiene el valor de la propiedad subciiu.
     * 
     */
    public int getSubciiu() {
        return subciiu;
    }

    /**
     * Define el valor de la propiedad subciiu.
     * 
     */
    public void setSubciiu(int value) {
        this.subciiu = value;
    }

    /**
     * Obtiene el valor de la propiedad sectorEconomico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorEconomico() {
        return sectorEconomico;
    }

    /**
     * Define el valor de la propiedad sectorEconomico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorEconomico(String value) {
        this.sectorEconomico = value;
    }

    /**
     * Obtiene el valor de la propiedad subSectorEconomico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSectorEconomico() {
        return subSectorEconomico;
    }

    /**
     * Define el valor de la propiedad subSectorEconomico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSectorEconomico(String value) {
        this.subSectorEconomico = value;
    }

    /**
     * Obtiene el valor de la propiedad estrategiaSectorial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstrategiaSectorial() {
        return estrategiaSectorial;
    }

    /**
     * Define el valor de la propiedad estrategiaSectorial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstrategiaSectorial(String value) {
        this.estrategiaSectorial = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCliente() {
        return estadoCliente;
    }

    /**
     * Define el valor de la propiedad estadoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCliente(String value) {
        this.estadoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad grupoEconomico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupoEconomico() {
        return grupoEconomico;
    }

    /**
     * Define el valor de la propiedad grupoEconomico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupoEconomico(String value) {
        this.grupoEconomico = value;
    }

    /**
     * Obtiene el valor de la propiedad calificacionInterna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalificacionInterna() {
        return calificacionInterna;
    }

    /**
     * Define el valor de la propiedad calificacionInterna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalificacionInterna(String value) {
        this.calificacionInterna = value;
    }

    /**
     * Obtiene el valor de la propiedad rolNegocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolNegocio() {
        return rolNegocio;
    }

    /**
     * Define el valor de la propiedad rolNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolNegocio(String value) {
        this.rolNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad segmento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmento() {
        return segmento;
    }

    /**
     * Define el valor de la propiedad segmento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmento(String value) {
        this.segmento = value;
    }

    /**
     * Obtiene el valor de la propiedad subSegmento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSegmento() {
        return subSegmento;
    }

    /**
     * Define el valor de la propiedad subSegmento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSegmento(String value) {
        this.subSegmento = value;
    }

    /**
     * Obtiene el valor de la propiedad extractoVirtual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtractoVirtual() {
        return extractoVirtual;
    }

    /**
     * Define el valor de la propiedad extractoVirtual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtractoVirtual(String value) {
        this.extractoVirtual = value;
    }

    /**
     * Obtiene el valor de la propiedad identificadorCelula.
     * 
     */
    public int getIdentificadorCelula() {
        return identificadorCelula;
    }

    /**
     * Define el valor de la propiedad identificadorCelula.
     * 
     */
    public void setIdentificadorCelula(int value) {
        this.identificadorCelula = value;
    }

    /**
     * Obtiene el valor de la propiedad grupoRiesgo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupoRiesgo() {
        return grupoRiesgo;
    }

    /**
     * Define el valor de la propiedad grupoRiesgo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupoRiesgo(String value) {
        this.grupoRiesgo = value;
    }

    /**
     * Obtiene el valor de la propiedad certificadoNoAccionistas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificadoNoAccionistas() {
        return certificadoNoAccionistas;
    }

    /**
     * Define el valor de la propiedad certificadoNoAccionistas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificadoNoAccionistas(String value) {
        this.certificadoNoAccionistas = value;
    }

    /**
     * Obtiene el valor de la propiedad contextoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextoCliente() {
        return contextoCliente;
    }

    /**
     * Define el valor de la propiedad contextoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextoCliente(String value) {
        this.contextoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad lineasNegocio.
     * 
     * @return
     *     possible object is
     *     {@link LineasDeNegocio }
     *     
     */
    public LineasDeNegocio getLineasNegocio() {
        return lineasNegocio;
    }

    /**
     * Define el valor de la propiedad lineasNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link LineasDeNegocio }
     *     
     */
    public void setLineasNegocio(LineasDeNegocio value) {
        this.lineasNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad reporteCostosVirtual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporteCostosVirtual() {
        return reporteCostosVirtual;
    }

    /**
     * Define el valor de la propiedad reporteCostosVirtual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporteCostosVirtual(String value) {
        this.reporteCostosVirtual = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionDireccion.
     * 
     * @return
     *     possible object is
     *     {@link DatosDireccion }
     *     
     */
    public DatosDireccion getInformacionDireccion() {
        return informacionDireccion;
    }

    /**
     * Define el valor de la propiedad informacionDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosDireccion }
     *     
     */
    public void setInformacionDireccion(DatosDireccion value) {
        this.informacionDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTelefonico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    /**
     * Define el valor de la propiedad numeroTelefonico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTelefonico(String value) {
        this.numeroTelefonico = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionGerente.
     * 
     * @return
     *     possible object is
     *     {@link InformacionGerenteType }
     *     
     */
    public InformacionGerenteType getInformacionGerente() {
        return informacionGerente;
    }

    /**
     * Define el valor de la propiedad informacionGerente.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionGerenteType }
     *     
     */
    public void setInformacionGerente(InformacionGerenteType value) {
        this.informacionGerente = value;
    }

}
