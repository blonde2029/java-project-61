package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    public static void game(int attempts) {
        //знакомство с пользователем
        String name = Engine.greeting();
        //сама игра
        final int minRandomValue = 5;
        final int maxRandomValue = 10;
        System.out.println("What number is missing in the progression?");
        Random random = new Random();
        for (var i = 0; i < attempts; i++) {
            //подготовим данные для задачи
            int startNumber = random.nextInt(maxRandomValue);
            int progressionNumber = random.nextInt(1, maxRandomValue);
            int arrayLength = random.nextInt(minRandomValue, maxRandomValue);
            int hiddenIndex = random.nextInt(arrayLength);
            String array = getArray(arrayLength, startNumber, progressionNumber, hiddenIndex);
            //вычислим правильный ответ
            String correctAnswer = getCorrectAnswer(arrayLength, startNumber, progressionNumber, hiddenIndex);
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
    public static String getArray(int arrayLength, int startNumber, int progressionNumber, int hiddenIndex) {
        String array = "";
        for (var n = 0; n < arrayLength; n++) {
            if (n == hiddenIndex) {
                startNumber = startNumber + progressionNumber;
                array = array + " ..";
            } else {
                array = array + " " + startNumber;
                startNumber = startNumber + progressionNumber;
            }
        }
        return array;
    }
    public static String getCorrectAnswer(int arrayLength, int startNumber, int progressionNumber, int hiddenIndex) {
        String correctAnswer = "";
        for (var n = 0; n < arrayLength; n++) {
            if (n == hiddenIndex) {
                correctAnswer = "" + startNumber; //это будет правильный ответ
                startNumber = startNumber + progressionNumber;
            }
            startNumber = startNumber + progressionNumber;
        }
        return correctAnswer;
    }
}
