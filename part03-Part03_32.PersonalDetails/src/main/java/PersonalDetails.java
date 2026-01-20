
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearSum = 0;
        int count = 0;
        String updatedName = "";
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String [] inputAnalysis = input.split(",");
            String inputName = inputAnalysis[0];
            int updatedYearNumber = Integer.parseInt(inputAnalysis[1]);
            if (inputName.length() > updatedName.length()){
                updatedName = inputName;
            }
            yearSum = yearSum + updatedYearNumber;
            count++;
        }
        if (count == 0){
            System.out.println("No Input!");
        }else{
        Double avg = (double) yearSum / count;
        System.out.println("Longest name: " + updatedName);
        System.out.println("Average of the birth years: " + avg);
        }
        scanner.close();

    }
}
