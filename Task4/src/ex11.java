import java.util.Scanner;

public class ex11 {
    public void SmallestNumber(){
        Scanner input = new Scanner(System.in);
         int[] array = new int[10];
         for (int i = 0; i < 10; i++){
             array[i] = input.nextInt();
         }

         int min = 0;
         for (int i = 0; i < 10; i++){
                 if (array[0] > array[i]){
                     min = array[i];
                 }
                 else {
                     min = array[0];
                 }
         }

        System.out.println("The smallest number of array is " + min);
    }
}
