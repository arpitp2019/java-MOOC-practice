
import java.util.Scanner;

public class Room {
    private String code;
    private int seats;

    public Room(String roomCode, int roomSeat) {
        this.code = roomCode;
        this.seats = roomSeat;
    }

    public void roomOccupancyCheck(String roomcode){
        if (roomcode.equals(this.code)){
            System.out.println("Room is available");
        }else{
            System.out.println("Room Not Available");
        }
    }

}
