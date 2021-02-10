import java.util.Hashtable;

public class NoughtsAndCrosses {

    private Hashtable<Integer, String> board = new Hashtable<>();

    public NoughtsAndCrosses() {
        System.out.println("Welcome to Noughts and Crosses.");
        System.out.println("Here's how it works.");
        System.out.println("I'll show you the board. Then, it'll be randomly decided who's go it is.");

        System.out.println("When it's your go, you'll enter the indicated number for the square you wish to fill.");
        System.out.println("Getting three in a row means you win!");
        System.out.println("As usual, at anytime you can enter 0 to Quit.");
    }

    public void run() {

    }

    private void makeBoard() {
        board.put(1, "EMPTY");
        board.put(2, "EMPTY");
        board.put(3, "EMPTY");
        board.put(4, "EMPTY");
        board.put(5, "EMPTY");
        board.put(6, "EMPTY");
        board.put(7, "EMPTY");
        board.put(8, "EMPTY");
        board.put(9, "EMPTY");
    }

    private void outputBoard() {
        for(int i = 1; i <= board.size(); i++) {
            String value = board.get(i);
            if (value.equals("EMPTY")) {
                System.out.println(i);
            }
            else if (value.equals("NOUGHT")) {
                System.out.println("O");
            }
            else if (value.equals("CROSS")) {
                System.out.println("X");
            }

            //Print the board layout

            /*
            if () {
                
            }*/
        }
    }
}
