import java.util.Scanner;
public class AverageOfTwoNumbers{
    public static void main(String[] args){
        Scanner suminput = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstnum = Integer.valueOf(suminput.nextLine());
	    System.out.println("Give the second number:");
	    int secondsum = Integer.valueOf(suminput.nextLine());
        double TwoAverage = ((double) firstnum + (double) secondsum) / 2;
	    System.out.println("The average is " + TwoAverage);
	    suminput.close();

    }
}   
