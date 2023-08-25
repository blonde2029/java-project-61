package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    public static void game() {
        //знакомство с пользователем
       String name = Engine.greeting();
        //сама игра
        System.out.println("What is the result of the expression?");
        for (var i = 0; i < 3; i++) {
            //подберем случайные числа
            Random random = new Random();
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            //подберем случайное выражение
            String expressionString;
            int expression = random.nextInt(3);
            if (expression == 0) {
                expressionString = "-";
            } else if (expression == 1) {
                expressionString = "+";
            } else {
                expressionString = "*";
            }
            //выводим вопрос и считываем ответ
            String question = "Question: " + a + " " + expressionString + " " + b;
            String answer = Engine.getAnswer(question);
            //вычислим правильный ответ
            String correctAnswer;
            if (expression == 0) {
                correctAnswer = "" + (a - b);
            } else if (expression == 1) {
                correctAnswer = "" + (a + b);
            } else {
                correctAnswer = "" + (a * b);
            }
            //проверим ответ пользователя
            if (!Engine.checkAnswer(answer, correctAnswer, name)) break;
            //если последний ответ был правильным
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }

        }
    }

}
