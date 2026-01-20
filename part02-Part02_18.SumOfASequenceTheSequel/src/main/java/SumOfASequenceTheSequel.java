import java.util.Scanner;

public class SumOfASequenceTheSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int firstNum = scanner.nextInt();
        System.out.print("Last number? ");
        int secondNum = scanner.nextInt();
        int finalSum = calculateSum(firstNum, secondNum);
        System.out.println("The sum is " + finalSum);
        scanner.close();
    }

    public static int calculateSum(int firstNum, int secondNum) {
        int sum = 0;
        for (int i = firstNum; i <= secondNum; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
