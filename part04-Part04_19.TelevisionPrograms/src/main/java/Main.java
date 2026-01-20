import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Name: ");
            String inputName = scanner.nextLine();
            if (!inputName.isBlank()){
                System.out.println("Duration: ");
                int inputDuration = Integer.parseInt(scanner.nextLine());
                TelevisionProgram newObject = new TelevisionProgram(inputName,inputDuration);
                programs.add(newObject);
            }else{
                break;
            }
        }
        System.out.println("Program's maximum duration? ");
        int inputAskedDuration = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < programs.size(); i++){ 
            if (inputAskedDuration >= programs.get(i).getDuration()){
                System.out.println(programs.get(i).toString());
            }
        }
        scanner.close();
    }
}

