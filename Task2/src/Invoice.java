public class Invoice {
    private String number;
    private String description;
    private int qty;
    private double price;

    Invoice(String number, String description, int qty, double price){
        setNumber(number);
        setDescription(description);
        setQty(qty);
        setPrice(price);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInvoiceAmount(){
        return (price > 0 ? price : 0.0) * (qty > 0 ? qty : 0);
    }
}
