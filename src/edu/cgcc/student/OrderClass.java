package edu.cgcc.student;

public class OrderClass {
    private boolean Paid=false;
    private boolean Packaged=false;
    private boolean Shipped=false;
    private boolean Complete=false;
    private String orderDate;
    private String orderNumber;
    private String CustomerName;
    private String CustomerNumber;
    private String BillingAddress;
    private String ShippingAddress;
    private String[] productName;
    private String[] productAmount;
    private String[] productPrice;

    public OrderClass(String oDate,String oNumber,String cName,String cNumber,String bAddress,String sAddress,String[] pName, String[] pAmount, String[] pPrice){
        orderDate = oDate;
        orderNumber= oNumber;
        CustomerName= cName;
        CustomerNumber= cNumber;
        BillingAddress= bAddress;
        ShippingAddress= sAddress;
        productName=pName;
        productAmount=pAmount;
        productPrice=pPrice;

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
    	
    	System.out.println("orderDate:		"+orderDate);
		System.out.println("orderNumber		"+orderNumber);
		System.out.println("CustomerName	"+CustomerName);
		System.out.println("BillingAddress	"+BillingAddress);
		System.out.println("ShippingAddress	"+ShippingAddress);
		for( int i =0; (i<productName.length)&&(productName[i]!=null); i++){
			System.out.println(productName[i]+"   "+productAmount[i]+"   "+productPrice[i]);
		}
		System.out.print(orderNumber+"   \n");
    	System.out.print(orderDate+"   \n");
    	System.out.print("Paid" +Paid+"   \n");
    	System.out.print("Packaged"+Packaged+"   \n");
    	System.out.print("Shipped"+Shipped+"   \n");
    	System.out.print("Complete"+Complete+"   \n");
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
