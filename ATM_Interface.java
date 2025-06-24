import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void checkBalance() {
        System.out.println("\nYour current balance is: " + account.getBalance());
    }

    public void deposit(double amount) {
        if (account.deposit(amount)) {
            System.out.println("\nDone! " + amount + " deposited successfully.\nChoose option 1 to check balance.");
        } else {
            System.out.println("\nInvalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.println("\nDone! " + amount + " withdrawn successfully.\nChoose option 1 to check balance.");
        } else {
            System.out.println("\nInsufficient balance");
        }
    }
}

public class ATM_Interface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String validCardNumber = "1234567890123456";
        String validPin = "1234";

        BankAccount userAccount = new BankAccount(1000.0); 
        ATM atm = new ATM(userAccount);

        System.out.println("Welcome to the ATM ");

        System.out.print("\nDo you want help? (yes/no): ");
        String helpChoice = scanner.nextLine().trim().toLowerCase();

        if (helpChoice.equals("yes")) {
            System.out.println("\nHelp:");
            System.out.println("\n- Sample ATM Card No.: 1234567890123456");
            System.out.println("- Sample PIN         : 1234");
        }

        System.out.print("\nEnter your ATM Card Number (16 digits): ");
        String cardNumber = scanner.nextLine();

        System.out.print("\nEnter your PIN (4 digits): ");
        String pin = scanner.nextLine();

        if (cardNumber.equals(validCardNumber) && pin.equals(validPin)) {
            System.out.println("\nLogin successful! Access granted.");

            int choice;
            do {
                System.out.println("\nATM Menu:");
                System.out.println("\n1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");
                System.out.print("\nEnter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        atm.checkBalance();
                        break;

                    case 2:
                        System.out.print("\nEnter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;

                    case 3:
                        System.out.print("\nEnter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        atm.deposit(depositAmount);
                        break;

                    case 4:
                        System.out.println("\nThank you for using the ATM. Have a nice day!\n");
                        break;

                    default:
                        System.out.println("\nInvalid option. Please select from 1 to 4.");
                }

            } while (choice != 4);

        } else {
            System.out.println("\nInvalid card number or PIN. Plese check. \nAccess denied.");
        }

        scanner.close();
    }
}