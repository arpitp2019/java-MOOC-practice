import java.util.Scanner;
public class GradesAndPoints{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int numberinput = Integer.valueOf(scn.nextLine());
	    if (numberinput < 0){
		    System.out.println("Grade: impossible!");
	    }else if (numberinput >= 0 && numberinput <= 49){    
		    System.out.println("Grade: failed");
	    }else if (numberinput >= 50 && numberinput <= 59){
		    System.out.println("Grade: 1");
	    }else if(numberinput >= 60 && numberinput <= 69) {
	        System.out.println("Grade: 2");	
        }else if (numberinput >= 70 && numberinput <= 79){
	        System.out.println("Grade: 3");
        }else if (numberinput >= 80 && numberinput <= 89){		
            System.out.println("Grade: 4");	
        }else if (numberinput >= 90 && numberinput <= 100){
	        System.out.println("Grade: 5");
	    }else {
		    System.out.println("Grade: incredible!");
	    }
	    scn.close();
    }
}