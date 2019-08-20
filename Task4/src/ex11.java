import java.util.Scanner;

public class ex11 {
    public void SmallestNumber(){
        Scanner input = new Scanner(System.in);
         int[] array = new int[5];
        System.out.println("Input five random numbers:");
         for (int i = 0; i < 5; i++){
             array[i] = input.nextInt();
         }

         int min = array[0];
         for (int i = 0; i < array.length; i++){
                 if (min > array[i]){
                     min = array[i];
                 }
         }

        System.out.println("The smallest number of array is " + min);
    }
}
