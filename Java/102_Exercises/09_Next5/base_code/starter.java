/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);	
	System.out.print("Please enter a number: ");
	int numberput = sc.nextInt();
	System.out.println("Here are the next 5 numbers!" );
	int numberputadd1 = numberput + 1;
	int numberputadd2 = numberput + 2;
	int numberputadd3 = numberput + 3;
	int numberputadd4 = numberput + 4;
	int numberputadd5 = numberput + 5;
	System.out.println(numberput+", "+numberputadd1+", "+numberputadd2+", "+numberputadd3+", "+numberputadd4+", "+numberputadd5);
	System.out.println("Here are the next 5 multiples of "+numberput+"!");
	System.out.println(numberput + ", " + (numberput*2) +", " + (numberput*3) + ", " + (numberput*4) + ", " + (numberput*5) + ", " + (numberput*6));
	System.out.println("Here is " + numberput + " divided by 100!");
	System.out.println((double)numberput/100);
	System.out.println("Here is " + numberput + " divided by 10!");
	System.out.println((double)numberput/10);



	}
}
