package com.citi.beservice.pojo;

import java.util.Date;

public class PaymentDetails {

	private int transactionId;
	private double amountTransfered;
	private Date date;
		
	public PaymentDetails(int transactionId, double amountTransfered, Date date) {
		super();
		this.transactionId = transactionId;
		this.amountTransfered = amountTransfered;
		this.date = date;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public double getAmountTransfered() {
		return amountTransfered;
	}
	public void setAmountTransfered(double amountTransfered) {
		this.amountTransfered = amountTransfered;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
