//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 09:10:02 AM IST 
//

package tech.ecoa.osets.model.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A set of data types in a library
 * 
 * <p>
 * Java class for Library complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Library">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ecoa.technology/types-1.0}use" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="types" type="{http://www.ecoa.technology/types-1.0}DataTypes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Library", propOrder = { "use", "types" })
public class Library {

	protected List<Use> use;
	@XmlElement(required = true)
	protected DataTypes types;

	/**
	 * Gets the value of the use property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the use property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getUse().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Use }
	 * 
	 * 
	 */
	public List<Use> getUse() {
		if (use == null) {
			use = new ArrayList<Use>();
		}
		return this.use;
	}

	/**
	 * Gets the value of the types property.
	 * 
	 * @return possible object is {@link DataTypes }
	 * 
	 */
	public DataTypes getTypes() {
		return types;
	}

	/**
	 * Sets the value of the types property.
	 * 
	 * @param value
	 *            allowed object is {@link DataTypes }
	 * 
	 */
	public void setTypes(DataTypes value) {
		this.types = value;
	}

}