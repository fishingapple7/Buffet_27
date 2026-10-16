/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("How many times do you want it to be printed?");
		int number = sc.nextInt();

		int printnumb = 0;

		while(true){
			if(printnumb==number){
				break;
			}
			System.out.println(name);
			printnumb = printnumb + 1;

		}


		
	}
}
