package step22interface;

public class CarRunner {
    public static void main(String[] args) {

        Honda myHonda = new Honda();
        myHonda.cool();
        myHonda.heat();
        myHonda.run();
        myHonda.bacteriaKiller();

        Ac.climate(); //If you need a "method with body" and access to it
        // just by using "interface name" use "static" keyword.
        //there is no need to use object to access static method in an interface

        //Ac myAc = new Ac(); ==> 'Ac' is interface; cannot be instantiated

        System.out.println(Ac.price);//2000
        // Ac.price++; ==> Cannot assign a value to final variable 'price'

        System.out.println(Engine.price);//5000.0

    }
}
