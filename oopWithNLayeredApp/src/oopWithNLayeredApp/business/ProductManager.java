package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAcces.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
    public void add(Product product) throws Exception{ //response request
    //İŞ KURALLARI
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }
        JdbcProductDao productDao = new JdbcProductDao();
        productDao.add(product);
    }
}
