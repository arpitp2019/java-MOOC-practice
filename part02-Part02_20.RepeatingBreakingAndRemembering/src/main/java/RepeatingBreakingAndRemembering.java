import java.util.Scanner;

public class RepeatingBreakingAndRemembering{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give numbers:");
		printstring(scanner);
		scanner.close();		
	}

	public static void printstring(Scanner scanner){
        int oddCount = 0;
        int evenCount = 0;
        int count = -1;
        int sum = 1;
        while (true){
            int inputNumber = scanner.nextInt();
            sum = sum + inputNumber;
            count++;
            double avg = (double)sum / count;
            if (inputNumber % 2 == 0 && inputNumber >= 0){
                evenCount++;
            }else if (inputNumber % 2 != 0 && inputNumber >= 0){
                oddCount++;
            }


		    if (inputNumber == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " + avg);
                System.out.println("Even: " + evenCount);
                System.out.println("Odd: " + oddCount);
                break;
            }
		}
	}
}