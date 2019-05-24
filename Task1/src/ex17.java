import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int number1 = input.nextInt();
        System.out.print("Enter second value: ");
        int number2 = input.nextInt();
        System.out.print("Enter third value: ");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3; //calculate sum
        System.out.printf("Sum = %d%n", sum);
        int avg = (number1 + number2 + number3)/3; //calculate average
        System.out.printf("Average = %d%n", avg);
        int prod = number1 * number2 * number3; //calculate product
        System.out.printf("Product = %d%n", prod);

        //Finding the smallest value
        if(number1 < number2 && number1 < number3){
            System.out.printf("Is smallest %d%n", number1);
        }
        if(number2 < number1 && number2 < number3){
            System.out.printf("Is smallest %d%n", number2);
        }
        if(number3 < number1 && number3 < number2){
            System.out.printf("Is smallest %d%n", number3);
        }

        //Finding the largest value
        if(number1 > number2 && number1 > number3){
            System.out.printf("Is largest %d%n", number1);
        }
        if(number2 > number1 && number2 > number3){
            System.out.printf("Is largest %d%n", number2);
        }
        if(number3 > number1 && number3 > number2){
            System.out.printf("Is largest %d%n", number3);
        }
        //////
    }
}
