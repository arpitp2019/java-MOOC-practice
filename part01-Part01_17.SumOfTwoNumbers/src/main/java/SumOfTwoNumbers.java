import java.util.Scanner;
public class SumOfTwoNumbers{
    public static void main(String[] args){
        Scanner suminput = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstnum = Integer.valueOf(suminput.nextLine());
	System.out.println("Give the second number:");
	int secondsum = Integer.valueOf(suminput.nextLine());
	System.out.println("The sum of the numbers is " + (firstnum + secondsum));
	suminput.close();

    }
}