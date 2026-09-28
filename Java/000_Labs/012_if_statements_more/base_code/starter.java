/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner (System.in);

	System.out.print("Please input your first value: ");
	int first = sc.nextInt();
	System.out.print("Please input your second value: ");
	int second = sc.nextInt();

	if (first>second){
		System.out.print("Your first number is greater than the second " + first + " > " + second);
	}
	if (first<second){
		System.out.print("Your second number is greater than the second " + second + " > " + first);
	}
	if (first==second){
		System.out.print("Your numbers are the same " + first + " = " + second);
	}


	}
}
