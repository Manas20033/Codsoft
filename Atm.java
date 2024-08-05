import java.util.*;

public class Atm {
    public static void main(String args[]){

        int Balance = 10000;
        int withdraw;
        int deposit;

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("Welcome to the automated teller machine :)");
            System.out.println("for withdraw Enter 1.");
            System.out.println("for deposit enter 2.");
            System.out.println("For check balance enter 3. ");
            System.out.println("For exit enter 4.");
            System.out.println("Choose operation you want to perfom.");
            
            int choice = sc.nextInt();
            switch(choice){
                
                case 1 : System.out.println("Enter money to be withdraw.");
                withdraw = sc.nextInt();
                if ( Balance >= withdraw){
                    Balance = Balance - withdraw ;
                    System.out.println("Pls Collect your money.");
                    System.out.println( "Available Balance is : "+ Balance);
                    System.out.println("Thank You :)");
                }else{
                    System.out.println("insuffeciant Fund");
                }
                break;
                
                case 2 :System.out.println("Enter the Amount to Deposit.");
                deposit = sc.nextInt();
                Balance = Balance + deposit;
                System.out.println("Your Money deposit Succesfully.");
                System.out.println("Your Balance Is : "+ Balance);
                System.out.println("Thank You :)");
                break;
                
                case 3: System.out.println("Your Aaccount Balance is : "+Balance);
                break;
                
                case 4 : 
                System.exit(0);
            }
        }
    }
}