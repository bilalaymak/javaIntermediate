package day21inheritance.animalvariableandmethodcall;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        System.out.println("1 " + myCat.initial);// A <== Cat Class does not have "initial" but parent Mammal has
        System.out.println("2 " + myCat.age);// 14, not 6 of Mammal class <== Cat Class has "age" variable,
        // that is why the object does not
        // use the variable from the parent

        //**** constructors are run first !!!

        System.out.println("***********************");
        //When you create an object, you can select data type of the object from the class itself or
        //from any parent
        Object cat0 = new Cat();
        System.out.println("***************************");
        //When you select a variable in inheritance, focus on the "data type of the object",
        //the variable will be looked for starting from the Class used in "data type of the object"
        //if there is not the variable, java looks for variable from parent class

        Animal cat1 = new Cat();
        System.out.println("Parent is Animal: " + cat1.age);//4

        System.out.println("************************************");

        Mammal cat2 = new Cat();
        System.out.println("Parent is Mammal: " + cat2.age);//6
        System.out.println("Parent is Mammal: " + cat2.name);//A of Animal class ==> goes to parent class

        System.out.println("***********************************");
        Cat cat3 = new Cat();
        System.out.println("Parent is Cat: " + cat3.age);//14

        System.out.println("***************************************");
        //When you call a method in inheritance, focus on the constructor.
        //Start to look for the method from the class used its constructor
        Animal mammal1 = new Mammal();
        mammal1.drink();



        System.out.println("*************************************");
        Animal mammal2 = new Mammal();
        mammal2.eat();//Animals eat...==>there is not eat() method in Mammal class

        System.out.println("**********************************");

        Mammal obj = new Mammal();
        obj.feed();//Mammals feed with milk...



    }



}
