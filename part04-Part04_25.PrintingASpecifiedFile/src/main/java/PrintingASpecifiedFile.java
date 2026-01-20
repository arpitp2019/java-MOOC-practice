import java.util.Scanner;
import java.nio.file.Paths;
import java.nio.file.Files;

public class PrintingASpecifiedFile{
	public static void main(String[] args){
		System.out.println("Which file should have its contents printed?");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();
		if (Files.exists(Paths.get(fileName))){
			try(Scanner scanningFile = new Scanner(Paths.get(fileName))){
				while (scanningFile.hasNextLine()){
				    System.out.println(scanningFile.nextLine());
                }
			}catch (Exception e){
				System.out.println(e.getMessage());
			}
		}else{
			System.out.println("File does not exists");
		}
        scanner.close();
	}
}
