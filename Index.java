import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to OASIS ATM");
        System.out.println("Please enter your User ID and Password : ");
        int Id = sc.nextInt() , password = sc.nextInt();

        boolean quite = false ;
        while (! quite){

            System.out.println("Select :");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
        
            int choosed = sc.nextInt();
            if (choosed == 1){
    
                //Transaction History
                
            }else if (choosed == 2){

                //Withdraw
                
            }else if (choosed == 3) {
            
                //Deposit
                
            }else if (choosed == 4) {
            
                //Transfer
                
            }else if (choosed == 5) {
                quite=true;
            } else {
                System.out.println("Please enter correct choise between 1-5");
            }
        }
    }
}
