# Miscellenous_Projects

## Overview
This project is a small prototype representation of Grocery store where the following operations can be done from console:<br/>
(1) Add a new Product to the inventory (with discount value, if applicable)<br/>
(2) Display product list from the inventory <br/>
(3) Order the Product. <br/>
(4) Total Sales Data <br/>
(5) Exit. <br/>

Note: There is no database integration. It uses ArrayList datastructure to persist the information at runtime and the data is not permanently persisted.

## Instructions to run:
1. Import the project as normal standalone Java project to any IDE (like Eclipse or Intellij)
2. Once imported, run the Java class Application.java (as a normal Java Application)
3. You will be provided with the menu options, enter any of the below values to proceed.<br/>
----- Shopping List------<br/>
(1) Add a new Product to the inventory (with discount value, if applicable)<br/>
(2) Display product list from the inventory <br/>
(3) Order the Product. <br/>
(4) Total Sales Data <br/>
(5) Exit. <br/>

## Sample Console output:

----- Shopping List------
(1) Add a new Product to the inventory (with discount value, if applicable)
(2) Display product list from the inventory 
(3) Order the Product. 
(4) Total Sales Data 
(5) Exit. 
1

Enter the Product code of your Product:
P1
Enter the name of your Product:
Pen
Enter the price of your Product:
10
Enter the quantity of your Product:
10
Enter the discount value for your Product, if applicable. (Enter 0 if there is no discount):
2
Product Added

----- Shopping List------
(1) Add a new Product to the inventory (with discount value, if applicable)
(2) Display product list from the inventory 
(3) Order the Product. 
(4) Total Sales Data 
(5) Exit. 
1

Enter the Product code of your Product:
P2
Enter the name of your Product:
Pencil
Enter the price of your Product:
20
Enter the quantity of your Product:
20
Enter the discount value for your Product, if applicable. (Enter 0 if there is no discount):
5
Product Added

----- Shopping List------
(1) Add a new Product to the inventory (with discount value, if applicable)
(2) Display product list from the inventory 
(3) Order the Product. 
(4) Total Sales Data 
(5) Exit. 
2
2 items. 
ProductCode: P1 | ProductName: Pen | Price: €10.0 | Quantity: 10 | DiscountValue: 2.0
ProductCode: P2 | ProductName: Pencil | Price: €20.0 | Quantity: 20 | DiscountValue: 5.0

----- Shopping List------
(1) Add a new Product to the inventory (with discount value, if applicable)
(2) Display product list from the inventory 
(3) Order the Product. 
(4) Total Sales Data 
(5) Exit. 
3

Enter the Product code you want to order:
P1
Unit Price of the Product (after discount) is: 8.0. Now enter the quantity that you want to order:
2
Total price to pay: 16.0
Enter 1 to proceed with the order or 0 to skip the order
1
Your order is successful and here is your Order Id: 1

----- Shopping List------
(1) Add a new Product to the inventory (with discount value, if applicable)
(2) Display product list from the inventory 
(3) Order the Product. 
(4) Total Sales Data 
(5) Exit. 
3

Enter the Product code you want to order:
P2
Unit Price of the Product (after discount) is: 15.0. Now enter the quantity that you want to order:
2
Total price to pay: 30.0
Enter 1 to proceed with the order or 0 to skip the order
1
Your order is successful and here is your Order Id: 2

----- Shopping List------
(1) Add a new Product to the inventory (with discount value, if applicable)
(2) Display product list from the inventory 
(3) Order the Product. 
(4) Total Sales Data 
(5) Exit. 
4
2 items. 
Total Sales Order for today is: [orderId=1, orderDate=02-05-2018 00:48:24, amount=€16.0, productCode=P1, quantity=2]
Total Sales Order for today is: [orderId=2, orderDate=02-05-2018 00:48:45, amount=€30.0, productCode=P2, quantity=2]
Total Sales=€46.0

----- Shopping List------
(1) Add a new Product to the inventory (with discount value, if applicable)
(2) Display product list from the inventory 
(3) Order the Product. 
(4) Total Sales Data 
(5) Exit. 
5
