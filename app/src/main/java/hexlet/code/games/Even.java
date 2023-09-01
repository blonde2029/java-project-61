package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void startGame(int attempts) {
        //знакомство с пользователем
        String name = Engine.greeting();
        //сама игра
        final int maxRandomValue = 1000;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < attempts; i++) {
            //подбираем случайное число
            Random random = new Random();
            int randomNumber = random.nextInt(maxRandomValue);
            //выводим вопрос и считываем ответ
            String question = "Question: " + randomNumber;
            Scanner scanner = new Scanner(System.in);
            System.out.println(question);
            System.out.print("Your answer:");
            String answer = scanner.nextLine().trim();
            //вычислим правильный ответ
            String correctAnswer = (isEven(randomNumber) ? "yes" : "no");
            //проверим ответ пользователя
            if (!Engine.checkAnswer(answer, correctAnswer, name)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
