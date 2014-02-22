package com.epam.traning.buyit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "contactId")
	@GeneratedValue
	private int contactId;
	@Column(name = "region")
	private String region;
	@Column(name = "city")
	private String city;
	@Column(name = "street")
	private String street;
	@Column(name = "house")
	private String house;
	@Column(name = "flat")
	private String flat;
	@Column(name = "zipCode")
	private String zipCode;

	public int getContactId() {
		return contactId;
	}

	public Address setContactId(int contactId) {
		this.contactId = contactId;
		return this;
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

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(contactId).append(" region: ").append(region)
				.append(" city: ").append(city).append(" street: ")
				.append(street).append(" house: ").append(house)
				.append(" zip code: ").append(zipCode);
		return string.toString();
	}
}
