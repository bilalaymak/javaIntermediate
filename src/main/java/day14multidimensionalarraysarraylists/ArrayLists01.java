package day14multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {


  /*
         1) to create an array we need to declare "the number of elements" at the beginning
            but we may need more elements to store or less elements to store inside the array
            that is why declaring the number of elements at the beginning is not good
            this is the negative side of arrays

            to remove that negativity, java created a new structure whose name is "ArrayList"(List is also used),
            when we use "arraylist", no need to declare the number of elements you want to store in it

            as a result; array is fixed in length, arraylist is flexible

          2) "arraylist" can store just "non-primitive" data, "array" can store "primitive" data and "reference"

          3) arrays work super fast
             arrays use memory so less
             if you are sure the number of elements will not change(for example month names),
             using array is better
   */


        // how to create an arraylist

        //1. way:
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);//[]

        //2. way:
        List<Integer> prices = new ArrayList<>();

        //how to add elements into an ArrayList
        //note: add() method puts the element to the end
        //      add() method puts the elements in "insertion order "
        ages.add(13);
        ages.add(9);
        ages.add(21);


        System.out.println(ages);//[13, 9, 21]

        //ages.add(4,66); puts 34 to index 1
        ages.add(1,34);
        System.out.println(ages);//[13, 34, 9, 21]


        ages.add(4,66);
        System.out.println(ages);//[13, 34, 9, 21, 66] no need to use index to put the last index

        prices.add(330);
        prices.add(550);
        prices.add(770);
        System.out.println("prices : " + prices);//[330, 550, 770]

        //ages.addAll(prices); adds prices list elements into the "ages" list elements
        ages.addAll(prices);
        System.out.println("ages : "+ages);//[13, 34, 9, 21, 66, 330, 550, 770]

        //ages.addAll(2,prices); adds "prices" list elements into the "ages" list at index 2
        ages.addAll(2,prices);
        System.out.println("ages" + ages);//[13, 34, 330, 550, 770, 9, 21, 66, 330, 550, 770]

        //how to remove all elements from a list
        //clear() method removes all elements in a list
        prices.clear();
        System.out.println("prices" + prices);//[]
        prices.add(330);
        prices.add(550);
        prices.add(770);
        ages.addAll(prices);
        prices.addAll(ages);
        System.out.println("prices" +prices);//prices[330, 550, 770, 13, 34, 330, 550, 770, 9, 21, 66, 330, 550, 770, 330, 550, 770]

        //how to check if a specific element exists in a list
        boolean r1 =  ages.contains(13);
        System.out.println("r1: " +r1);//True

        boolean r2 = ages.contains(prices);
        System.out.println("r2: " + r2);//False

        boolean r3 = ages.equals(prices);
        System.out.println(r3);//False

        //how to check if two lists are same or not

        List<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Angie");
        names1.add("Mark");

        List<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Angie");
        names2.add("Mark");

        //equals method checks if the lists have same elements in the same indexes
        //if the same elements in the same indexes, equals() method returns true otherwise returns false
        boolean r4 = names1.equals(names2);
        System.out.println(r4);//true

        //example 1: type code to check if two lists have some elements
        //           same elements can be in different indexes
        //           [A,B,C] and [A,C,B] and [B,A,C] ==>true

        List<Character> m = new ArrayList<>();
        m.add('A');
        m.add('B');
        m.add('C');
        List<Character> n = new ArrayList<>();
        n.add('B');
        n.add('C');
        n.add('A');

        Collections.sort(m);
        Collections.sort(n);
        boolean r5 = m.equals(n);
        System.out.println(r5);//true


    }
}












