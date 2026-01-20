import java.util.Scanner;
public class Positivity{
    public static void main(String[] args){
        Scanner scnn = new Scanner(System.in);
	    System.out.println("Give a number:");
	    int numberinput = Integer.valueOf(scnn.nextLine());
	    if (numberinput > 0){
		    System.out.println("The number is positive.");
	    } else{
		    System.out.println("The number is not positive.");
	    }
        scnn.close();
    }
}