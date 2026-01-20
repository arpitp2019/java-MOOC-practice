import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args){
        Scanner putinteger = new Scanner(System.in);
        System.out.println("Give a number:");
        int newvar = Integer.valueOf(putinteger.nextLine());
        System.out.println("You gave the number " +newvar);
        putinteger.close();
    }
}