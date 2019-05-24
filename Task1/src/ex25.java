import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value: ");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.printf("%d is Odd %n", number);
        }
        else {
            System.out.printf("%d is Even %n", number);
        }
        //////////////
    }
}
