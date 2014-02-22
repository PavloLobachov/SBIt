package com.epam.traning.buyit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="image")
public class Image implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "idImage")
	@GeneratedValue
	private int idImage;
	@Column(name = "descriptionId")
	private int descriptionId;
	@Column(name = "path")
	private String path;

	public int getIdImage() {
		return idImage;
	}

	public Image setIdImage(int idImage) {
		this.idImage = idImage;
		return this;
	}

	public String getPath() {
		return path;
	}

	public Image setPath(String path) {
		this.path = path;
		return this;
	}

	public int getDescriptionId() {
		return descriptionId;
	}

	public void setDescriptionId(int descriptionId) {
		this.descriptionId = descriptionId;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(descriptionId).append(" path: ").append(path);
		return string.toString();
	}

}
