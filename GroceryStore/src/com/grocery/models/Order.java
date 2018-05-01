package com.grocery.models;

public class Order {

	private int orderId;
	private String orderDate;
	private double amount;
	private String productCode;
	private int quantity;
	private double discountValue;


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getProductCode() {
		return productCode;
	}



	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getDiscountValue() {
		return discountValue;
	}


	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}


	@Override
	public String toString() {
		String state = "Total Sales Order for today is: [orderId=" + orderId + ", orderDate=" + orderDate + ", amount=€"
				+ amount + ", productCode=" + productCode + ", quantity=" + quantity + "]";
		return state;
	}

}