package hexlet.code;
import java.util.Scanner;
public class Engine {

    public static String  greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static String getAnswer(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        System.out.print("Your answer:");
        return scanner.nextLine().trim();
    }

    public static boolean checkAnswer(String answer, String correctAnswer, String name) {
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println(answer + " is wrong answer ;(. Correct answer was "
                + correctAnswer + "\n Let's try again, " + name + "!");
        return false;
    }


}
