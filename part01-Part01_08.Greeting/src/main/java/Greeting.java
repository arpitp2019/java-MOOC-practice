import java.util.Scanner;
    public class Greeting{
        public static void main (String[] args){
            Scanner reply = new Scanner(System.in);
            System.out.println("What's your name?");
            String replyto = reply.nextLine();
            System.out.println("Hi"+" " + replyto);
            reply.close();
        }
    }