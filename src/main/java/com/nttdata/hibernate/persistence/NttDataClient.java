package com.nttdata.hibernate.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * HIBERNATE - TALLER 1
 * 
 * ENTITY OF TABLE NTTDATA_CLIENT
 * 
 * @author DarknessYamii
 *
 */

@Entity
@Table(name = "NTTDATA_CLIENT")
public class NttDataClient extends AbstractEntity implements Serializable {

	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** Identificador (PK) */
	private Long ID;

	/** Name */
	private String name;

	/** First Name */
	private String firstName;

	/** Second Name */
	private String secondName;

	/** DNI */
	private String DNI;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getID() {
		return ID;
	}

	/**
	 * @param ID the ID to set
	 */
	public void setID(Long ID) {
		this.ID = ID;
	}

	/**
	 * @return Name
	 */

	@Column(name = "NAME", nullable = false)
	public String getName() {
		return name;
	}

	/**
	 * @param Name the Name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return firstName
	 */
	@Column(name = "FIRST_NAME", nullable = false)
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return seconName
	 */
	@Column(name = "SECOND_NAME", nullable = false)
	public String getSecondName() {
		return secondName;
	}

	/**
	 * @param secondName the secondName to set
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	/**
	 * @return DNI
	 */
	@Column(name = "DNI", nullable = false, unique = true, length = 9)
	public String getDNI() {
		return DNI;
	}

	/**
	 * @param DNI the DNI to set
	 */
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	@Transient
	public Class<?> getClase() {
		return NttDataClient.class;
	}

}
