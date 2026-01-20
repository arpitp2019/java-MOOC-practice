import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something:");
        // Boolean.valueOf converts "true" (case-insensitive) to true.
        // Any other string defaults to false.
        boolean value = Boolean.valueOf(scanner.nextLine());

        System.out.println("True or false? " + value);
    }
}