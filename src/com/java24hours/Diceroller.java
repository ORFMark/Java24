package com.java24hours;

import java.util.*;

class Diceroller {
	public static void main(String[] arguments){
		Random generator=new Random();
		int value=generator.nextInt();
		System.out.println("the random number is "
				+value);
	}
	
}
