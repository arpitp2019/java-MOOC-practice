/* import java.util.Scanner;
public class SpeedingTicket{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Give speed:");
	int speed = Integer.valueOf(scan.nextLine());
	if (speed > 120){
		System.out.println("Speeding ticket! " + speed);
	}
	scan.close();
    }
} */


import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {
        // specific to Java 21: JEP 445 allows simplified main methods (preview feature),
        // but this standard structure ensures compatibility without extra flags.
        
        // Use try-with-resources to automatically close the scanner
        try (var scan = new Scanner(System.in)) {
            System.out.println("Give speed:");
            
            // var inference (Java 10+) makes the type declaration cleaner
            var input = scan.nextLine();
            var speed = Integer.parseInt(input);

            if (speed > 120) {
                System.out.println("Speeding ticket! " + speed);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}