/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);

	int truenumber = (int)(Math.random()*1001);

	System.out.println("Guess a number between 1-1000.");
	int guess = sc.nextInt();

	while(true){
		if(truenumber==guess){
			System.out.print("You win!");
			break;
		}
		if(guess>truenumber){
			System.out.println("Lower");
		}
		else if(guess<truenumber){
			System.out.println("Higher");
		}
		guess = sc.nextInt();
	}



		
	}
}
