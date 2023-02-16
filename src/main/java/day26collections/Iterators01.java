package day26collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

   /*
        1)Iterators do the same with the loops
        2)Loops have infinite loop risk but Iterators do not have
        3)There are not performance difference between loops and iterators
        4)Iterators are more successful in removing elements and updating elements in a collection

        5)There are two types of iterators i)Iterator: It can "just remove" the elements, it is impossible to update and add.
                                                       It works just from left to the right
                                           ii)ListIterator: It can remove and update and add the elements
                                                            It works both from left to the right and right to left
     */

    public static void main(String[] args) {

        //Let us use Iterator:
        List<String> myList1 = new ArrayList<>();
        myList1.add("Tom");
        myList1.add("Ajda");
        myList1.add("Brad");
        myList1.add("Jim");
        myList1.add("Aaron");
        myList1.add("Cindy");

        System.out.println("myList = " + myList1);//[Tom, Ajda, Brad, Jim, Aaron, Cindy]



        Iterator<String> myItr = myList1.iterator(); // [ Tom,   Jim,   Clara,   Angie,   Mark ]
        System.out.println("myItr.next() = " + myItr.next());//Tom
        System.out.println("myItr.hasNext() = " + myItr.hasNext());//true
        System.out.println("myItr.next() = " + myItr.next());//Ajda
        System.out.println("myItr.hasNext() = " + myItr.hasNext());//true
        System.out.println("myItr.next() = " + myItr.next());//Brad
        System.out.println("myItr.hasNext() = " + myItr.hasNext());//true
        System.out.println("myItr.next() = " + myItr.next());//Jim
        System.out.println("myItr.hasNext() = " + myItr.hasNext());//true
        System.out.println("myItr.next() = " + myItr.next());//Aaron
        System.out.println("myItr.hasNext() = " + myItr.hasNext());//true
        System.out.println("myItr.next() = " + myItr.next());//Cindy
        System.out.println("myItr.hasNext() = " + myItr.hasNext());//false
        //System.out.println("myItr.next() = " + myItr.next()); //==>NoSuchElementException because pointer shows nothing/hasNext() method returns false

        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Ajda");
        yourList.add("Brad");
        yourList.add("Jim");
        yourList.add("Aaron");
        yourList.add("Cindy");

        System.out.println("yourList = " + yourList);

        Iterator<String> yourItr = yourList.iterator();

        while(yourItr.hasNext()){
            myItr.next();
            myItr.remove();
        }
        System.out.println(myList1);

        //Let us use ListIterator:
        List<String> yourList1 = new ArrayList<>();
        yourList1.add("Tom");
        yourList1.add("Jim");
        yourList1.add("Clara");
        yourList1.add("Angie");
        yourList1.add("Mark");
        System.out.println(yourList1);// [Tom, Jim, Clara, Angie, Mark]

        ListIterator<String> yourListItr = yourList1.listIterator();// [ Tom,   Jim,   Clara,   Angie,   Mark ]

        while(yourListItr.hasNext()){
            String el = yourListItr.next();
            yourListItr.set(el + "!...");
        }
        System.out.println(yourList1);

        //Example: Print the yourList elements on the console from the last element to the first element
        //         in the same line with a space between two consecutive elements
        List<String> ourList = new ArrayList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);// [Tom, Jim, Clara, Angie, Mark]

        ListIterator<String> ourListItr = ourList.listIterator();// [ | Tom,  | Jim,  | Clara,  | Angie,  | Mark |]

        //Following loop will move the pointer to the very end
        while(ourListItr.hasNext()){

            ourListItr.next();

        }

        //Following loop will work from the last element to the first element
        while(ourListItr.hasPrevious()){

            String el = ourListItr.previous();

            System.out.print(el + " ");

        }

    }



















}
