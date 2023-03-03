package projects.oopwithlayeredapp.business;

import projects.oopwithlayeredapp.core.logging.Logger;
import projects.oopwithlayeredapp.dataaccess.HibernateProductDao;
import projects.oopwithlayeredapp.dataaccess.ProductDao;
import projects.oopwithlayeredapp.entities.Product;

public class ProductManager {

    //injection point for the ProductManager class
    private ProductDao productDao;
    private Logger[] loggers;
    //we create this variable in the constructor below because,
    //why we used this variable? because
    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;

    }
    // why we used this constructor because we want to create a new instance of ProductManager,
    /*
    By injecting the ProductDao object into the ProductManager class through its constructor,
    rather than creating an instance of the ProductDao class within the ProductManager,
    the ProductManager is decoupled from the ProductDao.
     */

    public void add(Product product) throws Exception {
        //business rules
        if (product.getUnitPrice()<10){
            throw new Exception("urun fiyati 10'dan kucuk olamaz");
        }

        ProductDao productDao = new HibernateProductDao();//here we add the product to the database
        productDao.add(product);

        for (Logger logger : loggers) {    //[db,mail]
            logger.log(product.getName()); //here product.getName() stands for
                                           // the abstract method in the Logger interface "void log(String data);"
                                           // as "String data"
        }


    }

}
