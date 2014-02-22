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
@Table(name="category")
public class Category implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "idCategory")
	@GeneratedValue
	private int idCategory;
	@Column(name = "name")
	private String name;
	@Column(name = "listSubCategories")
	private List<SubCategory> listSubCategories;

	public Category() {
		listSubCategories = new ArrayList<SubCategory>();
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

	public void setListSubCategories(List<SubCategory> listSubCategories) {
		this.listSubCategories = listSubCategories;
	}

	public SubCategory getSubCutegory(int index) {
		return getListSubCategories().get(index);
	}

	public void setSubCategory(SubCategory subCategory) {
		getListSubCategories().add(subCategory);
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(idCategory).append(" name: ").append(name);
		return string.toString();
	}
}
