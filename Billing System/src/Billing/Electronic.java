package Billing;

public class Electronic extends Product{
    public Electronic(String name,int quantity,double price){
        setName(name);
        setQuantity(quantity);
        setPrice(price);
    }
    @Override
    public double calculateTotal() {
        double total=getPrice()*getQuantity();
        double GSt=total*15/100;
        return total+GSt;
    }
}
