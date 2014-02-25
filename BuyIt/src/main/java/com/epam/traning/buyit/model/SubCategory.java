package com.epam.traning.buyit.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "sub_categories")
public class SubCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_sub_category")
	@GeneratedValue
	private int idSubCategory;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "category_id")
	@JoinColumn(name = "id_category")
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private Category category;
	
	@Transient
	@OneToMany(mappedBy = "subCategory", fetch = FetchType.LAZY)
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

	public Category getCategory() {
		return category;
	}

	public SubCategory setCategory(Category category) {
		this.category = category;
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
