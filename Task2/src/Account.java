public class Account {
    private String name; //instance variable
    private double money;

    Account(String name, double money){
        setName(name);
        setMoney(money);
    }

    //method to set the name
    public void setName(String name) {
        this.name = name; //store the name
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    //method to retrieve the name from the object
    public String getName() {
        return name; // return value of name to caller
    }

    public double Withdrow(int sum){

        return money - sum;
    }
}
