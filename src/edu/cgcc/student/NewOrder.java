package edu.cgcc.student;

public class NewOrder {
	public static int orderNumberCurrent = 0;
	public static OrderClass[] orderArray = new OrderClass[4];
	public static void createOrder(){
		//Initialize variables---------------------------------
		String orderDate;
		String orderNumber = String.valueOf(orderNumberCurrent);
		//System.out.println(String.valueOf(orderNumber)+ String.valueOf(orderNumberCurrent));
		String customerName;
		String salesAss;
		String customerNumber;
		String billingAddress;
		String shippingAddress;
		String[] productName = new String[10];
		String[] productAmount = new String[10];
		String[] productPrice = new String[10];
		//orderArray =  new  OrderClass[30];


		//Collect input from user------------------------------
		Driver.clearConsol();
		System.out.println("Order Date");
		orderDate = Driver.input();
		System.out.println("Customer Name");
		customerName = Driver.input();
		System.out.println("Customer Number");
		customerNumber = Driver.input();
		System.out.println("Sales Associate");
		salesAss = Driver.input();
		System.out.println("Billing Address");
		billingAddress = Driver.input();
		System.out.println("Shipping Address");
		shippingAddress = Driver.input();

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
			System.out.println("\n\nTo Include Another Product Enter 'y'\n or Press ENTER to Continue");
			i++;
		}while(Driver.input().toLowerCase().equals("y"));

		//Print inputs and ask confirmation-----------------------------------------------
		Driver.clearConsol();
		System.out.println("orderDate:		"+orderDate);
		System.out.println("CustomerName		"+customerName);
		System.out.println("orderNumber		"+orderNumber);
		System.out.println("Sales Associate		"+salesAss);
		System.out.println("BillingAddress		"+billingAddress);
		System.out.println("ShippingAddress		"+shippingAddress);
		System.out.println("\nProduct name 	Ammount		Price\n");
		for( i =0; (i<productName.length)&&(productName[i]!=null); i++){
			System.out.println(productName[i]+" 	  "+productAmount[i]+"  	 "+productPrice[i]);
		}
		Driver.clearConsol();


		System.out.println("To Create This Order Enter 'y'"+"/n"+"or Press ENTER to Cancel");
		if(Driver.input().toLowerCase().equals("y")){
			orderArray[orderNumberCurrent] = new OrderClass (orderDate, orderNumber, customerName, salesAss, customerNumber, billingAddress, shippingAddress, productName, productAmount, productPrice);
			orderNumberCurrent++;
			System.out.println("Order Added!");
		}

	}
}
