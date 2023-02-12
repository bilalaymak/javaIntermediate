package day25collections;

import java.util.HashSet;

public class Sets01 {


 /*
        Sets are for storing unique data.
        There are 3 sets i)HashSet: Uses hashing technique.
                                    Hashing technique is a technique to create unique data(code)
                                    HashSet does not put the elements in any order, so HashSet is so fast
                                    HashSet allows you to store just one "null" as value
                         ii)LinkedHashSet
                         iii)TreeSet
     */

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(3);
        hs.add(14);
        hs.add(5);
        hs.add(32);
        hs.add(1);
        hs.add(45);
        hs.add(19);
        hs.add(14);//When you add same element repeatedly, Java does not give error. It puts the repeated element just once into the set.

        System.out.println(hs);// [32, 1, 3, 19, 5, 12, 45, 14]

    }












}
