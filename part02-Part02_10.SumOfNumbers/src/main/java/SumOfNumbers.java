
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    int sum = 0;
	    while (true){
			System.out.println("Give a number:");
		    int inputNumber = Integer.parseInt(scanner.nextLine());
		    if (inputNumber != 0){
			    sum = sum + inputNumber;
		    }else {
			    break;
		    }
		}
	    System.out.println("Sum of the numbers: " + sum);
		scanner.close();
	}  
}

