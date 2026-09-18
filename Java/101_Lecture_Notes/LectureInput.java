/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {

Scanner sc = new Scanner (System.in); 

double bacon = 13.98;
double cheese = 10.84;
double soda = 3.21;

System.out.println("Welcome to Bob's Burgers!");
System.out.println("Heres our menu:");
System.out.println("1. Baconburger - $" + bacon);
System.out.println("2. Cheeseburger - $" + cheese);
System.out.println("3. Soda - $" + soda);

System.out.println("Who is purchasing?");
String name = sc.nextLine();
System.out.println("How many Baconburgers would you like?");
int baconput = sc.nextInt();
System.out.println("How many Cheeseburgers would you like?");
int cheeseput = sc.nextInt();
System.out.println("How many Sodas would you like??");
int sodaput = sc.nextInt();
double itemtotal1 = baconput*bacon;
double itemtotal2 = cheeseput*cheese;
double itemtotal3 = sodaput*soda;
double grandtotal = itemtotal1 + itemtotal2 + itemtotal3;
System.out.println("Total is " + grandtotal);
System.out.println("How much would you like to tip?");
double tipput = sc.nextDouble();
tipput = (tipput/100)*grandtotal;
System.out.println("Tip and Total is " + grandtotal + tipput);
	}
}
