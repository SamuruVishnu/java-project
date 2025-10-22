package Billing;

abstract class Product implements Billable {
   public abstract double calculateTotal();
   private String name;
   private int quantity;
   private double price;

   //getters
   public String getName(){
      return name;
   }
   public int getQuantity(){
      return quantity;
   }
   public double getPrice() {
      return price;
   }
   //setters
   public void setName(String name){
      this.name=name;
   }
   public void setQuantity(int quantity){
      if(quantity>0) {
         this.quantity = quantity;
      }
   }
   public void setPrice(double price) {
      if(price>0) {
         this.price = price;
      }
   }
}
