/* 
import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int number = scanner.nextInt();
        
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        
        System.out.println("Factorial: " + factorial);
        scanner.close();
    }
}
*/
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.logging.Logger;

public class Factorial {
    private static final Logger LOGGER = Logger.getLogger(Factorial.class.getName());
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            LOGGER.info("Application started");
            
            System.out.print("Give a number: ");
            int number = scanner.nextInt();
            
            LOGGER.info("User entered number: " + number);
            
            int factorial = calculateFactorial(number);
            System.out.println("Factorial: " + factorial);
            
            LOGGER.info("Factorial calculated successfully: " + factorial);
            
        } catch (InputMismatchException e) {
            System.err.println("Error: Please enter a valid integer");
            LOGGER.warning("Invalid input provided - not an integer: " + e.getMessage());
            
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            LOGGER.warning("Invalid argument provided: " + e.getMessage());
            
        } finally {
            scanner.close();
            LOGGER.info("Application finished");
        }
    }
    
    public static int calculateFactorial(int n) {
        int factorial;
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        } else if (n == 0) {
            factorial = 1;  // 0! = 1
        } else {
            factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
        }
        
        return factorial;
    }
}
