import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the circle radius\nr: ");
        int r = input.nextInt();
        double pi = 3.14159;

        System.out.printf("Diameter is %d%n", 2 * r); // Calculating diameter
        System.out.printf("Circumference is %f%n", 2 * pi * r); //Calculating circumference
        System.out.printf("Area is %f%n", pi * r * r); // Calculating area

    }
}
