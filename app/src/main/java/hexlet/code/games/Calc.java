package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MAX_RANDOM_VALUE = 100;
    private static final String[] VARIOUS_EXPRESSIONS = new String[] {"-", "+", "*"};
    private static final int MAX_RANDOM_EXPRESSIONS = 3;
    private static final String GAME_RULE = "What is the result of the expression?";
    public static void startGame(int attempts) {
        //сама игра
        String[][] questionsAndAnswers = new String[attempts][2];
        for (var i = 0; i < attempts; i++) {
            //подготовим вопрос
            int a = Utils.getRandomInt(0, MAX_RANDOM_VALUE);
            int b = Utils.getRandomInt(0, MAX_RANDOM_VALUE);
            String expressionString = getExpression();
            String question = " " + a + " " + expressionString + " " + b;
            //вычислим правильный ответ
            String correctAnswer = String.valueOf(getCorrectAnswer(a, b, expressionString));
            //запишем в массив вопрос и правильный ответ
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(questionsAndAnswers, GAME_RULE);
    }
    public static String getExpression() {
        int expression = Utils.getRandomInt(0, MAX_RANDOM_EXPRESSIONS);
        return VARIOUS_EXPRESSIONS[expression];
    }
    public static Integer getCorrectAnswer(int a, int b, String expressionString) {
        Integer correctAnswer;
        if (expressionString.equals("-")) {
            correctAnswer = a - b;
        } else if (expressionString.equals("+")) {
            correctAnswer = a + b;
        } else if (expressionString.equals("*")) {
            correctAnswer = a * b;
        } else {
            correctAnswer = null;
        }
        return correctAnswer;
    }
}
