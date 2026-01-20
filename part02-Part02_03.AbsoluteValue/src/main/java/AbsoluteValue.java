
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 0) {
            System.out.println(-number);
        } else {
            System.out.println(number); 
        }
        scanner.close();
    }
}
