/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner (System.in);

		System.out.print("What would you like to be? A Wizard, Warrior, or Rogue? ");
		String dontbeaspellcaster = sc.nextLine();

		if ((dontbeaspellcaster.equals("Wizard")) || (dontbeaspellcaster.equals("wizard"))) {
			System.out.println("You're a Wizard. (WHY ARE YOU A SPELLCASTER)");
		}
		else if ((dontbeaspellcaster.equals("Rogue")) || (dontbeaspellcaster.equals("rogue"))) {
			System.out.println("You're a Rogue. (good choice!)");
		}
		else if ((dontbeaspellcaster.equals("Warrior")) || (dontbeaspellcaster.equals("warrior"))) {
			System.out.println("You're a Warrior.");
		}
		else {
			System.out.println("Try again you didn't put a rogue, warrior, or wizard.");
		}
	}
}
