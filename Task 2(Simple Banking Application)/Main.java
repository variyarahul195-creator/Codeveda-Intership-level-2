import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account =  new BankAccount();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.deposit();
                    break;
            
                case 2:
                    account.withdraw();
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    sc.close();
                    return;
            }
        }
    }
}
