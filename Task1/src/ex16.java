import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        int number1,
                number2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter firs value: ");
        number1 = input.nextInt();

        System.out.print("Enter second value:");
        number2 = input.nextInt();

        if(number1 > number2){
            System.out.printf("%d is larger%n", number1);
        }
        if(number1 < number2){
            System.out.printf("%d is larger%n", number2);
        }
        if(number1 == number2){
            System.out.println("These numbers are equal");
        }
        ////////
    }
}
