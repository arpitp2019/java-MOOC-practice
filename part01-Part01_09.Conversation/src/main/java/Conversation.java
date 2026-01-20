
import java.util.Scanner;

public class Conversation {
    public static void main(String[] args){
        Scanner starting = new Scanner(System.in);
        System.out.println("Greetings! How are you doing?");
        starting.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        starting.nextLine();
        System.out.println("Thanks for sharing!");
        starting.close();
    }
}