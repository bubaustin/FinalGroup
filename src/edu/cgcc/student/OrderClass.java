package edu.cgcc.student;

public class OrderClass {
    private boolean Paid=false;
    private boolean Packaged=false;
    private boolean Shipped=false;
    private boolean Complete=false;
    private String orderDate;
    private String orderNumber;
    private String customerName;
    private String salesAss;
    private String customerNumber;
    private String billingAddress;
    private String shippingAddress;
    private String[] productName;
    private String[] productAmount;
    private String[] productPrice;

    public OrderClass(String oDate,String oNumber,String cName,String salesA, String cNumber,String bAddress,String sAddress,String[] pName, String[] pAmount, String[] pPrice){
        orderDate = oDate;
        orderNumber= oNumber;
        customerName= cName;
        customerNumber= cNumber;
        billingAddress= bAddress;
        shippingAddress= sAddress;
        productName=pName;
        productAmount=pAmount;
        productPrice=pPrice;
        salesAss=salesA;

    }

    
    public void printListInfo() {
    	System.out.print(orderNumber+"   ");
    	System.out.print(orderDate+"   ");
    	System.out.print(Paid+"   ");
    	System.out.print(Packaged+"   ");
    	System.out.print(Shipped+"   ");
    	System.out.print(Complete+"   ");
    	System.out.println();
    }
    public void printViewOne() {
    	
		System.out.println("Order Number:	"+orderNumber);
    	System.out.println("Order Date:	" +orderDate);
		System.out.println("CustomerName:	"+customerName);
		System.out.println("Sales Associate:"+salesAss);
		System.out.println("BillingAddress:	"+billingAddress);
		System.out.println("ShippingAddress:	"+shippingAddress);
    	System.out.println("Paid			" +Paid);
    	System.out.println("Packaged		"+Packaged);
    	System.out.println("Shipped 		"+Shipped);
    	System.out.println("Complete 		"+Complete);
		System.out.println("Product-Name  Ammount  Price");
		for( int i =0; (i<productName.length)&&(productName[i]!=null); i++){
			System.out.println(productName[i]+"\t\t"+productAmount[i]+"\t\t"+productPrice[i]);
		}
    	System.out.println();
    }
    public void toggleStatus(String str){
    	switch(str) {
    	case"Paid":
    		Paid = !Paid;
    		
    	case"Packaged": 
    		Packaged = !Packaged;
    		
    	case"Shipped":  
    		Shipped = !Shipped;
    		
    	case "Complete": 
    		Complete = !Complete;
    	}
    }
}
