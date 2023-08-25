package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    public static void game() {
        //знакомство с пользователем
        String name = Engine.greeting();
        //сама игра
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {
            //подготовим данные для задачи
            Random random = new Random();
            int number = random.nextInt(1, 3571);
            //выводим вопрос и считываем ответ
            String question = "Question: " + number;
            String answer = Engine.getAnswer(question);
            //вычислим правильный ответ
            String correctAnswer = isSimple(number);
            //проверим ответ пользователя
            if (!Engine.checkAnswer(answer, correctAnswer, name)) return;
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static String isSimple(int number) {
        if (number < 2) return "no";
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
