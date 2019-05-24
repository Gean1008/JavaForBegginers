import static java.lang.Math.abs;

public class ex18 {
    private int id;
    private int balance;
    private int charge;
    private int credits;
    private int allowCredits;

    public ex18(int id, int balance, int charge, int credits, int allowCredits) {
        this.id = id;
        this.balance = balance;
        this.charge = charge;
        this.credits = credits;
        this.allowCredits = allowCredits;
    }

    public void LimitCalculator()
    {
        for (int i = id; i < 10; i++) {
            id = i;
            if (i%2 == 0){
                balance += 400;
                charge -= 400;
                credits +=350;
            }else {
                balance -= 500;
                charge += 200;
                credits -= 250;
            }

            int newBalance = balance + charge - credits;
            System.out.println(id + ". " + balance + " " + charge + " " + credits + " " + allowCredits);
            if (abs(newBalance) > allowCredits){
                System.out.println("Credit limit exceeded!");
            }else {
                System.out.println("Updated balance: " + newBalance);
            }
            System.out.println("--------------------------------------------------");

        }
    }
}
