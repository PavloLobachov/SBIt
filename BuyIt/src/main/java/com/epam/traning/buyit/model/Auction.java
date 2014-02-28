package com.epam.traning.buyit.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "auctions")
public class Auction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_auction", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAuction;

	@Column(name = "product_id", nullable = false)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_product")
	private Product product;

	@Column(name = "start_price", nullable = false)
	private double startPrice;

	@Column(name = "buy_it_now")
	private double buyItNow;

	@Column(name = "count")
	private int count;

	@Column(name = "current_price", nullable = false)
	private double currentPrice;

	@Column(name = "status", length = 45)
	private String status;

	@Column(name = "start_time", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp startTime;

	@Column(name = "end_time", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp endTime;

	public int getIdAuction() {
		return idAuction;
	}

	public Auction setIdAuction(int idAuction) {
		this.idAuction = idAuction;
		return this;
	}

	public double getStartPrice() {
		return startPrice;
	}

	public Auction setStartPrice(double startPrice) {
		this.startPrice = startPrice;
		return this;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public Auction setStartTime(Timestamp startTime) {
		this.startTime = startTime;
		return this;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public Auction setEndTime(Timestamp endTime) {
		this.endTime = endTime;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public Auction setStatus(String status) {
		this.status = status;
		return this;
	}

	public double getBuyItNow() {
		return buyItNow;
	}

	public Auction setBuyItNow(double buyItNow) {
		this.buyItNow = buyItNow;
		return this;
	}

	public int getCount() {
		return count;
	}

	public Auction setCount(int count) {
		this.count = count;
		return this;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public Auction setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
		return this;
	}

	public Product getProduct() {
		return product;
	}

	public Auction setProductId(Product product) {
		this.product = product;
		return this;
	}

	@Override
	public String toString() {
		return "Auction [idAuction=" + idAuction + ", product=" + product
				+ ", startPrice=" + startPrice + ", buyItNow=" + buyItNow
				+ ", count=" + count + ", currentPrice=" + currentPrice
				+ ", status=" + status + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}

}
