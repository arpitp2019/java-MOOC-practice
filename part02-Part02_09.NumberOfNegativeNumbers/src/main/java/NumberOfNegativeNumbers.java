
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    int count = 0;
	    while (true){
		    System.out.println("Give a number: ");
		    int inputNumber = Integer.parseInt(scanner.nextLine());
		    if (inputNumber > 0){
			    continue;			
		    }else if (inputNumber < 0){
			    count++;
		    }else {
			    break;
		    }
        }
	    System.out.println("Number of negative numbers: " + count);	
	    scanner.close();
    }
}

