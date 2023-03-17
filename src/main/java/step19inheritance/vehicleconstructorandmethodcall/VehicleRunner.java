package step19inheritance.vehicleconstructorandmethodcall;

public class VehicleRunner {

    public static void main(String[] args) {

        Civic myCivic = new Civic(true);
        myCivic.move();
        System.out.println("***************");

        myCivic.price();
        System.out.println("*****************");

        myCivic.ecoSystem();
        System.out.println("*******************");

        int hashCode = myCivic.hashCode();
        System.out.println(hashCode);

        System.out.println("*********************");
        Civic myCivic1 = new Civic();
        myCivic1.ecoSystem();


        System.out.println("******myAccord*****");
        Accord myAccord = new Accord();
        myAccord.move();
        System.out.println("****************");
        myAccord.turboSystem();
        myAccord.price();











    }

}
