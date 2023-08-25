package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    public static void Game() {
        //знакомство с пользователем
        String name = Engine.greeting();

        //сама игра
        System.out.println("What number is missing in the progression?");
        for (var i = 0; i < 3; i++) {
            //подготовим данные для задачи
            Random random = new Random();
            int arrayLength = random.nextInt(5,10);
            String array = "";
            int startNumber = random.nextInt(10);
            int progressionNumber = random.nextInt(1,10);
            int hiddenIndex = random.nextInt(arrayLength);
            String correctAnswer = "";

            //заполним строку чисел
            for (var n = 0; n < arrayLength; n++) {
                if (n == hiddenIndex) {
                    correctAnswer = "" + startNumber; //это будет правильный ответ
                    startNumber = startNumber + progressionNumber;
                    array = array + " ..";
                } else {
                    array = array + " " + startNumber;
                    startNumber = startNumber + progressionNumber;
                }
            }

            //выводим вопрос и считываем ответ
            String question = "Question: " + array;
            String answer = Engine.getAnswer(question);

            //проверим ответ пользователя
            if (!Engine.checkAnswer(answer, correctAnswer, name)) break;

            //если последний ответ был правильным
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }

        }
    }
}
