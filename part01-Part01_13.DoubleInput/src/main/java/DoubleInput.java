import java.util.Scanner;
public class DoubleInput{
    public static void main(String[] args){
        Scanner doubleread = new Scanner(System.in);
        System.out.println("Give a number:");
        double newdouble = Double.valueOf(doubleread.nextLine());
        System.out.println("You gave the number " + newdouble);
        doubleread.close();
    }
}