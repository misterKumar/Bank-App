import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("which bank you chose to create an account i.e., SBI or HDFC");
        String str=sc.nextLine();
        if(str.toLowerCase().equals("sbi")) {
            System.out.println("Welcome to SBI\n");
            System.out.println("Enter the name and initial balance and password ");
            String name = sc.nextLine();
            String password = sc.next();
            int balance = sc.nextInt();


            //Creation of the account in SBI
            SBIUser acc1 = new SBIUser(name, balance, password);
            System.out.println("The account of new SBI Account is" + acc1.getAccountNo());

            //add money
            System.out.println("Enter the money that you want to add ");
            int money = sc.nextInt();
            acc1.addMoney(money);

            //Check balance
            int newBalance = acc1.getBalance();
            System.out.println("The new balance is " + newBalance);

            //Withdraw money
            System.out.println("Withdraw money");
            int amt = sc.nextInt();
            System.out.println("Enter the password");
            String enteredPassword = sc.next();
            String result = acc1.withDrawMoney(amt, enteredPassword);
            System.out.println(result);

            // interest
            System.out.println("The interest for 10 years on " + acc1.getBalance() + " Rs will be: " + acc1.calculateInterest(10));

        }
        else if(str.toLowerCase().equals("hdfc")){
            System.out.println("Welcome to HDFC\n");

            System.out.println("Enter the name and initial balance and password ");
            String name = sc.next();
            String password = sc.next();
            int balance = sc.nextInt();


            //Creation of the account in HDFC
            HDFCUser acc1 = new HDFCUser(name, balance, password);
            System.out.println("The account of new HDFC Account is" + acc1.getAccountNo());

            //add money
            System.out.println("Enter the money that you want to add ");
            int money = sc.nextInt();
            acc1.addMoney(money);

            //Check balance
            int newBalance = acc1.getBalance();
            System.out.println("The new balance is " + newBalance);

            //Withdraw money
            System.out.println("Withdraw money");
            int amt = sc.nextInt();
            System.out.println("Enter the password");
            String enteredPassword = sc.next();
            String result = acc1.withDrawMoney(amt, enteredPassword);
            System.out.println(result);

            // interest
            System.out.println("The interest for 10 years on " + acc1.getBalance() + " Rs will be: " + acc1.calculateInterest(10));
        }

    }
}