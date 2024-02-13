/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
	    
        int totalCents = Integer.parseInt(args[0]);
        int quarters = totalCents / 25; // Calculate the number of quarters
        int remainderCents = totalCents % 25; // Calculate the remainder in cents

        System.out.println("Use " + quarters + " quarters and " + remainderCents + " cents");
	}
}