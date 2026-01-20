import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create three Statistics objects in the required order
        Statistics allNumbers = new Statistics();      // Sum of all numbers
        Statistics evenNumbers = new Statistics();     // Sum of even numbers
        Statistics oddNumbers = new Statistics();      // Sum of odd numbers
        
        System.out.println("Enter numbers:");
        
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            
            if (input == -1) {
                break;  // Stop when -1 is entered
            }
            
            // Add to all numbers
            allNumbers.addNumber(input);
            
            // Check if even or odd and add accordingly
            if (input % 2 == 0) {
                evenNumbers.addNumber(input);  // Even number
            } else {
                oddNumbers.addNumber(input);   // Odd number
            }
        }
        
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
    }
}
