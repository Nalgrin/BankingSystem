import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingInfo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int balance = 1000;
        int depositMoney;
        int withdrawMoney;
        int choice = 0;

        do {
            System.out.println("Welcome to the bank of Falgrin");
            System.out.println("1. Check your balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            

            try {
                choice = userInput.nextInt();


                if (choice == 1) {
                    System.err.println("\nYour balance is " + balance + "\n");
                } else if (choice == 2) {
                    System.err.print("Enter how much you want to deposit $");
                    depositMoney = userInput.nextInt();
                    balance += depositMoney;
                    System.err.println("You new balance is " + balance);
                } else if (choice == 3) {
                    System.err.print("Enter how much you want to withdraw $");
                    withdrawMoney = userInput.nextInt();
                    balance -= withdrawMoney;
                    System.err.println(" Your new balance is " + balance);
                } else if (choice == 4) {
                    System.err.println("Thank You for banking with Falgrin.");
                } else {
                    System.err.println("Error Invalid Option");
                }
            }   catch (InputMismatchException e) {
                System.err.println("Error: Please enter a valid number.");
                userInput.next();
            }
        }while (choice != 4);




    }
}
