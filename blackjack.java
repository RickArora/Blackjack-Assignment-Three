// Ricky Arora
package AssignmentFour;
import java.util.Scanner; // importing scanner class to get user input
import java.util.Random; // importing random class to generate random numbers with ease
public class blackjack {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // creating a new scanner named input
		Random rand = new Random(); // new random number generator named rand

		System.out.println("Intializing new game of blackjack! Good luck.");
		int cardOne = rand.nextInt(10) + 1; // random number between 1-10 is given to variable cardOne
		int cardTwo = rand.nextInt(10) + 1; // same as above
		int total = cardOne + cardTwo; // initializes total and gives it the value of line 11-12
		String hitOrNo = ""; // empty string
		int newCard = 0; // initializing int
		int counter = 0; // same as above

		int compCardOne = rand.nextInt(10) + 1; // computers two cards 
		int compCardTwo = rand.nextInt(10) + 1;
		int compTotal = compCardOne + compCardTwo; 

		System.out.println("Your card One is: " + cardOne + " Card Two: " + cardTwo);
		System.out.println("Your total is: " + total);
		System.out.println("Would you like to hit? \n Type 'Y' for yes and 'N' for no");
		hitOrNo = input.nextLine(); // gets input from user 
		while (hitOrNo.equalsIgnoreCase("Y") && total < 21){ // if the answer is yes and the total is less than 21 this loop shall execute
			if (counter >= 1) { // if statement for the counter, this makes it so it does not ask the same question twice in a row.
			System.out.println("Would you like to hit? \n Type 'Y' for yes and 'N' for no");
			hitOrNo = input.nextLine(); 
			}
			counter++; // adds one to the counter, so the if statement will execute on line 27 if it goes through this loop again
			if (hitOrNo.equalsIgnoreCase("Y")) { // if statement, if user inputs Y this is executed
				newCard = rand.nextInt(10) + 1; // generates value between 1-10
				total = newCard + total; // calculates total
				System.out.println("You drew a " + newCard + " your new total is: " + total + " "); // displays newCard value and new total value
			}
		}
// if & else if statements which are executed to show if the user won or loss.
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
			System.out.println("Your total is: " + total + " Computers total is: " + compTotal);
			System.out.println("Congrats you win!!");
		}
		else {
			System.out.println("this is very strange...");
		}





	}
}
