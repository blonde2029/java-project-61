package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    public static void game() {
        //знакомство с пользователем
        String name = Engine.greeting();
        //сама игра
        int attempts = 3;
        int minRandomValue = 5;
        int maxRandomValue = 10;
        System.out.println("What number is missing in the progression?");
        Random random = new Random();
        for (var i = 0; i < attempts; i++) {
            //подготовим данные для задачи
            int arrayLength = random.nextInt(minRandomValue, maxRandomValue);
            String array = "";
            int startNumber = random.nextInt(10);
            int progressionNumber = random.nextInt(1, maxRandomValue);
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
            String question = "Question:" + array;
            String answer = Engine.getAnswer(question);
            //проверим ответ пользователя
            if (!Engine.checkAnswer(answer, correctAnswer, name)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
