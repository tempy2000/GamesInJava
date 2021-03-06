import java.util.Random;
import java.util.Scanner;

/**
 * The class NumberGuessingGame, which holds the simple guessing game. This is invoked from within App.
 */
public class NumberGuessingGame {

    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    private int boundry = 1000;

    private int toGuess;
    private int guess;

    /**
     * The constructor, used to output the welcome message.
     */

    public NumberGuessingGame() {
        System.out.println("Welcome to the Number Guessing Game.");
    }

    /**
     * The run() method, sued to execute the game.
     */
    public void run() {
        int choice = -1;
        //The selection loop, where the game type is selected.
        //TODO: Implement the computer guessing.
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

    /**
     * The method used when the computer is generating a number, and the user is guessing.
     */
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

    /**
     * The method used when the computer is guessing the user's selected number.
     * 
     * THIS IS CURRENTLY NOT IMPLEMENTED.
     */
    private void computerGuessing() {
        System.out.println("Sorry, this feature isn't currently available.");
        /*
        System.out.println("Okay, tell me when you've thought of a number! (Just hit the Enter key!)");
        input.nextLine();
        //Add the ability to add a boundry.
        System.out.println("Awesome, I'll start guessing! For each of my guesses, you can tell me if I'm higher (h/higher), lower (l/lower), or correct (c/correct).");
        
        while (feedback != "c") {
            guess = random.nextInt(boundry);
        }*/
    }
}
