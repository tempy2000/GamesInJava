import java.util.Scanner;

public class RockPaperScissors {

    private Scanner input = new Scanner(System.in);

    private int myScore = 0;
    private int userScore = 0;

    private String myChoice = "";
    private String userChoice = "";

    private String[] choices = {"Rock", "Paper", "Scissors"};

    public RockPaperScissors() {
        System.out.println("Welcome to Rock, Paper, Scissors.");
        System.out.println("Here's how it works.");
        System.out.println("I'll generate my choice, then you'll enter yours. I'll compare them, and find the winner (I promise I won't cheat!).");

        System.out.println("To make your choice, you'll enter 'r' for Rock, 'p' for Paper, and 's' for Scissors.");
        System.out.println("As usual, at anytime you can enter 0 to Quit.");
    }

    public void run() {
        
    }
}
