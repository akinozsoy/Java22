package oop1;

public class Main {
 public static void main(String[] args){
     Product product1 = new Product();

                    //Set Value
     product1.name = "Delonghi Kahve Makinesi";
     product1.unitPrice = 7500;
     product1.discount = 7;
     product1.unitsInStock = 3;
     product1.imageUrl = "bilmemne.jpg";

                    // Get
     System.out.println(product1.name);
 }

}
