import java.util.Scanner;

public class App {

    private Scanner input = new Scanner(System.in);

    public App() {

    }

    public void run() {
        System.out.println("Welcome to a collection of games coded within Java, by Matthew Templeton.");
        System.out.println("The idea of this application (and the repo it lives in) is that over time, I'll add multiple minigames that can be played easily, against a computer or a friend.");

        System.out.println("Below, a series of games will be shown in a list. Menus can be navigated by entering the number corresponding to the option you want to select.");
        System.out.println("At anytime, please enter the number 0 (zero) to exit the system.");

        int choice = selection();
        while (choice != 0) {
            if (choice == 1) {
                NumberGuessingGame game = new NumberGuessingGame();
                game.run();
            }
            else if (choice == 2) {
                RockPaperScissors game = new RockPaperScissors();
                game.run();
            }
            choice = selection();
        }
        System.out.println("\nThank you for playing!");
    }

    private int selection() {
        System.out.println(
            "The following games are currently available: \n" + 
            "0: Quit\n" +
            "1: Number Guessing Gamen\n" +
            "2: Rock, Paper, Scissors"
        );
        return input.nextInt();
    }

    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
