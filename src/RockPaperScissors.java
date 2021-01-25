import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    private int myScore = 0;
    private int userScore = 0;

    private String myChoice = "";
    private String userChoice = "";

    private int decision = 0;

    private String[] choices = {"Rock", "Paper", "Scissors"};

    public RockPaperScissors() {
        System.out.println("Welcome to Rock, Paper, Scissors.");
        System.out.println("Here's how it works.");
        System.out.println("I'll generate my choice, then you'll enter yours. I'll compare them, and find the winner (I promise I won't cheat!).");

        System.out.println("To make your choice, you'll enter 1 for Rock, 2 for Paper, and 3 for Scissors.");
        System.out.println("As usual, at anytime you can enter 0 to Quit.");
    }

    public void run() {
        while (userChoice != "0") {
            myChoice = choices[random.nextInt(3)];
            System.out.println("Please enter your choice: ");
            decision = input.nextInt();
            input.nextLine();
            userChoice = choices[(decision-1)];
            comparison(myChoice, userChoice);
        }
    }

    private void comparison(String myChoice, String userChoice) {
        //Winning Combos: Rock vs Scissors, Scissors vs Paper, Paper vs Rock
        //Losing Combos: Scissors vs Rock, Rock vs Paper, Paper vs Scissors
        System.out.println(myChoice);
        System.out.println(userChoice);
        if (myChoice.equals(userChoice)) {
            //Draw
            System.out.println("It's a draw!");
        }
        else if ((myChoice.equals("Rock") && userChoice.equals("Paper")) || (myChoice.equals("Paper") && userChoice.equals("Scissors")) || (myChoice.equals("Scissors") && userChoice.equals("Rock"))) {
            //User Win
            System.out.println("You win!");
        }
        else {
            //My Win
            System.out.println("I win!");
        }
    }
}
