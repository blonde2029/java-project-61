package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class GCD {
    public static void game() {
        //знакомство с пользователем
        String name = Engine.greeting();
        //сама игра
        int attempts = 3;
        int maxRandomValue = 100;
        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < attempts; i++) {
            //подберем случайные числа
            Random random = new Random();
            int a = random.nextInt(maxRandomValue);
            int b = random.nextInt(maxRandomValue);
            //выводим вопрос и считываем ответ
            String question = "Question: " + a + " "  + b;
            String answer = Engine.getAnswer(question);
            //вычислим правильный ответ
            String correctAnswer = "" + gcd(a, b);
            //проверим ответ пользователя
            if (!Engine.checkAnswer(answer, correctAnswer, name)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
