
public class MainProgram {

    public static void main(String[] args) {
        PaymentCard paul = new PaymentCard(20);
        PaymentCard matt = new PaymentCard(30);
        paul.eatHeartily();
        matt.eatAffordably();
        System.out.println("Paul: The card has a balance of " + paul.getBalance() + " euros");
        System.out.println("Matt: The card has a balance of "+ matt.getBalance() +" euros");
        paul.addMoney(20);
        matt.eatHeartily();
        System.out.println("Paul: The card has a balance of "+ paul.getBalance() + " euros");
        System.out.println("Matt: The card has a balance of "+ matt.getBalance() + " euros");
        paul.eatAffordably();
        paul.eatAffordably();
        matt.addMoney(50);
        System.out.println("Paul: The card has a balance of " + paul.getBalance() +" euros");
        System.out.println("Matt: The card has a balance of " +matt.getBalance() +" euros");


    }
}
