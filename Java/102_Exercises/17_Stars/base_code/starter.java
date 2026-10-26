/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);


	int starlength = 0;
	int starprint = 0;
	
	int revstarlength = 0;
	int revstarprint = 0;
	int revstarcount = 0;
	int revstarstarcount = 0;


	int hey = 0;
	int why = 0;


	System.out.print("Please input a width: ");
	int width = sc.nextInt();

	System.out.print("Please input a height: ");
	int height = sc.nextInt();

	while(true){
		if(hey==height){
			break;
		}

	while(true){
		if(why==width){
			hey++;
			why = 0;
			System.out.println("");
			break;
		}
			System.out.print("*");
			why++;

	}

	}
	System.out.println("--------------------------------------------------");
	System.out.print("");
	System.out.print("Please enter an integer: ");
	int star = sc.nextInt();

	while(true){
	if(starlength==star){
		break;
	}
	starlength++;
	
	while(true){
	if(starprint==starlength){
		starprint = 0;
		System.out.println("");
		break;
	}
	System.out.print("*");
	starprint++;
	}

	}



	System.out.println("--------------------------------------------------");
	System.out.println("Reversed Star:");
	System.out.print("Please enter an integer: ");

	int revstar = sc.nextInt();

	while(true){
		if(revstarlength==revstar){
			break;
		}

		revstarlength++;
		revstarprint = revstar-revstarlength;
		
		while(true){
			if(revstarcount==revstarprint){
				revstarcount = 0;
				revstarprint--;
				break;
			}
			System.out.print(" ");
			revstarcount++;
		}
		while(true){
			if(revstarstarcount==revstarlength){
				revstarstarcount = 0;
				System.out.println("");
				break;
			}
			System.out.print("*");
			revstarstarcount++;
		}

		}



	}





	}

