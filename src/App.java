import java.util.Scanner;

/**
 * The core App class, used to run all of the modular games from. This app ran by compiling and running it, as it contains the key 'main' method needed.
 * 
 * @author Matthew Templeton
 */
public class App {

    private Scanner input = new Scanner(System.in);

    /**
     * The constructor for the App. This does nothing currently, as no variables need to be set on creation in this current iteration.
     */
    public App() {

    }

    /**
     * The run() method is used to start the game, and contains the majority of the user interation. It also contains the code to select which game has been chosen.
     */
    public void run() {
        System.out.println("Welcome to a collection of games coded within Java, by Matthew Templeton.");
        System.out.println("The idea of this application (and the repo it lives in) is that over time, I'll add multiple minigames that can be played easily, against a computer or a friend.");

        System.out.println("Below, a series of games will be shown in a list. Menus can be navigated by entering the number corresponding to the option you want to select.");
        System.out.println("At anytime, please enter the number 0 (zero) to exit the system.");

        int choice = selection();
        //The selection methods used 
        while (choice != 0) {
            if (choice == 1) {
                NumberGuessingGame game = new NumberGuessingGame();
                game.run();
            }
            else if (choice == 2) {
                RockPaperScissors game = new RockPaperScissors();
                game.run();
            }
            else if (choice == 3) {
                NoughtsAndCrosses game = new NoughtsAndCrosses();
                game.run();
            }
            choice = selection();
        }
        System.out.println("\nThank you for playing!");
    }

    /**
     * The selection() method is used to print the options for the user, and then return the value selected by the user.
     * 
     * @return An int, which is the corresponding integer value of the option selected by the user.
     */
    private int selection() {
        System.out.println(
            "The following games are currently available: \n" + 
            "0: Quit\n" +
            "1: Number Guessing Gamen\n" +
            "2: Rock, Paper, Scissors\n" +
            "3: Noughts and Crosses"
        );
        return input.nextInt();
    }

    /**
     * The main method called when the file is ran.
     * @param args The arguments handed to the program - in this case, none are required.
     * @throws Exception Thrown to handle runtime exceptions.
     */
    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
