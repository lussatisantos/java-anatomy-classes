package edu.lussatisantos.thirdweek;

import java.util.Locale;
import java.util.Scanner;

public class Excpetion {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.UK);

            int agencyNumber;
            int accountNumber;
            String clientName;
            double balance;

            System.out.print("Enter agency number: ");
            agencyNumber = scanner.nextInt();
            System.out.print("Enter account number: ");
            accountNumber = scanner.nextInt();
            System.out.print("Enter client name: ");
            clientName = scanner.next();
            System.out.print("Enter deposit amount: ");
            balance = scanner.nextDouble();

            System.out.println("Account Number: " + accountNumber);
            System.out.println("Agency Number: " + agencyNumber);
            System.out.println("Client Name: " + clientName);
            System.out.println("Current Balance: " + balance);

            System.out.print("Hello " + clientName + " welcome in our bank, your balance " + balance + " is now available");

            scanner.close();
        }
}
