package edu.cgcc.student;

public class ViewAllOrder {
	public static void printAllList() {
		Driver.clearConsol();
		System.out.println("Num Paid     Packaged     Shipped     Complete");
		for(int i= 0 ; i<=(NewOrder.orderNumberCurrent - 1 ); i++) {
		
			NewOrder.orderArray[i].printListInfo();
		}
		System.out.println("\n\nPress ENTER to Continue");
	       Driver.input();
	}
}
