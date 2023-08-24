package hexlet.code;
import java.util.Scanner;
import java.util.Random;
public class Even {
    public static void Game() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        //приветствуем и запоминаем имя
        System.out.println("May I have your name?");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");
        //сама игра
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(1000);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().trim();
            if ((answer.equals("yes") && randomNumber % 2 == 0) || (answer.equals("no") && randomNumber % 2 != 0)) {
                System.out.println("Correct!");
            } else if (answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n Please try again, " + name);
                break;
            } else if (answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n Please try again, " + name);
                break;
            } else {
                System.out.println(answer + " is wrong answer");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }
}
