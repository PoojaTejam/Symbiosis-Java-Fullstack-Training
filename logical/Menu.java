import java.util.Scanner;

class Demo20 {
    int PASSWORD = 12345;
     double balance = 0.0;
   
   Scanner sc = new Scanner(System.in);
    public void check() {
        System.out.println("Enter Password:");
        int password = sc.nextInt();

        if (password == PASSWORD) {
            System.out.println("Password matched");
            do {
                int choice;

                System.out.println("\nMenu:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Show Balance");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        balance += depositAmount;
                        System.out.println("Deposit successful");
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        if (withdrawAmount <= balance) {
                            balance -= withdrawAmount;
                            System.out.println("Withdrawal successful" );
                        } else {
                            System.out.println("Insufficient bal.");
                        }
                        break;
                    case 3:
                        System.out.println("Your current balance is: "+ balance) ;
                        break;
                    case 4:
                        System.out.println("Exiting program");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (true);
        } else {
            System.out.println("Password not matched. enter again");
        }
    }
}

public class Menu {
    public static void main(String[] args) {
        Demo20 d = new Demo20();
        d.check();
    }
}
