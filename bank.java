class Account {
    private int balance;

    public Account(int initialBalance) {
        balance = initialBalance;
    }

    // Deposit money into the account
    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    // Withdraw money from the account
    public void withdraw(int amount) {
        // Withdrawal without checking for negative balance explicitly
        balance -= amount;
        System.out.println(amount + " withdrawn. Current balance: " + balance);
    }

    // Show the current balance
    public void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class bank {
    public static void main(String[] args) {
        Account myAccount = new Account(100);
        myAccount.deposit(50); 
        myAccount.withdraw(20); 
        myAccount.showBalance();
    }
}
/* 
import java.util.Scanner;

class Account {
    private int balance;

    // Constructor to initialize balance. Optional if you want to start with 0 balance.
    public Account(int initialBalance) {
        balance = initialBalance;
    }

    // Deposit money into the account
    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    // Withdraw money from the account
    public void withdraw(int amount) {
        // Withdrawal without checking for negative balance explicitly
        balance -= amount;
        System.out.println(amount + " withdrawn. Current balance: " + balance);
    }

    // Show the current balance
    public void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        // Prompt the user for initial balance
        System.out.print("Enter initial balance: ");
        int initialBalance = ob.nextInt();
        Account myAccount = new Account(initialBalance);

        // Prompt the user for deposit amount
        System.out.print("Enter deposit amount: ");
        int depositAmount = ob.nextInt();
        myAccount.deposit(depositAmount);

        // Prompt the user for withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        int withdrawalAmount = ob.nextInt();
        myAccount.withdraw(withdrawalAmount);

        // Show the current balance
        myAccount.showBalance();

        ob.close();
    }
}
*/