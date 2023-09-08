package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final int MIN_RANDOM_VALUE = 5;
    static final int MAX_RANDOM_VALUE = 10;
    static final String GAME_RULE = "What number is missing in the progression?";
    public static void startGame(int attempts) {
        //сама игра
        String[][] questionsAndAnswers = new String[attempts][2];
        for (var i = 0; i < attempts; i++) {
            //подготовим вопрос
            int startNumber = Utils.getRandomInt(0, MAX_RANDOM_VALUE);
            int progressionNumber = Utils.getRandomInt(1, MAX_RANDOM_VALUE);
            int arrayLength = Utils.getRandomInt(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
            int hiddenIndex = Utils.getRandomInt(0, arrayLength);
            //сгенерируем массив
            int[] array = getArray(arrayLength, startNumber, progressionNumber);
            //заменим случайную позицию на ".."
            String arrayWithHiddenElem = getArrayWithHiddenElem(array, hiddenIndex);
            //вычислим правильный ответ
            String correctAnswer = String.valueOf(array[hiddenIndex]);
            //String correctAnswer = getCorrectAnswer(arrayLength, startNumber, progressionNumber, hiddenIndex);
            //запишем в массив вопрос и правильный ответ
            questionsAndAnswers[i][0] = arrayWithHiddenElem;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(questionsAndAnswers, GAME_RULE);
    }

    private static String getArrayWithHiddenElem(int[] array, int hiddenIndex) {
        String result = "";
        for (var i = 0; i < array.length; i++) {
            if (i == hiddenIndex) {
                result = result + " ..";
            } else {
                result = result + " " + array[i];
            }
        }
        return result;
    }

    public static int[] getArray(int arrayLength, int startNumber, int progressionNumber) {
        int[] array = new int[arrayLength];
        for (var n = 0; n < arrayLength; n++) {
            array[n] = startNumber;
            startNumber = startNumber + progressionNumber;
        }
        return array;
    }
}
