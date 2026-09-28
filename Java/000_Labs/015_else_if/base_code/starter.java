/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner (System.in);


		int answerif = (int)(Math.random()*1001);

		System.out.print("Please input a number for me (1-1000): ");
		int inputif = sc.nextInt();


		if (answerif==inputif){
			System.out.println("HOW ARE YOU RIGHT? Also you got the number correct.");
		}
		else if (inputif > answerif){
			System.out.println("Your input was greater than the answer. The answer is " + answerif + ".");
		}
		else if (inputif < answerif){
			System.out.println("Your input was less than the answer. The answer is " + answerif + ".");
		}
	}
}
