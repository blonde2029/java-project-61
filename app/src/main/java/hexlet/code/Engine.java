package hexlet.code;
import java.util.Scanner;
public class Engine {

    public static String  greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");
        return name;
    }


}
