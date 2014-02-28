package com.epam.traning.buyit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ratings")
public class Rating implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue
	private int id;

	@Column(name = "from_id", nullable = false)
	@JoinColumn(name = "id_user")
	@ManyToOne
	private int fromId;

	@Column(name = "user_id", nullable = false)
	@JoinColumn(name = "id_user")
	@OneToOne
	private User user;

	@Column(name = "rating", nullable = false)
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

	public User getUser() {
		return user;
	}

	public Rating setUser(User user) {
		this.user = user;
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
