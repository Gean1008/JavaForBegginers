import java.util.Scanner;

public class ex17 {
//    private int miles;
//    private int gallons;
//
//    public void setMiles(int miles) {
//        this.miles = miles;
//    }
//
//    public void setGallons(int gallons){
//        this.gallons = gallons;
//    }

    Scanner input = new Scanner(System.in);

    public void Calculate(){
        System.out.print("Input the driven miles and gallons: ");
        int miles = input.nextInt();
        int gallons = input.nextInt();

        double spending = (double) gallons / (double) miles;
        System.out.printf("Spending on the trip of %d miles is: %.1f gallons per mile", miles, spending);
    }
}
