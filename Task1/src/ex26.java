import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int number1 = input.nextInt();
        System.out.print("Enter second value: ");
        int number2 = input.nextInt();

        /////////////Check on multiple////////////////////
        if(number1 % number2 ==0){
            System.out.printf("%d is a multiple of the %d", number1, number2);
        }
        else {
            System.out.printf("%d is NOT multiple of the %d", number1, number2);
        }
        //////////////////////
    }
}
