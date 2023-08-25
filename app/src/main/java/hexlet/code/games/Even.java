package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Even {
    public static void game() {
        //знакомство с пользователем
        String name = Engine.greeting();
        //сама игра
        final int attempts = 3;
        final int maxRandomValue = 1000;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < attempts; i++) {
            //подбираем случайное число
            Random random = new Random();
            int randomNumber = random.nextInt(maxRandomValue);
            //выводим вопрос и считываем ответ
            String question = "Question: " + randomNumber;
            String answer = Engine.getAnswer(question);
            //вычислим правильный ответ
            String correctAnswer = (randomNumber % 2 == 0 ? "yes" : "no");
            //проверим ответ пользователя
            if (!Engine.checkAnswer(answer, correctAnswer, name)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
