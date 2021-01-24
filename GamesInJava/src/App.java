public class App {

    public App() {

    }

    public void run() {
        System.out.println("Welcome to a collection of games coded within Java, by Matthew Templeton.");
        System.out.println("The idea of this application (and the repo it lives in) is that over time, I'll add multiple minigames that can be played easily, against a computer or a friend.");

        System.out.println("Below, a series of games will be shown in a list. Menus can be navigated by entering the number corresponding to the option you want to select.");
        System.out.println("At anytime, please enter the number 0 (zero) to exit the system.");
        
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App a = new App();
        a.run();
    }
}
