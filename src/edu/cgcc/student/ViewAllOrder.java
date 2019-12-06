package edu.cgcc.student;

public class ViewAllOrder {
	public static void printAllList() {
		
	//	System.out.println(NewOrder.orderNumberCurrent - 1+""+ NewOrder.orderArray.length);
		System.out.println("Num Paid     Packaged     Shipped     Complete");
		for(int i= 0 ; i<=(NewOrder.orderNumberCurrent - 1 ); i++) {
		
			NewOrder.orderArray[i].printListInfo();
		}
		
	System.out.println("Order Printed");
	}
}
