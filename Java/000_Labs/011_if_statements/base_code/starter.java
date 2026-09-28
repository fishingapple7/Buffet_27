/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		int hi = (int)(Math.random()*255);
		int hi2 = (int)(Math.random()*255);

		if (hi>hi2){
			System.out.println("It's so cool that " + hi + " > " + hi2 + ".");
		}
		if (hi2>hi){
			System.out.println("It's not so cool that " + hi2 + " > " + hi + ".");
		}
		if (hi2==hi){
			System.out.println("How did you manage to get " + hi2 + " to be = to " + hi + ".");
		}

	}
}
