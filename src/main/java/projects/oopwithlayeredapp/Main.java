package projects.oopwithlayeredapp;

import projects.oopwithlayeredapp.core.logging.MailLogger;
import projects.oopwithlayeredapp.dataaccess.HibernateProductDao;
import projects.oopwithlayeredapp.business.ProductManager;
import projects.oopwithlayeredapp.core.logging.DatabaseLogger;
import projects.oopwithlayeredapp.core.logging.Filelogger;
import projects.oopwithlayeredapp.core.logging.Logger;
import projects.oopwithlayeredapp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1,"IPhone Xr",10000);

        Logger[] loggers = {new DatabaseLogger(), new Filelogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);









    }
}
