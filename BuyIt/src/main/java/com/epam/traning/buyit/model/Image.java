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
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class Image implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_image", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idImage;

	@Column(name = "description_id", nullable = false)
	@JoinColumn(name = "id_description")
	@ManyToOne(fetch = FetchType.EAGER)
	private Description description;

	@Column(name = "path", nullable = false, length = 255)
	private String path;

	@Column(name = "deleted", nullable = false)
	private boolean deleted;

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

	public Description getDescription() {
		return description;
	}

	public Image setDescription(Description description) {
		this.description = description;
		return this;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public Image setDeleted(boolean deleted) {
		this.deleted = deleted;
		return this;
	}

	@Override
	public String toString() {
		return "Image [idImage=" + idImage + ", description=" + description
				+ ", path=" + path + ", deleted=" + deleted + "]";
	}

}
