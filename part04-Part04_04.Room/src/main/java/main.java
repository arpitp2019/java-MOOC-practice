import java.util.Scanner;

public class main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the room code!");
        String input = scanner.nextLine();
        Room arpit = new Room("arpit1453", 3);
        arpit.roomOccupancyCheck(input);
        scanner.close();
    }
}
