package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAcces.HibernateProductDao;
import oopWithNLayeredApp.dataAcces.JdbcProductDao;
import oopWithNLayeredApp.dataAcces.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
    private ProductDao productDao;
    public ProductManager(ProductDao productDao){
        this.productDao = productDao;
    }
    public void add(Product product) throws Exception{ //response request
    //İŞ KURALLARI
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }
        productDao.add(product);
    }
}
