//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:11:58 AM BST 
//

package com.iawg.ecoa.jaxbclasses.projectConfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ConfigData complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APIConfig" type="{http://www.ecoa.technology/project-config-1.0}APIConfigData"/>
 *         &lt;element name="PlatformConfig" type="{http://www.ecoa.technology/project-config-1.0}PlatformConfigData"/>
 *         &lt;element name="precompiledComponents" type="{http://www.ecoa.technology/project-config-1.0}PrecompiledComponents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigData", propOrder = { "apiConfig", "platformConfig", "precompiledComponents" })
public class ConfigData {

	@XmlElement(name = "APIConfig", required = true)
	protected APIConfigData apiConfig;
	@XmlElement(name = "PlatformConfig", required = true)
	protected PlatformConfigData platformConfig;
	protected PrecompiledComponents precompiledComponents;

	/**
	 * Gets the value of the apiConfig property.
	 * 
	 * @return possible object is {@link APIConfigData }
	 * 
	 */
	public APIConfigData getAPIConfig() {
		return apiConfig;
	}

	/**
	 * Sets the value of the apiConfig property.
	 * 
	 * @param value
	 *            allowed object is {@link APIConfigData }
	 * 
	 */
	public void setAPIConfig(APIConfigData value) {
		this.apiConfig = value;
	}

	/**
	 * Gets the value of the platformConfig property.
	 * 
	 * @return possible object is {@link PlatformConfigData }
	 * 
	 */
	public PlatformConfigData getPlatformConfig() {
		return platformConfig;
	}

	/**
	 * Sets the value of the platformConfig property.
	 * 
	 * @param value
	 *            allowed object is {@link PlatformConfigData }
	 * 
	 */
	public void setPlatformConfig(PlatformConfigData value) {
		this.platformConfig = value;
	}

	/**
	 * Gets the value of the precompiledComponents property.
	 * 
	 * @return possible object is {@link PrecompiledComponents }
	 * 
	 */
	public PrecompiledComponents getPrecompiledComponents() {
		return precompiledComponents;
	}

	/**
	 * Sets the value of the precompiledComponents property.
	 * 
	 * @param value
	 *            allowed object is {@link PrecompiledComponents }
	 * 
	 */
	public void setPrecompiledComponents(PrecompiledComponents value) {
		this.precompiledComponents = value;
	}

}