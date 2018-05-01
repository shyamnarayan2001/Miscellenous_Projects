package com.grocery.main;

import java.util.Scanner;
import com.grocery.service.ShoppingListService;

public class Application {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		ShoppingListService myList = new ShoppingListService();
		int userOpt = 0;
		while (userOpt != 5) {
			System.out.println("");
			System.out.println("----- Shopping List------");
			System.out.println("(1) Add a new Product to the inventory (with discount value, if applicable)");
			System.out.println("(2) Display product list from the inventory ");
			System.out.println("(3) Order the Product. ");
			System.out.println("(4) Total Sales Data ");
			System.out.println("(5) Exit. ");
			userOpt = input.nextInt();

			if (userOpt == 1) {
				myList.addItem();
			}

			if (userOpt == 2) {
				myList.displayItems();
			}

			if (userOpt == 3) {
				myList.orderItems();
			}

			if (userOpt == 4) {
				myList.totalSales();
			}
		}
	}
}
