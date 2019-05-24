public class ex31 {
    public static void main(String[] args) {
        System.out.println("number\tsquare\tcube");
//        System.out.printf("0\t\t%d\t\t%d%n", 0, 0);
//        System.out.printf("1\t\t%d\t\t%d%n", 1, 1);
//        System.out.printf("2\t\t%d\t\t%d%n", 2*2, 2*2*2);
//        System.out.printf("3\t\t%d\t\t%d%n", 3*3, 3*3*3);
//        System.out.printf("4\t\t%d\t\t%d%n", 4*4, 4*4*4);
//        System.out.printf("5\t\t%d\t\t%d%n", 5*5, 5*5*5);
//        System.out.printf("6\t\t%d\t\t%d%n", 6*6, 6*6*6);
//        System.out.printf("7\t\t%d\t\t%d%n", 7*7, 7*7*7);
//        System.out.printf("8\t\t%d\t\t%d%n", 8*8, 8*8*8);
//        System.out.printf("9\t\t%d\t\t%d%n", 9*9, 9*9*9);
//        System.out.printf("10\t\t%d\t\t%d%n", 10*10, 10*10*10);

        for (int n = 0; n <= 10; n++){
            System.out.printf("%d\t\t%d\t\t%d%n", n, n * n, n * n * n);
        }
    }
}
