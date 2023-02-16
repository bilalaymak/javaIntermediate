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

       ***HASHSETS
       are a data structure that are used for storing collections of unique elements.
       The primary advantage of using a HashSet is its constant-time performance for basic operations
       like adding, removing, and checking the presence of an element in the set.
       Here are some common use cases for HashSets:

       Removing duplicates: If you have a collection of elements that may contain duplicates,
       you can use a HashSet to remove duplicates and get a collection of unique elements.

       Fast membership testing: If you need to check if an element is present in a collection,
       a HashSet provides constant-time performance, which means it is very fast, even for large collections.

       Caching: HashSets can be used to cache frequently used data to avoid recomputing it.
       This can be useful in applications that perform expensive calculations
       or retrieve data from slow sources like a database.

       Finding intersections or unions: HashSets can be used to find the intersection
       or union of two sets of elements.
       This can be useful for various applications like data analysis, graph algorithms, and more.

       Overall, HashSets are a useful data structure for managing collections of unique elements,
       and their constant-time performance makes them an efficient choice for many applications.


       ***FOR SET'S:
       Iteration and Ordering: Java provides different types of Sets like HashSet, TreeSet, and LinkedHashSet.
       HashSet is unordered and provides constant-time performance,
       while TreeSet is sorted and provides log(n) time performance for operations like adding, removing, and searching.
       LinkedHashSet maintains the order of insertion while also providing constant-time performance for basic operations.

       Implementing algorithms: Sets are a key part of many algorithms and data structures in Java.
       For example, Sets are used to implement graph algorithms, data analysis, and more.
       Java provides various Set implementations
       that are optimized for different use cases and can be used to implement various algorithms.







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
        hs.add(14);//When you add same element repeatedly, Java does not give error.
        // It puts the repeated element just once into the set.(overwrite 14 in hashset)

        System.out.println(hs);// [32, 1, 3, 19, 5, 12, 45, 14] it is random order

    }












}
