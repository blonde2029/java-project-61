package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class GCD {
    public static void Game() {
        //знакомство с пользователем
        String name = Engine.greeting();

        //сама игра
        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < 3; i++) {
            //подберем случайные числа
            Random random = new Random();
            int a = random.nextInt(100);
            int b = random.nextInt(100);

            //выводим вопрос и считываем ответ
            String question = "Question: " + a + " "  + b;
            String answer = Engine.getAnswer(question);

            //вычислим правильный ответ
            String correctAnswer = "" + gcd(a, b);

            //проверим ответ пользователя
            if (!Engine.checkAnswer(answer, correctAnswer, name)) break;

            //если последний ответ был правильным
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }

        }
    }
    public static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b, a % b);
    }
}
