package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MAX_RANDOM_VALUE = 1000;
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void startGame(int attempts) {
        //сама игра
        String[][] questionsAndAnswers = new String[attempts][2];
        for (var i = 0; i < attempts; i++) {
            //подготовим вопрос
            int randomNumber = Utils.getRandomInt(0, MAX_RANDOM_VALUE);
            //подготовим правильный ответ
            String correctAnswer = isEven(randomNumber) ? "yes" : "no";
            //запишем в массив вопрос и правильный ответ
            questionsAndAnswers[i][0] = " " + randomNumber;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        //передадим в Engine вопросы и правильные ответы
        Engine.startGame(questionsAndAnswers, GAME_RULE);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
