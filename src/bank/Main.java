package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();

        while (true) {
            System.out.println("\n--- Banking Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Initial Balance: ");
                    double bal = sc.nextDouble();
                    service.createAccount(accNo, name, bal);
                    break;

                case 2:
                    System.out.print("Account Number: ");
                    service.deposit(sc.nextInt(), readAmount(sc));
                    break;

                case 3:
                    System.out.print("Account Number: ");
                    service.withdraw(sc.nextInt(), readAmount(sc));
                    break;

                case 4:
                    System.out.print("Account Number: ");
                    service.checkBalance(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static double readAmount(Scanner sc) {
        System.out.print("Amount: ");
        return sc.nextDouble();
    }
}
