import java.util.Scanner;
public class Adulthood{
    public static void main(String[] args){
        Scanner scnn = new Scanner(System.in);
	    System.out.println("How old are you?");
	    int ageinput = Integer.valueOf(scnn.nextLine());
	    if (ageinput < 18){
		    System.out.println("You are not an adult");
	    } else{
		    System.out.println("You are an adult");
	    }
        scnn.close();
    }
}