package com.epam.traning.buyit.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bid")
public class Bid implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "idBid")
	@GeneratedValue
	private int idBid;
	@Column(name = "auctionId")
	private int auctionId;
	@Column(name = "userId")
	private int userId;
	@Column(name = "time")
	private Timestamp time;
	@Column(name = "amount")
	private double amount;

	public double getAmount() {
		return amount;
	}

	public Bid setAmount(double amount) {
		this.amount = amount;
		return this;
	}

	public int getIdBid() {
		return idBid;
	}

	public Bid setIdBid(int idBid) {
		this.idBid = idBid;
		return this;
	}

	public Timestamp getTime() {
		return time;
	}

	public Bid setTime(Timestamp time) {
		this.time = time;
		return this;
	}

	public int getAuctionId() {
		return auctionId;
	}

	public Bid setAuctionId(int auctionId) {
		this.auctionId = auctionId;
		return this;
	}

	public int getUserId() {
		return userId;
	}

	public Bid setUserId(int userId) {
		this.userId = userId;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(idBid).append(" time: ").append(time)
				.append(" auction id: ").append(auctionId).append(" amount: ")
				.append(amount).append(" user id: ").append(userId);
		return string.toString();
	}

}
