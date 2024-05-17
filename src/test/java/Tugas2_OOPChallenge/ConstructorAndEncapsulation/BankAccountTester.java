package Tugas2_OOPChallenge.ConstructorAndEncapsulation;
import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Enter account number:");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial balance:");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // Mengonsumsi newline yang tersisa

        System.out.print("Enter customer name:");
        String customerName = scanner.nextLine();

        System.out.print("Enter customer email:");
        String customerEmail = scanner.nextLine();

        System.out.print("Enter customer phone number:");
        String customerPhone = scanner.nextLine();

        // Membuat instance dari BankAccount dengan data yang diinputkan pengguna
        BankAccount ba = new BankAccount(accountNumber, balance, customerName, customerEmail, customerPhone);

        // Interaksi untuk deposit dan withdraw
        System.out.println("Would you like to deposit or withdraw? (deposit/withdraw):");
        String action = scanner.nextLine();

        if (action.equalsIgnoreCase("deposit")) {
            System.out.println("Enter amount to deposit:");
            double amount = scanner.nextDouble();
            ba.deposit(amount);
        } else if (action.equalsIgnoreCase("withdraw")) {
            System.out.print("Enter amount to withdraw:");
            double amount = scanner.nextDouble();
            ba.withdraw(amount);
        } else {
            System.out.print("Invalid option selected.");
        }

        // Menampilkan saldo akhir
        System.out.println("Final balance: $" + ba.getBalance());

        scanner.close();
    }
}
