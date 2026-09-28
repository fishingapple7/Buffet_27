/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner (System.in);

	int answer = (int)(Math.random()*1001);

	System.out.print("Please input your guess for the number (It's 1-1000): ");
	int input = sc.nextInt();

	if(input == answer){
		System.out.println("You are either extremely lucky, really good at guessing (Probably guess all your tests), or you cheated somehow congrats!");
	}
	else {
		System.out.println("It's a 1 in 1000 what did you expect? Also this is the number: " + answer + ".");
	}
	}
}
