package Billing;

public class Grocery extends Product{
    public Grocery(String name,int quantity,double price){
        setName(name);
        setQuantity(quantity);
        setPrice(price);
    }
    @Override
    public double calculateTotal() {
        double total=getPrice()*getQuantity();
        double GSt=total*8/100;
        return total+GSt;
    }
}
