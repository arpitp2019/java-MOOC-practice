import java.util.Scanner;
import java.util.ArrayList;

public class LastInList{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newlist = new ArrayList<>();
        while (true){
            String line = scanner.nextLine();
            if (!line.equals("")){
                newlist.add(line);
            }else {
                break;
            }
        }
        System.out.println(newlist.get(newlist.size() - 1));   
        scanner.close();
    }
}
