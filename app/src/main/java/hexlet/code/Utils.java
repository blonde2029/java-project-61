package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomInt(int minValue, int maxValue) {
        Random random = new Random();
        return random.nextInt(minValue, maxValue);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static boolean isSimple(int number) {
        if (number < 2) {
            return true;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
