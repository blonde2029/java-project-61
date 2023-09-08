package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    static final int maxRandomValue = 1000;
    static final String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void startGame(int attempts) {
        //сама игра
        String[][] questionsAndAnswers = new String[attempts][2];
        for (var i = 0; i < attempts; i++) {
            //подготовим вопрос
            int randomNumber = Utils.getRandomInt(0, maxRandomValue);
            //подготовим правильный ответ
            String correctAnswer = (Utils.isEven(randomNumber) ? "yes" : "no");
            //запишем в массив вопрос и правильный ответ
            questionsAndAnswers[i][0] = " " + randomNumber;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        //передадим в Engine вопросы и правильные ответы
        Engine.startGame(questionsAndAnswers, gameRule);
    }
}
