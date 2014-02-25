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
import javax.persistence.Transient;

@Entity
@Table(name = "contacts")
public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_contact", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idContact;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user", nullable = false)
	@Column(name = "user_id")
	private User user;

	@Column(name = "email", nullable = false, length = 45)
	private String email;

	@Column(name = "phone", length = 45)
	private String phone;

	@Transient
	@OneToOne(mappedBy = "address", fetch = FetchType.EAGER)
	private Address address;

	public int getIdContact() {
		return idContact;
	}

	public Contact setIdContact(int idContacts) {
		this.idContact = idContacts;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Contact setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public Contact setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public Address getAddress() {
		return address;
	}

	public Contact setAddress(Address address) {
		this.address = address;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(user).append(" email: ").append(email)
				.append(" phone: ").append(phone);
		return string.toString();
	}

	public User getUser() {
		return user;
	}

	public void setUserId(User user) {
		this.user = user;
	}

}
