package com.epam.traning.buyit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_address", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_address;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "contacts_id")
	private Contact contact;

	@Column(name = "region", length = 45)
	private String region;

	@Column(name = "city", length = 45)
	private String city;

	@Column(name = "street", length = 45)
	private String street;

	@Column(name = "house", length = 45)
	private String house;

	@Column(name = "flat", length = 45)
	private String flat;

	@Column(name = "zip_code", length = 45)
	private String zipCode;

	public int getId_address() {
		return id_address;
	}

	public void setId_address(int id_address) {
		this.id_address = id_address;
	}

	public String getRegion() {
		return region;
	}

	public Address setRegion(String region) {
		this.region = region;
		return this;
	}

	public String getCity() {
		return city;
	}

	public Address setCity(String city) {
		this.city = city;
		return this;
	}

	public String getStreet() {
		return street;
	}

	public Address setStreet(String street) {
		this.street = street;
		return this;
	}

	public String getHouse() {
		return house;
	}

	public Address setHouse(String house) {
		this.house = house;
		return this;
	}

	public String getFlat() {
		return flat;
	}

	public Address setFlat(String flat) {
		this.flat = flat;
		return this;
	}

	public String getZipCode() {
		return zipCode;
	}

	public Address setZipCode(String zipCode) {
		this.zipCode = zipCode;
		return this;
	}

	public Contact getContact() {
		return contact;
	}

	public Address setContact(Contact contact) {
		this.contact = contact;
		return this;
	}

	@Override
	public String toString() {
		return "Address [id_address=" + id_address + ", contactId=" + contact
				+ ", region=" + region + ", city=" + city + ", street="
				+ street + ", house=" + house + ", flat=" + flat + ", zipCode="
				+ zipCode + "]";
	}

}
