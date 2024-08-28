import java.util.Scanner;

public class ATMExample {
    private int balance = 100000; // Initial account balance

    public static void main(String[] args) {
        ATMExample atm = new ATMExample();
        atm.run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose the operation you want to perform: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    withdraw(sc);
                    break;
                case 2:
                    deposit(sc);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private void withdraw(Scanner sc) {
        System.out.print("Enter amount to be withdrawn: ");
        int withdrawAmount = sc.nextInt();

        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println("Please collect your money.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    private void deposit(Scanner sc) {
        System.out.print("Enter amount to be deposited: ");
        int depositAmount = sc.nextInt();

        balance += depositAmount;
        System.out.println("Your money has been successfully deposited.");
    }

    private void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}
