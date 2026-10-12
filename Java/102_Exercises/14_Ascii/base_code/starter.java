/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

Scanner sc = new Scanner (System.in);


System.out.println("Welcome to the ASCII museum!");
System.out.println("Please select an exhibit");
System.out.println("1. Electronics");
System.out.println("2. Food");
System.out.println("3. People");

String put = sc.nextLine();


if((put.equals("electronics")) || (put.equals("Electronics"))){
System.out.println("What would you like to view?");
System.out.println("1. TV");
System.out.println("2. Camera");
String put2 = sc.nextLine();
if ((put2.equals("TV")) || (put2.equals("tv"))) {
System.out.println("<o         \\_/");
System.out.println(" |\\___,    ( ]");
System.out.println(" |~| |~|   |~|");
System.out.println("the tv guy");
}
if ((put2.equals("camera")) || (put2.equals("Camera"))) {
System.out.println("   _");
System.out.println(" _|#|_");
System.out.println("| (O) |");
 System.out.println(" -----");
 System.out.println("Say Cheese!");
}
}
else if ((put.equals("Food")) || (put.equals("food"))){
System.out.println("What would you like to view?");
System.out.println("1. Apple");
System.out.println("2. Candy");
String put2 = sc.nextLine();
if ((put2.equals("Apple")) || (put2.equals("apple"))) {
System.out.println("  ,--./,-.");
System.out.println(" / #      \\");
System.out.println("|          |");
 System.out.println(" \\        /    hjw");
  System.out.println("  `._,._,");
  System.out.println("smol appl");
}
else if ((put2.equals("candy")) || (put2.equals("Candy"))) {
System.out.println("     ___  .-"+"-.  ___ ");
System.out.println("  \\  "+"-." + "/      \\" + ".-" + "  / ");
 System.out.println("> -=.\\/        \\/.=- < ");
 System.out.println("> -='/\\        /\\'=- < ");
System.out.println("/__.-'  \\      /  '-.__\\ ");
 System.out.println(" jgs    '-..-' ");
 System.out.println("candi for the little kids!");
}
}
else if ((put.equals("People")) || (put.equals("people"))){
System.out.println("What would you like to view?");
System.out.println("1. Lenny");
System.out.println("2. Casper");
String put2 = sc.nextLine();
if ((put2.equals("lenny")) || (put2.equals("Lenny"))) {
	System.out.println("( ͡° ͜ʖ ͡°)");
	System.out.println("Lenny");
}
else if ((put2.equals("Casper")) || (put2.equals("casper"))) {
	System.out.println("  ...--...");
    System.out.println(" / -   -  \\");
    System.out.println("|  .-. .- |");
    System.out.println("|   o| |o (");
    System.out.println("|     ^   \\");
     System.out.println("'.  )--'  /");
       System.out.println("  '-...-'`  ");
	   System.out.println("Casper the Ghost");
}
}
else {
	System.out.println("You didn't choose one of the options (or you mispelled it).");
}
	}
}
