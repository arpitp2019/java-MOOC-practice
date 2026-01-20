
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
	    try (Scanner readFile = new Scanner(Paths.get(file))){
		    while (readFile.hasNextLine()){
			    String [] details = readFile.nextLine().split(",");
			    String name = details[0];
			    int age = Integer.valueOf(details[1]);
			    Person personx = new Person(name, age);
                persons.add(personx);
		    }
	    }catch (Exception e){
		    System.out.println(e.getMessage());
	    }
        return persons;
    }
}
