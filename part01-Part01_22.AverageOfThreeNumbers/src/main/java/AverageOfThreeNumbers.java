import java.util.Scanner;
public class AverageOfThreeNumbers{
    public static void main(String[] args){
        Scanner suminput = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstnum = Integer.valueOf(suminput.nextLine());
	    System.out.println("Give the second number:");
	    int secondsum = Integer.valueOf(suminput.nextLine());
        System.out.println("Give the third number:");
	    int thirdsum = Integer.valueOf(suminput.nextLine());
        double threeAverage = ((double) firstnum + (double) secondsum + (double) thirdsum ) / 3;
	    System.out.println("The average is " + threeAverage);
	    suminput.close();

    }
}   
