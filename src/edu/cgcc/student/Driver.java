package edu.cgcc.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

	public static void main(String[] args) {
		start();
	}
	

	private static void start() {
		while(true) {
			
			Driver.clearConsol();
			System.out.println("1) New Order \n2) List All Orders \n3) View Single Order \nstop) Exit Program");
		
			switch(input()){
			
			case "1":
				NewOrder.createOrder();
				break;
			case "2":
				ViewAllOrder.printAllList();
				break;
			case "3":
				ViewOne.viewOne();
				break;
			case "stop":
                    return;
			}
		}
	}
	
	 public static String input(){

	       try{
	           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	         return reader.readLine();
	       }catch(IOException e){
	           e.printStackTrace();
	       }
	    return "problem in input";
	 }
	 public static void clearConsol() {
	    	for(int x=0; x<5; x++) {
	    	  System.out.print("\n");
	    	}
	 }
}
