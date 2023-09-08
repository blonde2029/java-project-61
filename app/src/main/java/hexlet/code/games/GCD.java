package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    static final int MAX_RANDOM_VALUE = 100;
    static final String GAME_RULE = "Find the greatest common divisor of given numbers.";
    public static void startGame(int attempts) {
        //сама игра
        String[][] questionsAndAnswers = new String[attempts][2];
        for (var i = 0; i < attempts; i++) {
            //подготовим вопрос
            int a = Utils.getRandomInt(0, MAX_RANDOM_VALUE);
            int b = Utils.getRandomInt(0, MAX_RANDOM_VALUE);
            String question = " " + a + " " + b;
            //вычислим правильный ответ
            String correctAnswer = "" + Utils.gcd(a, b);
            //запишем в массив вопрос и правильный ответ
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(questionsAndAnswers, GAME_RULE);
    }
}
