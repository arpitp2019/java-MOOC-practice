
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> newlist = new ArrayList<>();
        while (true){
            int line = scanner.nextInt();
            if (line != 0){
                newlist.add(line);
            }else {
                break;
            }
        }
        System.out.print(newlist.get(1)+newlist.get(2));
        scanner.close();
    }
}
