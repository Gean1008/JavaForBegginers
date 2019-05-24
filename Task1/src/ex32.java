import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = new int[6];
        for (int i = 0; i < 5; i++){
            System.out.printf("Enter %d number: ", i+1);
            number[i] = input.nextInt();
            }
        System.out.println();

        for (int i = 0; i < 5; i++){
            if (number[i] < 0){
                System.out.printf("%d is negative%n", number[i]);
            }
            else if (number[i] > 1){
                System.out.printf("%d is positive%n", number[i]);
            }
            else {
                System.out.printf("%d is zero%n", number[i]);
            }
        }

    }
}
