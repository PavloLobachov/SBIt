package com.epam.traning.buyit.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
@Table(name = "categories")
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_category", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCategory;

	@Column(name = "name", length = 45)
	private String name;

	@Transient
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
	private List<SubCategory> listSubCategories;

	public Category() {
		this.listSubCategories = new ArrayList<SubCategory>();
	}

	public int getIdCategory() {
		return idCategory;
	}

	public Category setIdCategory(int idCategory) {
		this.idCategory = idCategory;
		return this;
	}

	public String getName() {
		return name;
	}

	public Category setName(String name) {
		this.name = name;
		return this;
	}

	public List<SubCategory> getListSubCategories() {
		return listSubCategories;
	}

	public Category setListSubCategories(List<SubCategory> listSubCategories) {
		this.listSubCategories = listSubCategories;
		return this;
	}

	public SubCategory getSubCutegory(int index) {
		return getListSubCategories().get(index);
	}

	public Category setSubCategory(SubCategory subCategory) {
		getListSubCategories().add(subCategory);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(idCategory).append(" name: ").append(name);
		return string.toString();
	}
}
