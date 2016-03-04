// Ricky Arora
package AssignmentFour;
import java.util.Scanner;
import java.util.Random;
public class blackjack {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Intializing new game of blackjack! Good luck.");
		int cardOne = rand.nextInt(10) + 1;
		int cardTwo = rand.nextInt(10) + 1;
		int total = cardOne + cardTwo;
		String hitOrNo = "";
		int newTotal = 0;
		int counter = 0;

		int compCardOne = rand.nextInt(10) + 1;
		int compCardTwo = rand.nextInt(10) + 1;
		int compTotal = compCardOne + compCardTwo;

		System.out.println("Your card One is: " + cardOne + " Card Two: " + cardTwo);
		System.out.println("Your total is: " + total);
		System.out.println("Would you like to hit? \n Type 'Y' for yes and 'N' for no");
		hitOrNo = input.nextLine();
		while (hitOrNo.equalsIgnoreCase("Y") && total < 21){
			if (counter >= 1) {
			System.out.println("Would you like to hit? \n Type 'Y' for yes and 'N' for no");
			hitOrNo = input.nextLine(); }
			counter++;
			if (hitOrNo.equalsIgnoreCase("Y")) {
				newTotal = rand.nextInt(10) + 1;
				total = newTotal + total;
				System.out.println("You drew a " + newTotal + " your new total is: " + total + " ");
			}
		}


		if (total == 21) {
			System.out.println("21 you WIN!!!!!!");
		}
		else if (total > 21) {
			System.out.println("total is greater than 21, you bust (lose),\n better luck next time.");
		}
		else if (compTotal > total) {
			System.out.println("The computer had: " + compTotal);
			System.out.println("You have: " + total);
			System.out.println("Computer wins, better luck next time.");
		}
		else if (total > compTotal) {
			System.out.println("Your total is: " + newTotal + " Computers total is: " + compTotal);
			System.out.println("Congrats you win!!");
		}
		else {
			System.out.println("this is very strange...");
		}





	}
}
