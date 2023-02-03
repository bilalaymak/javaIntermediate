package day21inheritanceoverriding.vehicle;

public class VehicleRunner {

    public static void main(String[] args) {

        Civic myCivic = new Civic(true);
        myCivic.move();
        myCivic.price();
        myCivic.ecoSystem();
        int hashCode = myCivic.hashCode();
        System.out.println(hashCode);

    }

}
