package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;
public class JdbcProductDao {
    public void add(Product product){
        //Sadece ve sadece db erişim kodları buraya yazılır.../SQL
        System.out.println("JDBC ile veritabanına eklendi");

    }
}