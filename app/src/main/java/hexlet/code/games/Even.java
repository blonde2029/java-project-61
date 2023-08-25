package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;
public class Even {
    public static void Game() {
        Scanner scanner = new Scanner(System.in);

        //знакомство с пользователем
        String name = Engine.greeting();

        //сама игра
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {

            //подбираем случайное число
            Random random = new Random();
            int randomNumber = random.nextInt(1000);

            //выводим вопрос и считываем ответ
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().trim();

            //вычислим правильный ответ
            String correctAnswer;
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            //проверим ответ пользователя
            if (!Engine.checkAnswer(answer, correctAnswer, name)) break;

            //если последний ответ был правильным
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }
}
