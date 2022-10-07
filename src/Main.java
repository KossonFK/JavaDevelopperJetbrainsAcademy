import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("Hello! My name is Aid.\nI was created in 2020.");
        System.out.println("Please, remind me your name.!");
        name = scanner.nextLine();
        System.out.println("What a great name you have, ".concat(name));
    }
}