package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void startGame(int attempts) {
        //знакомство с пользователем
        String name = Engine.greeting();
        //сама игра
        final int maxRandomValue = 3571;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < attempts; i++) {
            //подготовим данные для задачи
            Random random = new Random();
            int number = random.nextInt(1, maxRandomValue);
            //выводим вопрос и считываем ответ
            String question = "Question: " + number;
            Scanner scanner = new Scanner(System.in);
            System.out.println(question);
            System.out.print("Your answer:");
            String answer = scanner.nextLine().trim();
            //вычислим правильный ответ
            String correctAnswer = isSimple(number);
            //проверим ответ пользователя
            if (!Engine.checkAnswer(answer, correctAnswer, name)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static String isSimple(int number) {
        if (number < 2) {
            return "no";
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
