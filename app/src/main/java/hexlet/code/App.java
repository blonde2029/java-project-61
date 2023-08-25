package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            case ("1") -> Cli.greeting();
            case ("2") -> Even.Game();
            case ("3") -> Calc.Game();
            case ("4") -> GCD.Game();
            case ("5") -> Progression.Game();
            case ("6") -> Prime.Game();
            case ("0") -> System.out.println("Goodbye!");
        }

    }
}
