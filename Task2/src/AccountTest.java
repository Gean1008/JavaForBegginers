/**
 * 3.11 (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
 the Account’s balance. If it does, the balance should be left unchanged and the method should print
 a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
 (Fig. 3.9) to test method withdraw.
 */

// Creating and manipulating an Accaunt object.
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        //create a Scanner object to obtain input from the command
        Scanner input = new Scanner(System.in);

        //create an Account object and assign
        Account Account1 = new Account("Adam", 5000);
        Account Account2 = new Account("Chris", 3500);

                        // display initial value of name (null)
                        //System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        //prompt for and read name
//        System.out.println("Please enter the name and cash: ");
//        String theName = input.nextLine();//read a line of text
//        double theMoney = input.nextFloat();
//        Account1.setName(theName);// put theName in myAccount
//        Account1.setMoney(theMoney);
//        System.out.println(); //outputs a blank line
        System.out.printf("Name: %s%nCash: %.2f%n", Account1.getName(), Account1.getMoney());
        System.out.printf("Name: %s%nCash: %.2f%n", Account2.getName(), Account2.getMoney());
        System.out.println("Please enter the sum you want to withdraw" + Account1.getName() + ": ");


        int theSum;
        for (theSum = input.nextInt(); Account1.Withdrow(theSum) < 0;){
            System.out.println("Not enough money on Account! Try one more time");
            theSum = input.nextInt();
        }

        System.out.println();


        //display the name stored in object myAccont
        System.out.printf("%nCash after last operation: %.2f%n", Account1.Withdrow(theSum));
    }
}
