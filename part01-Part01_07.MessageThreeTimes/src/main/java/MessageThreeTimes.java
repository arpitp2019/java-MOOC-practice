import java.util.Scanner;
public class MessageThreeTimes {
 
    public static void main (String[] args){
        Scanner takeinput = new Scanner(System.in);
        System.out.println("Write a message:");
        String message = takeinput.nextLine();
        takeinput.close();
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}