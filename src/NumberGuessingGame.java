import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    private int boundry = 1000;

    private int toGuess;
    private int guess;

    public NumberGuessingGame() {
        System.out.println("Welcome to the Number Guessing Game.");
    }

    public void run() {
        int choice = -1;
        while(choice != 0) {
            System.out.println("Would you like to guess (1), be the guesser (2), or quit (0)?");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 0) {
                //Quit
                System.out.println("Thanks for playing! Returning to the main menu...\n");
                break;
            }
            else if (choice == 1) {
                //Guess
                computerGenerating();
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
        System.out.println("Okay, let me think of a number...\n");
        toGuess = random.nextInt(boundry);
        System.out.println("I've thought of a number, between 0 and " + boundry + ". What's your first guess?");
        guess = input.nextInt();
        input.nextLine();
        while (guess != toGuess) {
            if (guess > toGuess) {
                System.out.println("Lower!\n");
            }
            else if (guess < toGuess) {
                System.out.println("Higher!\n");
            }

            System.out.println("What's your next guess?");
            guess = input.nextInt();
            input.nextLine();
        }
        System.out.println("Congratulations, that was the right answer!");
    }

    private void computerGuessing() {

    }
}
