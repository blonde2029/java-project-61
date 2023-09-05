package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static void startGame(String[][] questionsAndAnswers, String gameRule) {
        String name = greeting();
        System.out.println(gameRule);
        for (String[] questionsAndAnswer : questionsAndAnswers) {
            //выведем вопрос
            System.out.println("Question:" + questionsAndAnswer[0]);
            //считаем ответ
            System.out.print("Your answer:");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine().trim();
            //проверим корректность
            if (checkAnswer(userAnswer, questionsAndAnswer[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + questionsAndAnswer[1] + "\n Let's try again, " + name + "!");
                break;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static String  greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");
        return name;
    }
    public static boolean checkAnswer(String answer, String correctAnswer) {
        return answer.equals(correctAnswer);
    }


}
