package com.epam.traning.buyit.model;

import java.io.Serializable;
import java.sql.Timestamp;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "bids")
public class Bid implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_bid", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idBid;

	@Column(name = "auction_id", nullable = false)
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_auction")
	private Auction auctionId;

	@Column(name = "user_id", nullable = false)
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user")
	private User userId;

	@Column(name = "time", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp time;

	@Column(name = "amount", nullable = false)
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

	public Auction getAuctionId() {
		return auctionId;
	}

	public Bid setAuctionId(Auction auctionId) {
		this.auctionId = auctionId;
		return this;
	}

	public User getUserId() {
		return userId;
	}

	public Bid setUserId(User userId) {
		this.userId = userId;
		return this;
	}

	@Override
	public String toString() {
		return "Bid [idBid=" + idBid + ", auctionId=" + auctionId + ", userId="
				+ userId + ", time=" + time + ", amount=" + amount + "]";
	}

}
