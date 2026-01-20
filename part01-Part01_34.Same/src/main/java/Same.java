import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String secondInput = scanner.nextLine();
        
        if (input.equals(secondInput)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        
        scanner.close();
    }
}
