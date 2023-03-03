package projects.oopwithlayeredapp.dataaccess;

import projects.oopwithlayeredapp.entities.Product;

public class HibernateProductDao implements ProductDao {


    public void add(Product product){
        //sadece ve sadece db arisim code lari buraya yazilir (SQL)
        System.out.println("Hibernate ile veritabanina eklendi");
    }



}
