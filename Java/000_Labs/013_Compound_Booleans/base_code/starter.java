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
		System.out.print("Please input your third value: ");
		int third = sc.nextInt();

		if ((first > second) & (first > third) & (first != second) & (first != third)){
			System.out.println("Your first value is the greatest: " + first);
		}
		if ((second > first) & (second > third) & (second != first) & (second != third)){
			System.out.println("Your second value is the greatest: " + second);
		}
		if ((third > second) & (third > first) & (third != first) & (third != second)){
			System.out.println("Your third value is the greatest: " + third);
		}
		if ((third < second) & (third < first) & (third != first) & (third != second)){
			System.out.println("Your third value is the smallest: " + third);
		}
		if ((first < second) & (first < third) & (first != third) & (first != second)){
			System.out.println("Your first value is the smallest: " + first);
		}
		if ((second < first) & (second < third) & (second != first) & (second != third)){
			System.out.println("Your second value is the smallest: " + second);
		}
		if ((third == second) || (first == second) || (first == third)){
			System.out.println("Why are you putting numbers that are equal. THE POINT OF THE LAB IS TO USE DIFFERENT VALUES NOT THE SAME. :( (Im sorry mb)");
		}
	}
}
