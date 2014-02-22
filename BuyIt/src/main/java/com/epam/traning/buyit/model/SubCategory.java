package com.epam.traning.buyit.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="subCategory")
public class SubCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "idSubCategory")
	@GeneratedValue
	private int idSubCategory;
	@Column(name = "name")
	private String name;
	@Column(name = "categoryId")
	private int categoryId;
	@Column(name = "products")
	private List<Product> products;

	public SubCategory() {
		products = new ArrayList<Product>();
	}

	public int getIdSubCategory() {
		return idSubCategory;
	}

	public SubCategory setIdSubCategory(int idSubCategory) {
		this.idSubCategory = idSubCategory;
		return this;
	}

	public String getName() {
		return name;
	}

	public SubCategory setName(String name) {
		this.name = name;
		return this;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public SubCategory setCategoryId(int categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public Product getProduct(int number) {
		return products.get(number);
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(idSubCategory).append(" name: ").append(name);
		return string.toString();
	}
}
