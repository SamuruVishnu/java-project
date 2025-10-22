package Billing;

public class Main {
    public static void main(String[] args) {
        Product item1=new Electronic("laptop",1,50000);
        Product item2=new Electronic("mobile",1,20000);
        Product item3=new Electronic("buds",1,1000);

        Product item4=new Grocery("rice",1,200);
        Product item5=new Grocery("kismis",1,350);
        Product item6=new Grocery("wheat",1,500);

       //System.out.println(item1.getName()+"total price"+ item1.calculateTotal());
        Billable [] items={item1,item2,item3,item4,item5,item6};
        for(Billable b:items){
            Product p=(Product)b;
            System.out.println("Product :" +p.getName());
            System.out.println("Quantity :" +p.getQuantity());
            System.out.println("Price :" +p.getPrice());
            System.out.println("Total Price :" +p.calculateTotal());
            //System.out.println(p.getName());

        }
        }
    }
