package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void startGame(int attempts) {
        //сама игра
        final int maxRandomValue = 100;
        String gameRule = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[3][2];
        for (var i = 0; i < attempts; i++) {
            //подготовим вопрос
            int a = Utils.getRandomInt(maxRandomValue);
            int b = Utils.getRandomInt(maxRandomValue);
            String expressionString = getExpression();
            String question = " " + a + " " + expressionString + " " + b;
            //вычислим правильный ответ
            String correctAnswer = getCorrectAnswer(a, b, expressionString);
            //запишем в массив вопрос и правильный ответ
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(questionsAndAnswers, gameRule);
    }
    public static String getExpression() {
        final String[] variousExpressions = new String[] {"-", "+", "*"};
        final int maxRandom = 3;
        int expression = Utils.getRandomInt(maxRandom);
        return variousExpressions[expression];
    }
    public static String getCorrectAnswer(int a, int b, String expressionString) {
        String correctAnswer;
        if (expressionString.equals("-")) {
            correctAnswer = "" + (a - b);
        } else if (expressionString.equals("+")) {
            correctAnswer = "" + (a + b);
        } else {
            correctAnswer = "" + (a * b);
        }
        return correctAnswer;
    }
}
