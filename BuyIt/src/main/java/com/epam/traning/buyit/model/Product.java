package com.epam.traning.buyit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "products")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_product", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idProduct;

	@Column(name = "name", nullable = false, length = 45)
	private String name;

	@Column(name = "sub_category_id", nullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_sub_category")
	private SubCategory subCategory;

	@Column(name = "user_id", nullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user")
	private User user;

	@Column(name = "delivery")
	private String delivery;

	@Column(name = "deleted")
	private boolean deleted;

	@Transient
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "product")
	private Description description;

	@Transient
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "product")
	private Auction auction;

	public Product() {
		description = new Description();
		auction = new Auction();
	}

	public int getIdProduct() {
		return idProduct;
	}

	public Product setIdProduct(int idGood) {
		this.idProduct = idGood;
		return this;
	}

	public String getName() {
		return name;
	}

	public Product setName(String name) {
		this.name = name;
		return this;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public Product setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
		return this;
	}

	public User getUser() {
		return user;
	}

	public Product setUser(User user) {
		this.user = user;
		return this;
	}

	public String getDelivery() {
		return delivery;
	}

	public Product setDelivery(String delivery) {
		this.delivery = delivery;
		return this;
	}

	public boolean getDeleted() {
		return deleted;
	}

	public Product setDeleted(boolean deleted) {
		this.deleted = deleted;
		return this;
	}

	public Description getDescription() {
		return description;
	}

	public Product setDescription(Description description) {
		this.description = description;
		return this;
	}

	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", name=" + name
				+ ", subCategory=" + subCategory + ", user=" + user
				+ ", delivery=" + delivery + ", deleted=" + deleted
				+ ", description=" + description + ", auction=" + auction + "]";
	}

	public Auction getAuction() {
		return auction;
	}

	public Product setAuction(Auction auction) {
		this.auction = auction;
		return this;
	}

}
