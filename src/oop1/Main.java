package oop1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        //Set Value YAZMAK İÇİN SET YAPIYORUZ.
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setImageUrl("image1.jpg");

        // Get OKUMAK İÇİN GET YAPIYORUZ.


        Product product2 = new Product();
        //Set Value YAZMAK İÇİN SET YAPIYORUZ.
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7300);
        product2.setImageUrl("image2.jpg");

        // Get OKUMAK İÇİN GET YAPIYORUZ.

        Product product3 = new Product();
        //Set Value YAZMAK İÇİN SET YAPIYORUZ.
        product3.setName("Kitchen aid Kahve Makinesi");
        product3.setDiscount(2);
        product3.setUnitPrice(5300);
        product3.setImageUrl("image3.jpg");

        // Get OKUMAK İÇİN GET YAPIYORUZ.

        Product[] products = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");

        }

        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0556789257");
        individualCustomer.setCustomerNumber("14");
        individualCustomer.setFirstName("Akın");
        individualCustomer.setLastName("Özsoy");



        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(1);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("05536789257");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("54321");

        //Customer [] customers = {individualCustomer,corporateCustomer};

    }
}
