/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		int input1 = sc.nextInt();
		System.out.print("Please enter another integer (bigger than the first): ");
		int input2 = sc.nextInt();
		System.out.println();
		System.out.println("Your range is " + input1 + " to " + input2 + ".");
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.print((int)(Math.random()*(input2-input1) + input1) + ", " + (int)(Math.random()*(input2-input1) + input1) + ", " + (int)(Math.random()*(input2-input1) + input1) + ", " + (int)(Math.random()*(input2-input1) + input1) + ", " + (int)(Math.random()*(input2-input1) + input1));
	}
}
