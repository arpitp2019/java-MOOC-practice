import java.util.Scanner;
public class Ancient{
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		System.out.println("Give a year:");
		int capture = Integer.valueOf(inp.nextLine());
		if (capture < 2015){
			System.out.println("Ancient history!");
		}
	}
}
