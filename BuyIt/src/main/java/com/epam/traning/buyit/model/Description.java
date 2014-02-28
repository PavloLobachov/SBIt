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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "descriptions")
public class Description implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_description", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDescription;

	@Column(name = "product_id", nullable = false)
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_product")
	private Product product;

	@Column(name = "features")
	private String features;

	@Column(name = "desc_text")
	private String descText;

	@Transient
	@OneToMany(mappedBy = "description", fetch = FetchType.LAZY)
	private List<Image> itemPhotos;

	public Description() {
		itemPhotos = new ArrayList<Image>();
	}

	public int getIdDescription() {
		return idDescription;
	}

	public Description setIdDescription(int idDescription) {
		this.idDescription = idDescription;
		return this;
	}

	public String getFeatures() {
		return features;
	}

	public Description setFeatures(String features) {
		this.features = features;
		return this;
	}

	public String getDescText() {
		return descText;
	}

	public Description setDescText(String descText) {
		this.descText = descText;
		return this;
	}

	public List<Image> getItemPhotos() {
		return itemPhotos;
	}

	public Description setItemPhotos(List<Image> itemPhotos) {
		this.itemPhotos = itemPhotos;
		return this;
	}

	public Description setItemPhoto(Image image) {
		itemPhotos.add(image);
		return this;
	}

	public Image getItemPhoto(int number) {
		return itemPhotos.get(number);
	}

	public Product getProduct() {
		return product;
	}

	public Description setProduct(Product product) {
		this.product = product;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(idDescription).append(" features: ").append(features)
				.append(" description: ").append(descText).append(itemPhotos);
		return string.toString();
	}

}
