package com.grocery.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.grocery.models.Order;
import com.grocery.models.Product;

public class ShoppingListService {

	ArrayList<Product> productlist = new ArrayList<Product>();
	ArrayList<Order> orderList = new ArrayList<Order>();
	int orderId = 1;
	private Scanner keyboard;

	//Add a new Product to the inventory (with discount value, if applicable)
	public void addItem() {
		System.out.println();

		System.out.println("Enter the Product code of your Product:");
		keyboard = new Scanner(System.in);
		String code = keyboard.nextLine();

		System.out.println("Enter the name of your Product:");
		String name = keyboard.nextLine();

		System.out.println("Enter the price of your Product:");
		double price = keyboard.nextDouble();

		System.out.println("Enter the quantity of your Product:");
		int quantity = keyboard.nextInt();

		System.out.println(
				"Enter the discount value for your Product, if applicable. (Enter 0 if there is no discount):");
		int discountValue = keyboard.nextInt();

		Product product = new Product(code, name, price, quantity, discountValue);
		productlist.add(product);
		System.out.println("Product Added");

	}

	// Order the Product
	public void orderItems() {
		System.out.println();
		// Product product = new Product();

		System.out.println("Enter the Product code you want to order:");
		keyboard = new Scanner(System.in);
		String incomingProductCode = keyboard.nextLine();
		// product.setCode(codeOrder);

		ShoppingListService shoppingList = new ShoppingListService();
		double productPriceAfterDiscount = shoppingList.getProductPriceAfterDiscount(incomingProductCode, productlist);

		System.out.println("Unit Price of the Product (after discount) is: " + productPriceAfterDiscount
				+ ". Now enter the quantity that you want to order:");

		int quantityOrder = keyboard.nextInt();

		double totalPay = (quantityOrder * productPriceAfterDiscount);
		System.out.println("Total price to pay: " + totalPay);
		System.out.println("Enter 1 to proceed with the order or 0 to skip the order");
		int orderProceed = keyboard.nextInt();
		if (orderProceed == 1) {
			System.out.println("Your order is successful and here is your Order Id: " + orderId);
			shoppingList.reduceInventory(incomingProductCode, quantityOrder, productlist);
		} else {
			System.out.println("Your order is Skipped..");
		}

		// Add Order
		Order order = new Order();
		order.setAmount(totalPay);
		order.setOrderId(orderId);
		orderId++;
		String pattern = "dd-MM-yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		order.setOrderDate(simpleDateFormat.format(new Date()));
		order.setProductCode(incomingProductCode);
		order.setQuantity(quantityOrder);
		orderList.add(order);

	}

	// Display product list from the inventory
	public void displayItems() {
		System.out.println(productlist.size() + " items. ");
		for (Product product : productlist) {
			System.out.println(product.toString());
		}

	}

	// Display the Total Sales Data
	public void totalSales() {
		System.out.println(productlist.size() + " items. ");
		double totalSalesAmount = 0.0;
		for (Order order : orderList) {
			System.out.println(order.toString());
			totalSalesAmount += order.getAmount();
		}
		System.out.println("Total Sales=€" + totalSalesAmount);

	}

	// Reduce the inventory
	public void reduceInventory(String incomingProductCode, int quantityOrder, ArrayList<Product> list) {
		for (Product product : list) {
			if (product.getCode().equals(incomingProductCode)) {
				product.setQuantity((product.getQuantity() - quantityOrder));
			}
		}

	}

	// Get Product Price after applying discount
	public double getProductPriceAfterDiscount(String incomingProductCode, ArrayList<Product> list) {
		Product productMatch = productCheck(incomingProductCode, list);
		if (productMatch != null) {
			return (productMatch.getPrice() - productMatch.getDiscountValue());
		}
		return 0;

	}

	// Check the product is available in the ArrayList by comparing with the incoming product code
	public Product productCheck(String incomingProductCode, ArrayList<Product> list) {
		for (Product product : list) {
			if (product.getCode().equals(incomingProductCode)) {
				return product;
			}
		}
		return null;
	}

}
