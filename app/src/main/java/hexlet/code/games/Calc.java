package hexlet.code.games;
import java.util.Scanner;
import java.util.Random;
public class Calc {
    public static void Game() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        //приветствуем и запоминаем имя
        System.out.println("May I have your name?");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");
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
            System.out.print("Yout answer:");
            String answer = scanner.nextLine().trim();
            //проверим введенное значение (число ли это)
            if (!isNumeric(answer)) {
                System.out.println(answer + " is wrong answer ;(.\n Let's try again, " + name + "!");
                break;
            }
            //проверим ответ
            if ((expression == 0) && (Integer.parseInt(answer) == (a - b))) {
                System.out.println("Correct!");
            } else if (expression == 0) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + (a - b) + "\n Let's try again, " + name + "!");
                break;
            }

            if ((expression == 1) && (Integer.parseInt(answer) == (a + b))) {
                System.out.println("Correct!");
            } else if (expression == 1) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + (a + b) + "\n Let's try again, " + name + "!");
                break;
            }

            if ((expression == 2) && (Integer.parseInt(answer) == (a * b))) {
                System.out.println("Correct!");
            } else if (expression == 2) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + (a * b) + "\n Let's try again, " + name + "!");
                break;
            }
            //если последний ответ был правильным
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }

        }
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
