import java.util.Scanner;

public class ex16 {
    Scanner input = new Scanner(System.in);

    public void BarChart(){
        System.out.println("Input some number: ");
        int n = input.nextInt();

        char[] barChart = new char[n+1];

        for (int number = 1; number < barChart.length; number++) {
            System.out.printf("%3d:  ",number);
            for (int stars = 0; stars < number; stars++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }

    public void BarChartCustomizable(){
        int[] barChart = new int[5];
        System.out.println("Input values of 5 rows:");

        for(int row = 0; row < barChart.length; row++){
            barChart[row] = input.nextInt();
        }

        for (int row = 0; row < barChart.length; row++) {
            System.out.printf("%3d:  ", barChart[row]);
            for (int stars = 0; stars < barChart[row]; stars++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

