package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MAX_RANDOM_VALUE = 3571;
    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void startGame(int attempts) {
        //сама игра
        String[][] questionsAndAnswers = new String[attempts][2];
        for (var i = 0; i < attempts; i++) {
            //подготовим вопрос
            int number = Utils.getRandomInt(1, MAX_RANDOM_VALUE);
            //вычислим правильный ответ
            String correctAnswer = isSimple(number) ? "yes" : "no";
            //запишем в массив вопрос и правильный ответ
            questionsAndAnswers[i][0] = " " + number;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(questionsAndAnswers, GAME_RULE);
    }
    public static boolean isSimple(int number) {
        if (number < 2) {
            return true;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
