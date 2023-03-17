package step18inheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.eat();
        myCat.drink();
        myCat.meow();

        Dog myDog = new Dog();
        myDog.eat();
        myDog.drink();
        myDog.bark();

        Bird myBird = (Bird) new Mammal();

        myBird.eat();
        myBird.drink();
        myBird.tweet();

        Animal[] myAnimalArray = {myCat,myBird,myDog};
        for (Animal animal : myAnimalArray) {
            animal.eat();
            animal.drink();

        }




    }




}
