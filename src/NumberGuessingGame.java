import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    private int boundry = 1000l

    public NumberGuessingGame() {
        System.out.println("Welcome to the Number Guessing Game.");
    }

    public void run() {
        int choice = -1;
        while(choice != 0) {
            System.out.println("Would you like to guess (1), or be the guesser (2)?\n");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 0) {
                //Quit
                System.out.println("Thanks for playing! Returning to the main menu...\n");
                break;
            }
            else if (choice == 1) {
                //Guess

            }
            else if (choice == 2) {
                //Guesser
            }
            else {
                System.out.println("Please enter a valid selection.\n");
                continue;
            }
        }
    }

    private void computerGenerating() {
        int toGuess = random.nextInt(boundry);

    }

    private void computerGuessing() {

    }
}
