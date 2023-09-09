package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomInt(int minValue, int maxValue) {
        Random random = new Random();
        return random.nextInt(minValue, maxValue);
    }
}
