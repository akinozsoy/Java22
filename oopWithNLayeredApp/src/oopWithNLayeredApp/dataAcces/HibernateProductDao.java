package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao { //Kural uymak zorunda "implements" add2 girildiği zaman uyarı vericek
    public void add(Product product){
        //Sadece ve sadece db erişim kodları buraya yazılır.../SQL
        System.out.println("Hibernate ile veritabanına eklendi");

    }
}
