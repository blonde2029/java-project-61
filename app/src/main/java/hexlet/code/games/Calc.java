package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    static final int maxRandomValue = 100;
    static final String[] variousExpressions = new String[] {"-", "+", "*"};
    static final int maxRandom = 3;
    static final String gameRule = "What is the result of the expression?";
    public static void startGame(int attempts) {
        //сама игра
        String[][] questionsAndAnswers = new String[attempts][2];
        for (var i = 0; i < attempts; i++) {
            //подготовим вопрос
            int a = Utils.getRandomInt(0, maxRandomValue);
            int b = Utils.getRandomInt(0, maxRandomValue);
            String expressionString = getExpression();
            String question = " " + a + " " + expressionString + " " + b;
            //вычислим правильный ответ
            String correctAnswer = String.valueOf(getCorrectAnswer(a, b, expressionString));
            //запишем в массив вопрос и правильный ответ
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(questionsAndAnswers, gameRule);
    }
    public static String getExpression() {
        int expression = Utils.getRandomInt(0, maxRandom);
        return variousExpressions[expression];
    }
    public static int getCorrectAnswer(int a, int b, String expressionString) {
        int correctAnswer;
        if (expressionString.equals("-")) {
            correctAnswer = a - b;
        } else if (expressionString.equals("+")) {
            correctAnswer = a + b;
        } else {
            correctAnswer = a * b;
        }
        return correctAnswer;
    }
}
