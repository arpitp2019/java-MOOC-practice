import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> lists = new ArrayList<>();

        if (Files.exists(Paths.get(file))) {
            try (Scanner scanFile = new Scanner(Paths.get(file))) {
                while (scanFile.hasNextLine()) {
                    String content = scanFile.nextLine();
                    lists.add(content);
                }
            } catch (Exception e) {
                System.out.println("Reading the file " + file + " failed.");
            }
        } else {
            System.out.println("Reading the file " + file + " failed.");
        }

        if (lists.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
        
        scanner.close();
    }
}
