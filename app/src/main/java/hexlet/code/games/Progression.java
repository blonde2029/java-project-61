package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void startGame(int attempts) {
        //сама игра
        final int minRandomValue = 5;
        final int maxRandomValue = 10;
        String gameRule = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[attempts][2];
        for (var i = 0; i < attempts; i++) {
            //подготовим вопрос
            int startNumber = Utils.getRandomInt(maxRandomValue);
            int progressionNumber = Utils.getRandomInt(1, maxRandomValue);
            int arrayLength = Utils.getRandomInt(minRandomValue, maxRandomValue);
            int hiddenIndex = Utils.getRandomInt(arrayLength);
            //сгенерируем массив
            int[] array = getArray(arrayLength, startNumber, progressionNumber);
            //заменим случайную позицию на ".."
            String arrayWithHiddenElem = getArrayWithHiddenElem(array, hiddenIndex);
            //вычислим правильный ответ
            String correctAnswer = getCorrectAnswer(arrayLength, startNumber, progressionNumber, hiddenIndex);
            //запишем в массив вопрос и правильный ответ
            questionsAndAnswers[i][0] = arrayWithHiddenElem;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(questionsAndAnswers, gameRule);
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
    public static String getCorrectAnswer(int arrayLength, int startNumber, int progressionNumber, int hiddenIndex) {
        String correctAnswer = "";
        for (var n = 0; n < arrayLength; n++) {
            if (n == hiddenIndex) {
                correctAnswer = "" + startNumber; //это будет правильный ответ
                return correctAnswer;
            }
            startNumber = startNumber + progressionNumber;
        }
        return correctAnswer;
    }
}
