
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String [] listt = input.split(" ");
            for (String list : listt){
                if (list.contains("av")){
                    System.out.println(list);
                }
            }
        }
        scanner.close();
    }
}
