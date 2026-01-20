import java.util.Scanner;
public class SumOfThreeNumbers{
    public static void main(String[] args){
        Scanner suminput = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstnum = Integer.valueOf(suminput.nextLine());
	    System.out.println("Give the second number:");
	    int secondsum = Integer.valueOf(suminput.nextLine());
        System.out.println("Give the third number:");
	    int thirdsum = Integer.valueOf(suminput.nextLine());
	    System.out.println("The sum of the numbers is " + (firstnum + secondsum + thirdsum));
	    suminput.close();

    }
} 

