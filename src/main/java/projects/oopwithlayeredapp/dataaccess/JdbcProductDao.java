package projects.oopwithlayeredapp.dataaccess;

import projects.oopwithlayeredapp.entities.Product;

public class JdbcProductDao implements ProductDao {  //Dao means Data Access object

    public void add(Product product){
        //sadece ve sadece db arisim code lari buraya yazilir (SQL)
        System.out.println("JDBC ile veritabanina eklendi");
    }





















}
