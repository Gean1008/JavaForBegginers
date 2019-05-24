import java.util.Scanner;

import static java.lang.Math.abs;

public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int number1 = input.nextInt();

        System.out.print("Enter second value: ");
        int number2 = input.nextInt();

        int sum = number1 + number2; //Calculate Sum

        int product = number1 * number2; // Calculate product

        int difference = abs(number1 - number2); //Calculate difference

        int quotient;
        //////////That doesn't work; I don't know why(((/////////
        /*if (number1 >= number2){
            quotient = number1 / number2;
        }
        if (number1 <= number2){
            quotient = number2 / number1;
        }*/
        //////////////////////////////////////////////////////

        quotient = number1 / number2; // Calculate quotient

        System.out.printf("Sum = %d%nProduct = %d%nDifference = %d%nQuotient = %d%n", sum, product, difference, quotient);
        ////////////
    }
}
