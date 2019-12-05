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
			System.out.println("1) New Order \n2) List All Orders \n3) View Single Order \nstop) Exit Program");
		
			switch(input()){
			
			case "1":
				NewOrder.createOrder();
				System.out.println("orderdone");
				break;
			case "2":
				//ViewAllOrders.listorderinfo();
				break;
			case "3":
				//ViewOne.allInfo();
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
}
