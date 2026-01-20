import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
	    if (Files.exists(Paths.get(file))){
            System.out.print("Lower bound? ");
            int lowerBound = Integer.valueOf(scanner.nextLine());
            System.out.print("Upper bound? ");
            int upperBound = Integer.valueOf(scanner.nextLine());
            int count = 0;
		    try(Scanner scanFile = new Scanner(Paths.get(file))){
			    while (scanFile.hasNextLine()){
                    int readings =Integer.valueOf(scanFile.nextLine());
				    if (readings >= lowerBound && readings <= upperBound){
					    count++;
				    }
			    }
		    }catch (Exception e){
			    System.out.println(e.getMessage());
		    }
            System.out.println("Numbers: " + count);
	    }else{
		    System.out.println("Entered file does not exists");
	    }
        scanner.close();
    }
}
