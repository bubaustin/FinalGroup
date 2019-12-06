package edu.cgcc.student;

public class NewOrder {
	public static int orderNumberCurrent = 0;
	public static OrderClass[] orderArray = new OrderClass[4];
	public static void createOrder(){
		//Initialize variables---------------------------------
		String orderDate;
		String orderNumber = String.valueOf(orderNumberCurrent);
		//System.out.println(String.valueOf(orderNumber)+ String.valueOf(orderNumberCurrent));
		String CustomerName;
		String CustomerNumber;
		String BillingAddress;
		String ShippingAddress;
		String[] productName = new String[10];
		String[] productAmount = new String[10];
		String[] productPrice = new String[10];
		//orderArray =  new  OrderClass[30];


		//Collect input from user------------------------------
		Driver.clearConsol();
		System.out.println("Order Date");
		orderDate = Driver.input();
		System.out.println("Customer Number");
		CustomerNumber = Driver.input();
		System.out.println("Customer Name");
		CustomerName = Driver.input();
		System.out.println("Billing Address");
		BillingAddress = Driver.input();
		System.out.println("Shipping Address");
		ShippingAddress = Driver.input();

		//Collect Product order info in the form of arrays-------------------
		int i =0;
		do{
			System.out.println("Product Name");
			productName[i] = Driver.input();
			System.out.println("Product Amount");
			productAmount[i] = Driver.input();
			System.out.println("Product Price");
			productPrice[i] = Driver.input();

			//Ask if another product---------------------------
			System.out.println("Another Product?	Y/N");
			i++;
		}while(Driver.input().toLowerCase().equals("y"));

		//Print inputs and ask confirmation-----------------------------------------------
		Driver.clearConsol();
		System.out.println("orderDate:		"+orderDate);
		System.out.println("orderNumber		"+orderNumber);
		System.out.println("CustomerName	"+CustomerName);
		System.out.println("BillingAddress	"+BillingAddress);
		System.out.println("ShippingAddress	"+ShippingAddress);
		for( i =0; (i<productName.length)&&(productName[i]!=null); i++){
			System.out.println(productName[i]+"   "+productAmount[i]+"   "+productPrice[i]);
		}
		Driver.clearConsol();


		System.out.println("Create Order?	Y/N");
		if(Driver.input().toLowerCase().equals("y")){
			orderArray[orderNumberCurrent] = new OrderClass (orderDate, orderNumber, CustomerName, CustomerNumber, BillingAddress, ShippingAddress, productName, productAmount, productPrice);
			orderNumberCurrent++;
			System.out.println("Order Added!");
		}

	}
}
