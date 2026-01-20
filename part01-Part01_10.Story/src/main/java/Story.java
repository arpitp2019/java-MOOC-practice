import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Line 1: Ask Name
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String name = reader.nextLine();
        //System.out.println(name);

        // Line 3: Ask Job
        System.out.println("What is their job?");
        String job = reader.nextLine(); // Line 4: User types job
        System.out.println("Here is the story:");

        // Lines 5-7: Print the story in three separate parts
        System.out.println("Once upon a time there was " + name + ", who was "+ job +".");
        System.out.println("On the way to work, " + name + " reflected on life.");
        System.out.println("Perhaps " + name + " will not be " + job + " forever.");
        
        reader.close();
    }
}