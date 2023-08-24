package hexlet.code;
import java.util.Scanner;
public class Engine {
    private static String name;

    Engine(String name) {
        this.name = name;
    }
    public static String greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        return name;
    }
}
