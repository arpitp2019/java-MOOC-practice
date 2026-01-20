
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Give a string:");
        String givestringconv  = scann.nextLine();
        System.out.println("Give an integer:");
        int giveintegerconv = Integer.valueOf(scann.nextLine());
        System.out.println("Give a double:");
        double givedoubleconv = Double.valueOf(scann.nextLine());
        System.out.println("Give a boolean:");
        boolean givebooleanconv =Boolean.valueOf(scann.nextLine());
        System.out.println("You gave the string " + givestringconv);
        System.out.println("You gave the integer " + giveintegerconv);
        System.out.println("You gave the double " + givedoubleconv);
        System.out.println("You gave the boolean " + givebooleanconv);
        scann.close();
    }
}
