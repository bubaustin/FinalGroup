package edu.cgcc.student;


public class ViewOne {
	
	public static void viewOne() {
		int OrderSelected;
		Driver.clearConsol();
		System.out.println("Order Number:");
		 try { int i = Integer.parseInt(Driver.input());
	        OrderSelected = i;
	        NewOrder.orderArray[i].printViewOne();
	        System.out.println("\n\nEnter Y to change Status or Press Enter to Continue");
	        String choice = Driver.input();
	        if(choice.equals("Y")|choice.contentEquals("y")) {
	     	   System.out.println("Toggle status of? \r\n"+
	     	   		"Paid     \r\n" + 
	     	   		"Packaged \r\n" + 
	     	   		"Shipped  \r\n" + 
	     	   		"Complete ");
	     	   NewOrder.orderArray[OrderSelected].toggleStatus(Driver.input());
	        }
	        
	        
	       }catch(NumberFormatException | ArrayIndexOutOfBoundsException| NullPointerException e){
	    	   System.out.println("Wrong!");
	    	   
	       }
		
	}
}
