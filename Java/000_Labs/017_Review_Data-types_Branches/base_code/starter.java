/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);

		int left = 20;

		System.out.print("What is your name? ");
		String name = sc.nextLine();

		System.out.print("What is your title? Ex: Lord Cheese of the Dark Abyss: ");
		String title = sc.nextLine();

		System.out.print("What would you like to be? A Wizard, Warrior, or Rogue? ");
		String dontbeaspellcaster = sc.nextLine();

		if ((dontbeaspellcaster.equals("Wizard")) || (dontbeaspellcaster.equals("wizard"))) {
			System.out.println("You're a Wizard. (I'M STILL WONDERING WHY ARE YOU A SPELLCASTER)");

			System.out.println("You have 20 skill points, spend in these following stats: Strength (DONT PICK THIS YOU ARE A SPELLCASTER), Dexterity, Intelligence (Highly recommend because YOU ARE A SPELLCASTER (WHHHYYYY), Constitution, and Charisma. Spend them wisely.");
			
			System.out.println("Strength (1-10): ");
			int str = sc.nextInt();
			if ((str>10) || (str<1)){
				System.out.print("Please input a smaller value. Strength (1-10): ");
				str = sc.nextInt();
			}
			System.out.println("You have " + (left-str) + " points left.");
			System.out.println("Dexterity (1-10): ");
			int dex = sc.nextInt();
			if ((dex>10) || (dex<1)){
				System.out.print("Please input a smaller value. Dexterity (1-10): ");
				dex = sc.nextInt();
			}
			System.out.println("You have " + (left-str-dex) + " left.");
			System.out.println("Intelligence (1-10): ");
			int inte = sc.nextInt();
			if ((inte>10) || (inte<1)){
				System.out.print("Please input a smaller value. Intelligence (1-10): ");
				inte = sc.nextInt();
			}
			System.out.println("You have " + (left-str-dex-inte) + " left.");
			System.out.println("Constitution (1-10): ");
			int con = sc.nextInt();
			if ((con>10) || (con<1)){
				System.out.print("Please input a smaller value. Constitution (1-10): ");
				con = sc.nextInt();
			}
			System.out.println("You have " + (left-str-dex-inte-con) + " left.");
			System.out.println("Charisma (1-10): ");
			int cha = sc.nextInt();
			if ((cha>10) || (cha<1)){
				System.out.print("Please input a smaller value. Charisma (1-10): ");
				cha = sc.nextInt();
			}
			System.out.println("You are " + name + ", the " + title + " of CVHS.");
			System.out.println("You're a " + dontbeaspellcaster + " with the following stats!");
			System.out.println("Strength - " + str);
			System.out.println("Dexterity - " + dex);
			System.out.println("Inteligence - " + inte);
			System.out.println("Constitution - " + con);
			System.out.println("Charisma - " + cha);
			System.out.println("");
			System.out.println("Good luck on your quest (unless you are a spellcaster) " + name + "!");
		}
		else if ((dontbeaspellcaster.equals("Rogue")) || (dontbeaspellcaster.equals("rogue"))) {
			System.out.println("You're a Rogue. (good choice!)");

			System.out.println("You have 20 skill points, spend in these following stats: Strength, Dexterity (pick this it boosts you the most!), Intelligence (don't pick this it is useless for you), Constitution, and Charisma. Spend them wisely.");
			
			System.out.println("Strength (1-10): ");
			int str = sc.nextInt();
			if ((str>10) || (str<1)){
				System.out.print("Please input a smaller value. Strength (1-10): ");
				 str = sc.nextInt();
			}
			System.out.println("You have " + (left-str) + " points left.");
			System.out.println("Dexterity (1-10): ");
			int dex = sc.nextInt();
			if ((dex>10) || (dex<1)){
				System.out.print("Please input a smaller value. Dexterity (1-10): ");
				dex = sc.nextInt();
			}
			System.out.println("You have " + (left-str-dex) + " left.");
			System.out.println("Intelligence (1-10): ");
			int inte = sc.nextInt();
			if ((inte>10) || (inte<1)){
				System.out.print("Please input a smaller value. Intelligence (1-10): ");
				inte = sc.nextInt();
			}
			System.out.println("You have " + (left-str-dex-inte) + " left.");
			System.out.println("Constitution (1-10): ");
			int con = sc.nextInt();
			if ((con>10) || (con<1)){
				System.out.print("Please input a smaller value. Constitution (1-10): ");
				con = sc.nextInt();
			}
			System.out.println("You have " + (left-str-dex-inte-con) + " left.");
			System.out.println("Charisma (1-10): ");
			int cha = sc.nextInt();
			if ((cha>10) || (cha<1)){
				System.out.print("Please input a smaller value. Charisma (1-10): ");
				cha = sc.nextInt();
			}
			System.out.println("You are " + name + ", the " + title + " of CVHS.");
			System.out.println("You're a " + dontbeaspellcaster + " with the following stats!");
			System.out.println("Strength - " + str);
			System.out.println("Dexterity - " + dex);
			System.out.println("Inteligence - " + inte);
			System.out.println("Constitution - " + con);
			System.out.println("Charisma - " + cha);
			System.out.println("");
			System.out.println("Best of luck on your quest " + name + "!");
		}
		else if ((dontbeaspellcaster.equals("Warrior")) || (dontbeaspellcaster.equals("warrior"))) {
			System.out.println("You're a Warrior.");

			System.out.println("You have 20 skill points, spend in these following stats: Strength (probably this one), Dexterity, Intelligence (don't pick this it is useless for you), Constitution (and maybe this one), and Charisma. Spend them wisely.");
			
			System.out.println("Strength (1-10): ");
			int str = sc.nextInt();
			if ((str>10) || (str<1)){
				System.out.print("Please input a smaller value. Strength (1-10): ");
				str = sc.nextInt();
			}
			System.out.println("You have " + (left-str) + " points left.");
			System.out.println("Dexterity (1-10): ");
			int dex = sc.nextInt();
			if ((dex>10) || (dex<1)){
				System.out.print("Please input a smaller value. Dexterity (1-10): ");
				dex = sc.nextInt();
			}
			System.out.println("You have " + (left-str-dex) + " left.");
			System.out.println("Intelligence (1-10): ");
			int inte = sc.nextInt();
			if ((inte>10) || (inte<1)){
				System.out.print("Please input a smaller value. Intelligence (1-10): ");
				inte = sc.nextInt();
			}
			System.out.println("You have " + (left-str-dex-inte) + " left.");
			System.out.println("Constitution (1-10): ");
			int con = sc.nextInt();
			if ((con>10) || (con<1)){
				System.out.print("Please input a smaller value. Constitution (1-10): ");
				con = sc.nextInt();
			}
			System.out.println("You have " + (left-str-dex-inte-con) + " left.");
			System.out.println("Charisma (1-10): ");
			int cha = sc.nextInt();
			if ((cha>10) || (cha<1)){
				System.out.print("Please input a smaller value. Charisma (1-10): ");
				cha = sc.nextInt();
			}
			System.out.println("You are " + name + ", the " + title + " of CVHS.");
			System.out.println("You're a " + dontbeaspellcaster + " with the following stats!");
			System.out.println("Strength - " + str);
			System.out.println("Dexterity - " + dex);
			System.out.println("Inteligence - " + inte);
			System.out.println("Constitution - " + con);
			System.out.println("Charisma - " + cha);
			System.out.println("");
			System.out.println("Good luck on your quest " + name + "!");
		}
		else {
			System.out.println("Try again you didn't put a rogue, warrior, or wizard.");
			}
		}
	}
