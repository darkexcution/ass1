// --------------------------------------------------------------------
// Assignment 1
// Written by: (Sitherankan Sinnappu and 40264048)
// For COMP 248 Section (ED-X) – Winter 2023
// --------------------------------------------------------------------
import java.util.Scanner; //to get user input we use a scanner

public class A1_Q2 {// name of the class/ program the teacher assigned 

	public static void main(String[] args) {
		System.out.println("Welcome to the Simple Cinema Tickets Invoice Program:");//Display a welcome/salutation message to the user of the program.
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Scanner keyboard = new Scanner (System.in);// method to obtain the user input from the keyboard
		
		System.out.print("Enter the prepaid gift card retailer/bank name: ");//Display a prompt message for the user to enter the prepaid gift card retailer or bank name as a string. 
		String Giftcard = keyboard.nextLine();// method to obtain the user input from the keyboard for the Giftcard 
		String GiftcardCap = Giftcard.toUpperCase();// switching the user input from the keyboard for the Giftcard to upper case
		
		System.out.println("You will be using " + GiftcardCap + " gift card for your ticket(s) purchase. " );// displays the name of the gift card used for ticket(s) purchase in upper case
		System.out.print("Enter the amount on the gift card:"); //Display a prompt message for the user to enter the fund on the gift card as a decimal number
		
		double amount = keyboard.nextDouble();// method to obtain the user input from the keyboard for the fund on the gift card as a decimal number
		
		System.out.println("There is a fund of $" + amount + " on your prepaid " + GiftcardCap + " gift card.");//Output a message that displays the fund on the after mentioned prepaid gift card.
		
		double  remaining = amount % 6.99;// calculation to know the remainder of the money after the modulo of one ticket
		int tickets = (int) (amount / 6.99);// calculation to know the number of ticket the user buy by dividing with the price of a ticket
		System.out.println("Using your " + GiftcardCap + " gift card you can purchase " + tickets + " tickets and have a balance of $"+ String.format("%,.2f",remaining) + " on the gift card."); //Output a message that displays the number of tickets that can be bought and the balance that can be left on the gift card and we use the string format to round off to 2 decimal.
		
		System.out.print("Enter the number of tickets you want to purchase:");//display a prompt message for the user to enter the number of tickets they want to purchase as an integer number
		int ticketswant = keyboard.nextInt();
		
		double priceticket= ticketswant *6.99; // the price of the amount by multiplying the tickets the user input by the price of one ticket
		System.out.println("The purchase of " + ticketswant + " ticket(s) costs $" + priceticket + ".");// Output a message of the number of tickets purchased and the cost.

		
		double balance = amount - priceticket;// calculation by substracting the amount by the price of the tickets to know the balance remaining 
		System.out.println("The balance left on your " + GiftcardCap + " gift card is $" + String.format("%,.2f", balance ) + ".");//compute and output the balance on after mentioned gift card as a double and we use the string format to round off to 2 decimal
		System.out.println();
		System.out.println("Please enter your purchase info:");
		System.out.println();
		
		System.out.print("Day of purchase (between 1 and 31): ");//Display a prompt message for the user to enter the purchase information: day, month and year as integer number
		int day = keyboard.nextInt();
		
		System.out.print("Month of purchase (between 1 and 12):");
		int month = keyboard.nextInt();
		
		System.out.print("Year of purchase (between 2023 and 2028):");
		int year = keyboard.nextInt();
		
		
		/*. Generate the invoice based on the information entered by the user above, see the sample outputs.
            First the invoice should display the name Cinema Concordia, followed by the day of purchase, the
            number of tickets bought, the amount redeemed from the gift card, and the balance left.*/
		
		System.out.println("_______________________________________________________________________________________");
		System.out.println("\t\t\tCinema Concordia\t" + day + "/" + month + "/" + year);
		System.out.println();
		System.out.println();
		System.out.println("_______________________________________________________________________________________");
		System.out.println("");
		System.out.println(ticketswant +" Tickets" + "\t\t\t\t\t$" + priceticket);
		System.out.println("$" + priceticket + " was redeemed from " + GiftcardCap + " prepayed gift card.");
		System.out.println(GiftcardCap + " gift card balance" + "\t\t\t\t\t$"+ balance);
		System.out.println("");
		System.out.println("_______________________________________________________________________________________");
		System.out.println("Invoice generated successfully.");//Display a message the teacher assigned
		System.out.println("");
		System.out.println("");
		System.out.println("Thank you for using my bespoke Cinema Tickets Invoice Program!");//display a complimentary-close message
		
		keyboard.close();// closing the scanner
	}

		
}

	
