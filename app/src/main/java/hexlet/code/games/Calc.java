package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;


public class Calc {
    public static void Game() {
       Scanner scanner = new Scanner(System.in);

       //знакомство с пользователем
       String name = Engine.greeting();

        //сама игра
        for (var i = 0; i < 3; i++) {

            //подберем случайные числа
            Random random = new Random();
            int a = random.nextInt(1000);
            int b = random.nextInt(1000);

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
            System.out.println("What is the result of the expression?");
            System.out.println("Question: " + a + " " + expressionString + " " + b);
            System.out.print("Your answer:");
            String answer = scanner.nextLine().trim();

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
