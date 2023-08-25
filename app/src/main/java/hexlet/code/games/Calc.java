package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    public static void game() {
        //знакомство с пользователем
       String name = Engine.greeting();
        //сама игра
        int attempts = 3;
        int maxRandomValue = 100;
        System.out.println("What is the result of the expression?");
        for (var i = 0; i < attempts; i++) {
            //подберем случайные числа
            Random random = new Random();
            int a = random.nextInt(maxRandomValue);
            int b = random.nextInt(maxRandomValue);
            //подберем случайное выражение
            String expressionString;
            String correctAnswer;
            int expression = random.nextInt(3);
            if (expression == 0) {
                expressionString = "-";
                correctAnswer = "" + (a - b);
            } else if (expression == 1) {
                expressionString = "+";
                correctAnswer = "" + (a + b);
            } else {
                expressionString = "*";
                correctAnswer = "" + (a * b);
            }
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

}
