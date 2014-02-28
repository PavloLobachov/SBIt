package com.epam.traning.buyit.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_user", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUser;

	@Column(name = "role", nullable = false)
	private boolean role;

	@Column(name = "first_name", length = 45, nullable = false)
	private String firstName;

	@Column(name = "last_name", length = 45, nullable = false)
	private String lastName;

	@Column(name = "login", length = 45, nullable = false)
	private String login;

	@Column(name = "password", length = 45, nullable = false)
	private String password;

	@Column(name = "avatar", length = 45)
	private String avatar;

	@Column(name = "ban")
	private Status ban;

	@Transient
	private Contact contact;

	@Transient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.REMOVE)
	private List<Product> productList;

	@Transient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<Bid> bidList;

	public User() {
		contact = new Contact();
	}

	public int getIdUser() {
		return idUser;
	}

	public User setIdUser(int idUser) {
		this.idUser = idUser;
		return this;
	}

	public boolean getRole() {
		return role;
	}

	public User setRole(boolean role) {
		this.role = role;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public User setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public User setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getLogin() {
		return login;
	}

	public User setLogin(String login) {
		this.login = login;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public User setPassword(String password) {
		this.password = password;
		return this;
	}

	public Contact getContact() {
		return contact;
	}

	public User setContact(Contact contact) {
		this.contact = contact;
		return this;
	}

	public String getAvatar() {
		return avatar;
	}

	public User setAvatar(String avatar) {
		this.avatar = avatar;
		return this;
	}

	public String getBan() {
		return ban.getStatus();
	}

	public User setBan(boolean ban) {
		this.ban = Status.geRoleByType(ban);
		return this;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public User setProductList(List<Product> productList) {
		this.productList = productList;
		return this;
	}

	public List<Bid> getBidList() {
		return bidList;
	}

	public User setBidList(List<Bid> bidList) {
		this.bidList = bidList;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(idUser).append(" role: ")
				.append(role ? " Admin" : " User").append(" first name: ")
				.append(firstName).append(" last name: ").append(lastName)
				.append(" login: ").append(login).append(" password: ")
				.append(password);
		return string.toString();
	}

}
