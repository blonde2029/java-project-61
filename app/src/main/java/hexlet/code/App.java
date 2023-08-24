package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String answer = scanner.nextLine().trim();
        switch (answer) {
            case ("1") -> Cli.greeting();
            case ("2") -> Even.Game();
            case ("0") -> System.out.println("Goodbye!");
        }

    }
}
