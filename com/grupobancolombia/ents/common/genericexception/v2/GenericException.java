//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.29 a las 04:54:51 PM COT 
//


package com.grupobancolombia.ents.common.genericexception.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * DV.2.0
 * Fecha creación	[ 2010-05-01 ]*
 * Fecha caducidad	[ AAAA-MM-DD ]*
 * Autor(es) 		[ Juan Jose Figueredo/Colombia/IBM@IBMCO, Jose Francisco Nanez/Colombia/Contr/IBM@IBMCO ]*
 * Estado 		[ Desarrollo Funcional, Desarrollo Técnico, Publicado,  ]*
 * Código Requerimiento  [  ]*
 * Versión Anterior             [ 1.0 ]
 * Versión Posterior           [  ]
 * Descripción 		[ Definición de entidad de negocio estándar, para el manejo de las excepciones ]			
 * Tipo de elemento de dato [ Compuesto ]
 * Requiere                        [ No Aplica ]
 * Es requerido por            [ No Aplica ]
 * Sustituye                        [ No Disponible ]
 * Es sustituido por            [ No Disponible ]
 * Correlación                    [ No Disponible ]
 * Comprobación               [ No Disponible ]
 * Unidad Organizacional a cargo
 *                       Nombre                            [ No Disponible ] 
 *                       Dependencia                   [ No Disponible ] 
 *                       Cargo                               [ No Disponible ] 
 *                       Em@l                               [ No Disponible ] 
 *                       Fuente                             [ No Disponible ] 
 *                       Fecha de publicación      [ No Disponible ] 
 * 
 * 
 * <p>Clase Java para GenericException complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GenericException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericException", propOrder = {
    "code",
    "description"
})
public class GenericException {

    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String description;

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
