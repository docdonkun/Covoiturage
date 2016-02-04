package kaszucar.model;
// Generated 4 f�vr. 2016 18:26:01 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name = "address", schema = "public")
public class Address implements java.io.Serializable {

	private int idAddress;
	private String address;
	private String complementAddress;
	private Short postalCode;
	private String country;

	public Address() {
	}

	public Address(int idAddress) {
		this.idAddress = idAddress;
	}

	public Address(int idAddress, String address, String complementAddress, Short postalCode, String country) {
		this.idAddress = idAddress;
		this.address = address;
		this.complementAddress = complementAddress;
		this.postalCode = postalCode;
		this.country = country;
	}

	@Id

	@Column(name = "id_address", unique = true, nullable = false)
	public int getIdAddress() {
		return this.idAddress;
	}

	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}

	@Column(name = "address", length = 1024)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "complement_address", length = 1024)
	public String getComplementAddress() {
		return this.complementAddress;
	}

	public void setComplementAddress(String complementAddress) {
		this.complementAddress = complementAddress;
	}

	@Column(name = "postal_code")
	public Short getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(Short postalCode) {
		this.postalCode = postalCode;
	}

	@Column(name = "country")
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
