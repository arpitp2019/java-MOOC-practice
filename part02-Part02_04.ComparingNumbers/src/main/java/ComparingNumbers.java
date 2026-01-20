import java.util.Scanner;

public class ComparingNumbers {
	public static void main (String[] args){
	    Scanner scanner = new Scanner(System.in);
	    int firstInput = Integer.parseInt(scanner.nextLine());
	    int secondInput = Integer.parseInt(scanner.nextLine());
	    if (firstInput > secondInput){
		    System.out.println(firstInput + " is greater than " + secondInput);
	    }else if (firstInput < secondInput){
		    System.out.println(firstInput + " is smaller than " + secondInput);
	    }else{
		    System.out.println(firstInput + " is equal to " + secondInput);
	    }
	    scanner.close();
	}
}
