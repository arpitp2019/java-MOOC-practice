import java.util.Scanner;

class SimpleCalculator{
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Give the first number:");
	int numone = Integer.valueOf(scan.nextLine());
	System.out.println("Give the second number:");
	int numsecond = Integer.valueOf(scan.nextLine());
	int sum = numone + numsecond;
	int sub = numone - numsecond;
	int mul = numone * numsecond;
  	double div = (double) numone / (double) numsecond;
	System.out.println(numone + " + " + numsecond + " = " + sum);
	System.out.println(numone + " - " + numsecond + " = " + sub);
	System.out.println(numone + " * " + numsecond + " = " + mul);
	System.out.println(numone + " / " + numsecond + " = " + div);
	scan.close();
	}
}