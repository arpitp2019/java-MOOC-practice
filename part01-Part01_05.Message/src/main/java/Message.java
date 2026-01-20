import java.util.Scanner;
public class Message {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a message:");
        String last_message = scanner.nextLine();
        System.out.println(last_message);
        scanner.close();
    }
}