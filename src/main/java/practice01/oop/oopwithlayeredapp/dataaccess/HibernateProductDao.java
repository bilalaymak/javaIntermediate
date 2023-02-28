package practice01.oop.oopwithlayeredapp.dataaccess;

import practice01.oop.oopwithlayeredapp.entities.Product;

public class HibernateProductDao implements ProductDao {


    public void add(Product product){
        //sadece ve sadece db arisim code lari buraya yazilir (SQL)
        System.out.println("Hibernate ile veritabanina eklendi");
    }



}
