package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;
public class App {
    private static final int ATTEMPTS = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        String answer = scanner.nextLine().trim();
        switch (answer) {
            case "1" -> Cli.greeting();
            case "2" -> Even.startGame(ATTEMPTS);
            case "3" -> Calc.startGame(ATTEMPTS);
            case "4" -> GCD.startGame(ATTEMPTS);
            case "5" -> Progression.startGame(ATTEMPTS);
            case "6" -> Prime.startGame(ATTEMPTS);
            default -> System.out.println("Goodbye!");
        }

    }
}
