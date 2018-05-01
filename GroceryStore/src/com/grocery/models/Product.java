package com.grocery.models;

public class Product {

	private String code;
	private String name;
	private double price;
	private int quantity;
	private double discountValue;

	public Product() {

	}

	public Product(String code, String name, double price, int quantity, double discountValue) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.discountValue = discountValue;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
		String state = "ProductCode: " + code + " | ProductName: " + name + " | Price: €" + price + " | Quantity: "
				+ quantity + " | DiscountValue: " + discountValue;
		return state;
	}

	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			Product Product = (Product) object;
			if (this.code.equals(Product.getCode())) {
				result = true;
			}
		}
		return result;
	}
}
