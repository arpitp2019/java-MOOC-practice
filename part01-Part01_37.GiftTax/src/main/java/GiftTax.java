
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double giftamount = Integer.parseInt(scan.nextLine());
		if (giftamount >= 5000 && giftamount < 25000){
			giftamount = (100 + (giftamount-5000) * 0.08);
			System.out.println("Tax: " + giftamount);
        }else if (giftamount > 25000 && giftamount <= 55000){			
            giftamount = (1700 + (giftamount-25000) * 0.10);
			System.out.println("Tax: " + giftamount);
        }else if (giftamount > 55000 && giftamount < 200000){
			giftamount = (4700 + (giftamount-55000) * 0.12);
			System.out.println("Tax: " + giftamount);
        }else if (giftamount >200000 && giftamount < 1000000){
			giftamount = (22100 + (giftamount-200000) * 0.15);
			System.out.println("Tax: " + giftamount);
        }else if (giftamount >= 1000000){
			giftamount = (142100 + (giftamount-1000000) * 0.17);
			System.out.println("Tax: " + giftamount);
        }else {
			System.out.println("No tax!");
        }
	    scan.close();
	}
}
	