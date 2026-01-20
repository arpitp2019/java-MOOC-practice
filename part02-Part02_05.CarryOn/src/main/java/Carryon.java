/* import java.util.Scanner;
 
public class CarryOn {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        while (true) {
            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();
 
            if (input.equals("no")) {
                break;
            }
        }
    }
} */


public class CarryOn {
    public static void main(String[] args) {
    int number = 0;

    while (true) {
        number = number + 1;

        if (number >= 5) {
            break;
        }

        if (number < 5) {
            continue;
        }

        System.out.print(number + " ");
    }

    System.out.print(number + " ");
    }
}