package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void startGame(int attempts) {
        //сама игра
        final int maxRandomValue = 3571;
        String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[attempts][2];
        for (var i = 0; i < attempts; i++) {
            //подготовим вопрос
            int number = Utils.getRandomInt(1, maxRandomValue);
            //вычислим правильный ответ
            String correctAnswer = (isSimple(number) ? "yes" : "no");
            //запишем в массив вопрос и правильный ответ
            questionsAndAnswers[i][0] = " " + number;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(questionsAndAnswers, gameRule);
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
