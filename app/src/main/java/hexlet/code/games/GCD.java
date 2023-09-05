package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void startGame(int attempts) {
        //сама игра
        final int maxRandomValue = 100;
        String gameRule = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswers = new String[3][2];
        for (var i = 0; i < attempts; i++) {
            //подготовим вопрос
            int a = Utils.getRandomInt(maxRandomValue);
            int b = Utils.getRandomInt(maxRandomValue);
            String question = " " + a + " " + b;
            //вычислим правильный ответ
            String correctAnswer = "" + gcd(a, b);
            //запишем в массив вопрос и правильный ответ
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(questionsAndAnswers, gameRule);
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
