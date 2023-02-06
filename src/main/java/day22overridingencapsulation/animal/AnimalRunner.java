package day22overridingencapsulation.animal;

public class AnimalRunner {

    public static void main(String[] args) {


        Cat myCat = new Cat();
        myCat.eat();//cats eat
        //Animals eat...(from Animal class) ==> before override
        //cats eat (from Cat class) ==>after override
        System.out.println("myCat.occur() = " + myCat.occur());//returns a new Mammal object
        //myCat.occur() = day22overridingencapsulation.animal.Cat@64616ca2
        System.out.println("myCat.number() = " + myCat.number());//myCat.number() = 456
        System.out.println("myCat.create() = " + myCat.create());//returns a new Cat object
        //myCat.create() = day22overridingencapsulation.animal.Cat@13fee20c
        System.out.println("myCat.num() = " + myCat.num());//myCat.num() = 24
        myCat.feed();//mammals feed their babies with milk









    }
}
