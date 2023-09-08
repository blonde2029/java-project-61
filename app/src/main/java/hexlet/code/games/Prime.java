package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final int maxRandomValue = 3571;
    static final String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void startGame(int attempts) {
        //сама игра
        String[][] questionsAndAnswers = new String[attempts][2];
        for (var i = 0; i < attempts; i++) {
            //подготовим вопрос
            int number = Utils.getRandomInt(1, maxRandomValue);
            //вычислим правильный ответ
            String correctAnswer = (Utils.isSimple(number) ? "yes" : "no");
            //запишем в массив вопрос и правильный ответ
            questionsAndAnswers[i][0] = " " + number;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(questionsAndAnswers, gameRule);
    }
}
