/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {

	public static void main(String args[]) {
		
		
		int money = 100;
		int numb1 = 0;
		int numb2 = 0;
		int numb3 = 0;
		int wager = 0;
		Scanner sc = new Scanner(System.in);


		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10");
		System.out.println("	a. If two numbers match, you will double your money.");
		System.out.println("	b. If three numbers match, you will triple your money.");
		System.out.println("	c. If none match, you lose your money.");

		int check = 0;
		int no = 0;
		int time = 0;
		System.out.println("Would you like to play slots? (Yes/yes/Y/y): ");
		String question = sc.nextLine();

		while(true){
				if((money<=0) || (no==1)){
					System.out.println("Congrats you're not playing slots!! You have " + money + " left. That's pretty funny that you don't or can't gamble anymore, also you can't play here, bye!");
					break;
				}
			while(true){
				if(check==1){
					check = 0;
					break;
				}
				
				if(time>0){
				System.out.println("Would you like to play slots? (Yes/yes/Y/y): ");
				question = sc.nextLine();
				}
				time = 1;

				wager = 0;


				if(question.equals("Yes") || question.equals("yes") || question.equals("Y") || question.equals("y")){
					System.out.println("You have $"+ money + ". " +"How much would you like to wager?");
					
					while(true){
						if(wager>0 & wager<=money){
							break;
						}

					wager = sc.nextInt();
					sc.nextLine();

					if(wager<0 || wager>money){
						System.out.println("Wager within your budget bro.");
					}


					}

					money = money-wager;
					numb1 = 0;
					numb2 = 0;
					numb3 = 0;
					numb1 = (int)(Math.random()*10 + 1);
					numb2 = (int)(Math.random()*10 + 1);
					numb3 = (int)(Math.random()*10 + 1);
					System.out.println();
					System.out.println("| " + numb1 + " | " + numb2 + " | " + numb3 + " |");
					if(numb1==numb2 || numb1==numb3 || numb3==numb2){
						money = money + wager*2;
						System.out.println("You win! Your doubled total is now: " + money + ".");
					}
					else if(numb1==numb2 & numb2==numb3 & numb3==numb1){
						money = money + wager*3;
						System.out.println("JACKPOT!!! Your TRIPLED total is now:" + money + ".");
					}
					else {
						System.out.println("You lose! Your total is now: " + money + ".");
					}
					check = 1;
					}	
			else if(question.equals("No") || question.equals("NO") || question.equals("no") || question.equals("n") || question.equals("No") || question.equals("don't take my money")){
				no = 1;
				check = 1;
				}
			else if (check!=1){
			System.out.println("Not the correct answer, input what i'm asking.");
				check = 1;	
				}
			}
		}
	}
}
