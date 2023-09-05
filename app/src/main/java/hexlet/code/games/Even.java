package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void startGame(int attempts) {
        //сама игра
        final int maxRandomValue = 1000;
        //Random random = new Random();
        String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[3][2];
        for (var i = 0; i < attempts; i++) {
            //подготовим вопрос
            int randomNumber = Utils.getRandomInt(maxRandomValue);
            //подготовим правильный ответ
            String correctAnswer = (isEven(randomNumber) ? "yes" : "no");
            //запишем в массив вопрос и правильный ответ
            questionsAndAnswers[i][0] = " " + randomNumber;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        //передадим в Engine вопросы и правильные ответы
        Engine.startGame(questionsAndAnswers, gameRule);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
