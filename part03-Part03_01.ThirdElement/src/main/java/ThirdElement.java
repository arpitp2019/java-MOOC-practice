import java.util.Scanner;
import java.util.ArrayList;

public class ThirdElement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newlist = new ArrayList<>();
        while (true){
            String line = scanner.nextLine();
            if (!line.isEmpty()){
                newlist.add(line);
            }else {
                break;
            }
        }
        System.out.print(newlist.get(2));   
        scanner.close();
    }
}


