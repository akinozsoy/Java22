package oop1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        //Set Value
        product1.name = "Delonghi Kahve Makinesi";
        product1.unitPrice = 7500;
        product1.discount = 8;
        product1.unitsInStock = 5;
        product1.imageUrl = "bilmemne1.jpg";

        // Get


        Product product2 = new Product();
        //Set Value
        product2.name = "smeg Kahve Makinesi";
        product2.unitPrice = 7500;
        product2.discount = 7;
        product2.unitsInStock = 3;
        product2.imageUrl = "bilmemne2.jpg";

        // Get

        Product product3 = new Product();
        //Set Value
        product3.name = "asdas Kahve Makinesi";
        product3.unitPrice = 7500;
        product3.discount = 7;
        product3.unitsInStock = 3;
        product3.imageUrl = "bilmemne3.jpg";

        // Get

        Product[]  products = {product1,product2,product3};

        for (Product product : products){
            System.out.println(product.name);

        }


    }
}
