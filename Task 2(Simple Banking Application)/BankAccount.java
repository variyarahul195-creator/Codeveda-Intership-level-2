import java.util.Scanner;

public class BankAccount {
    Double balance = 0.0;
    Scanner sc= new Scanner(System.in);

    public void deposit(){
        System.out.println("Enter the amount to be deposited:");
        Double amount = sc.nextDouble();
        System.out.println("Amount deposited successfully.");
        balance += amount;
    }

    public void withdraw(){
        System.out.println("Enter the amount to be withdrawn:");
        Double amount = sc.nextDouble();
        if(amount > balance){
            System.out.println("Insufficient Funds.");
        } else {
            System.out.println("Amount withdrawn successfully.");
            balance -= amount;
        }
    }

    public void checkBalance(){
        System.out.println("Current balance: " + balance);
    }
}
