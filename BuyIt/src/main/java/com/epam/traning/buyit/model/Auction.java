package com.epam.traning.buyit.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="auction")
public class Auction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "idAuction")
	@GeneratedValue
	private int idAuction;
	@Column(name = "productId")
	private int productId;
	@Column(name = "startPrice")
	private double startPrice;
	@Column(name = "buyItNow")
	private double buyItNow;
	@Column(name = "count")
	private int count;
	@Column(name = "currentPrice")
	private double currentPrice;
	@Column(name = "status")
	private String status;
	@Column(name = "startTime")
	private Timestamp startTime;
	@Column(name = "endTime")
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

	public int getProductId() {
		return productId;
	}

	public Auction setProductId(int productId) {
		this.productId = productId;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(idAuction).append(" start price: ").append(startPrice)
				.append(" start time: ").append(startTime)
				.append(" end time: ").append(endTime).append(" status: ")
				.append(status).append(" buy now: ").append(buyItNow)
				.append(" count: ").append(count).append(" curr. price: ")
				.append(currentPrice);
		return string.toString();
	}

}
