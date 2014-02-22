package com.epam.traning.buyit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "idProduct")
	@GeneratedValue
	private int idProduct;
	@Column(name = "name")
	private String name;
	@Column(name = "subCategoryId")
	private int subCategoryId;
	@Column(name = "userId")
	private int userId;
	@Column(name = "delivery")
	private String delivery;
	@Column(name = "deleted")
	private boolean deleted;
	@Column(name = "description")
	private Description description;
	@Column(name = "auction")
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

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public Product setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
		return this;
	}

	public int getUserId() {
		return userId;
	}

	public Product setUserId(int userId) {
		this.userId = userId;
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

	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(idProduct).append(" name: ").append(name);
		return string.toString();
	}

	public Auction getAuction() {
		return auction;
	}

	public Product setAuction(Auction auction) {
		this.auction = auction;
		return this;
	}

}
