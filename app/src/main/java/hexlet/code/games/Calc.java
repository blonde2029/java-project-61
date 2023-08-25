package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    public static void game(int attempts) {
        //знакомство с пользователем
       String name = Engine.greeting();
        //сама игра
        final int maxRandomValue = 100;
        System.out.println("What is the result of the expression?");
        for (var i = 0; i < attempts; i++) {
            //подберем случайные числа
            Random random = new Random();
            int a = random.nextInt(maxRandomValue);
            int b = random.nextInt(maxRandomValue);
            //подберем случайное выражение
            String expressionString = getExpression();
            //вычислим правильный ответ
            String correctAnswer = getCorrectAnswer(a, b, expressionString);
            //выводим вопрос и считываем ответ
            String question = "Question: " + a + " " + expressionString + " " + b;
            String answer = Engine.getAnswer(question);
            //проверим ответ пользователя
            if (!Engine.checkAnswer(answer, correctAnswer, name)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static String getExpression() {
        final int variousExpressions = 3;
        Random random = new Random();
        String expressionString;
        int expression = random.nextInt(variousExpressions);
        if (expression == 0) {
            expressionString = "-";
        } else if (expression == 1) {
            expressionString = "+";
        } else {
            expressionString = "*";
        }
        return expressionString;
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
