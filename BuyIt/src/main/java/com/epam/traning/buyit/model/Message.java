package com.epam.traning.buyit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="message")
public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "message")
	private String message;
	@Column(name = "fromUserId")
	private int fromUserId;
	@Column(name = "toUserId")
	private int toUserId;

	public String getMessage() {
		return message;
	}

	public Message setMessage(String message) {
		this.message = message;
		return this;
	}

	public int getFromUserId() {
		return fromUserId;
	}

	public Message setFromUserId(int fromUserId) {
		this.fromUserId = fromUserId;
		return this;
	}

	public int getToUserId() {
		return toUserId;
	}

	public Message setToUserId(int toUserId) {
		this.toUserId = toUserId;
		return this;
	}

	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("message: ").append(message).append(" fromUserId: ")
				.append(fromUserId).append(" toUserId: ").append(toUserId);
		return string.toString();
	}

}
