import java.util.Scanner;

/**
 * Created by robertcampos on 11/30/16.
 */
public class Customer {
    private String name;
    private int balance;
    private String function;
    private Scanner input = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void chooseFunction() throws Exception {
        System.out.println("Check Balance, Withdraw, Cancel");
        String function = input.nextLine();

        if (function.equalsIgnoreCase("Check Balance")) {
            System.out.println("Your balance is $100");
        }

        else if (function.equalsIgnoreCase("Withdraw")) {
            System.out.println("How much would you like to withdraw?");
            int amount = Integer.parseInt(this.input.nextLine());
            if (amount > balance) {
                balance -= amount;
                throw new Exception("Funds not available");
            }
            }
        else if (function.equalsIgnoreCase("Cancel")) {
                System.out.println("Thank you, come again!");
            }
            else {
                System.out.println("Invalid");
                chooseFunction();
            }

    }
}
