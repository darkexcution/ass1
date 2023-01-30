// --------------------------------------------------------------------
// Assignment 1
// Written by: (Sitherankan Sinnappu and 40264048)
// For COMP 248 Section (ED-X) – Winter 2023
// --------------------------------------------------------------------
import java.util.Scanner;// have to import a scanner to use it
public class A1_Q1 {// name of the class/ program the teacher assigned 

	public static void main(String[] args) {
		
	        System.out.println("Welcome to the Crypto Change Program: ");//Display a welcome/salutation message to the user of the program. 
	        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	        System.out.print("Enter the price of the ticket in Cryptom (at most 7500):" );//Display a prompt message for the user to enter the price of the ticket in Cryptom
	        Scanner keyboard = new Scanner (System.in); //we put a scanner so the user can input their data 
	        
	       
	        int Cryptom = keyboard.nextInt(); // this is the first part so they can input their data 
	        int Change = 7500 - Cryptom ; // we calculate the change since 1 pesico equals to 7500 cryptom and we substract it
	        int Bitom = Change % 500; // we use % to calculate the remainder of bitom
	        int Bitom1 = Change / 500; // we divide to know the number of bitom
	        int Ditom = Bitom % 200; // we use % to know the rest of the ditom 
	        int Ditom1 = Bitom / 200;// we divide to know the number of ditom
	        int Zitom = Ditom % 50;// we use % to know the rest of the zitom 
	        int Zitom1 = Ditom / 50; // we divide the ditom by 50 to know the number of zitom to give back 
	        int Cryptom1 = Zitom;// the rest of the money return in zitom
	        
	        
	        System.out.println();// display the same information as the format given 
	        System.out.println("You bought a ticket for " + Cryptom + " Cryptom. and gave me a Pesico, so your change is");//All output is displayed with clear messages and in an easy-to-read format.
	        System.out.println(Bitom1 + " Bitom,");
	        System.out.println(Ditom1 + " Ditom,");
	        System.out.println(Zitom1 + " Zitom, and");
	        System.out.println(Cryptom1  + " Cryptom.");
	        System.out.println();
	        System.out.println("Thank you for using my bespoke Crypto Change Program!");//End your program with a closing message so that the user knows that the program has terminated.
	        System.out.println();
	        System.out.println("Enjoy the Game !");
	        
	        keyboard.close();// closing the scanner
		}

	}

