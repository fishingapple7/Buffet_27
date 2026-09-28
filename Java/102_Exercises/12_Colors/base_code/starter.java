/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int red = (int)(Math.random()*256);
        int green = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);
        
        int comp1 = 255 - red;
        int comp2 = 255 - green;
        int comp3 = 255 - blue;
        
        System.out.println("Random color: rgb(" + red + ", " + green + ", " + blue + ")");
        System.out.println("Complementary color: rgb(" + comp1 + ", " + comp2 + ", " + comp3 + ")");
    
        getColor(red,green,blue);
        getColor(comp1, comp2, comp3);

        System.out.println("Triadic Colors");

        getColor(blue,red,green);
        getColor(green,blue,red);

        int dred = (int)(Math.random()*129);
        int dgreen = (int)(Math.random()*129);
        int dblue = (int)(Math.random()*129);

        System.out.println("Dark Color");

        getColor(dred,dgreen,dblue);

        int lred = (int)(Math.random()*128 + 128);
        int lgreen = (int)(Math.random()*128 + 128);
        int lblue = (int)(Math.random()*128 + 128);

        System.out.println("Light Color");

        getColor(lred, lgreen, lblue);

        int bblue = (int)(Math.random()*128 + 128);

        System.out.println("Bluer Color");

        getColor(dred,dgreen,bblue);

        int me1 = (int)(Math.random()*300+255);
        int me2 = (int)(Math.random()*200+31);
        int me3 = (int)(Math.random()*500+15);

        System.out.println("My color");

        getColor(me1, me2,me3);
		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
