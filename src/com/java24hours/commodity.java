package com.java24hours;

class commodity {

	public static void main(String [] arguments) {
		String command = "SELL";
		int balance=550;
		int quantity=42;
		
		switch (command){
		case "BUY":
			quantity += 5;
			balance -=20;
			break;
		case "SELL":
			quantity -=5;
			balance += 15;
			break;
		}
		System.out.println("Balance: " + balance + "\n" +"Quantity: " + quantity);
		
	}
}
