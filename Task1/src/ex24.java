import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[ ] number = new int[6];
        for(int i = 1; i < 6; i++){
            System.out.printf("Enter %d value: ", i);
            number[i] = input.nextInt();
        }
        ///////////////////Finding Smallest//////////////////////
        if(number[1] < number[2] && number[1] < number[3] && number[1] < number[4] && number[1] < number[5]){
            System.out.printf("Is smallest %d", number[1]);
        }
        if(number[2] < number[1] && number[2] < number[3] && number[2] < number[4] && number[2] < number[5]){
            System.out.printf("Is smallest %d", number[2]);
        }
        if(number[3] < number[2] && number[3] < number[1] && number[3] < number[4] && number[3] < number[5]){
            System.out.printf("Is smallest %d", number[3]);
        }
        if(number[4] < number[2] && number[4] < number[3] && number[4] < number[1] && number[4] < number[5]){
            System.out.printf("Is smallest %d", number[4]);
        }
        if(number[5] < number[2] && number[5] < number[3] && number[5] < number[4] && number[5] < number[1]){
            System.out.printf("Is smallest %d", number[5]);
        }
        ////////////////////////////////////

        System.out.println();

        /////////////Finding largest/////////////////////////////
        if(number[1] > number[2] && number[1] > number[3] && number[1] > number[4] && number[1] > number[5]){
            System.out.printf("Is largest %d", number[1]);
        }
        if(number[2] > number[1] && number[2] > number[3] && number[2] > number[4] && number[2] > number[5]){
            System.out.printf("Is largest %d", number[2]);
        }
        if(number[3] > number[2] && number[3] > number[1] && number[3] > number[4] && number[3] > number[5]){
            System.out.printf("Is largest %d", number[3]);
        }
        if(number[4] > number[2] && number[4] > number[3] && number[4] > number[1] && number[4] > number[5]){
            System.out.printf("Is largest %d", number[4]);
        }
        if(number[5] > number[2] && number[5] > number[3] && number[5] > number[4] && number[5] > number[1]){
            System.out.printf("Is largest %d", number[5]);
        }
        //////////////////////////////////////////


    }
}
