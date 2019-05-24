import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.printf("%d\t", number / 10000);
        System.out.printf("%d\t", number % 10000 / 1000);
        System.out.printf("%d\t", number % 10000 % 1000 / 100);
        System.out.printf("%d\t", number % 10000 % 1000 % 100 / 10);
        System.out.printf("%d\t", number % 10000 % 1000 % 100 % 10);
    }
}
