package com.epam.traning.buyit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="rating")
public class Rating implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;
	@Column(name = "fromId")
	private int fromId;
	@Column(name = "userId")
	private int userId;
	@Column(name = "rating")
	private int rating;
	
	public int getId() {
		return id;
	}
	
	public Rating setId(int id) {
		this.id = id;
		return this;
	}
	
	public int getFromId() {
		return fromId;
	}
	
	public Rating setFromId(int fromId) {
		this.fromId = fromId;
		return this;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public Rating setUserId(int userId) {
		this.userId = userId;
		return this;
	}
	
	public int getRating() {
		return rating;
	}
	
	public Rating setRating(int rating) {
		this.rating = rating;
		return this;
	}
	
}
