package practice01.oop.oopwithlayeredapp.business;

import practice01.oop.oopwithlayeredapp.dataaccess.JdbcProductDao;
import practice01.oop.oopwithlayeredapp.entities.Product;

public class ProductManager {

    public void add(Product product) throws Exception {
        //business rules
        if (product.getUnitPrice()<10){
            throw new Exception("urun fiyati 10'dan kucuk olamaz");
        }


        JdbcProductDao productDao = new JdbcProductDao();
        productDao.add(product);







    }












}
