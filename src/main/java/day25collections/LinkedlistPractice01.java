package day25collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistPractice01 {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Ali");
        names.addLast("Brad");
        names.add(2, "Jim");
        names.addLast("Brad");
        names.addFirst("Angie");
        names.addLast("Brad");
        names.add("Ali");
        System.out.println(names);// [Angie, Ali, Brad, Jim, Brad, Brad, Ali

        //remove()method
        names.remove();
        System.out.println("names = " + names);//names = [Ali, Brad, Jim, Brad, Brad, Ali]
        //remove() method deleted first element of linkedlist (Angie)
        String r1 = names.remove();
        System.out.println("r1 = " + r1);//r1 = Ali
        System.out.println("names = " + names);//names = [Brad, Jim, Brad, Brad, Ali]

        //remove("Brad") method
        System.out.println("names.remove(\"Brad\") = " + names.remove("Brad"));//names.remove("Brad") = true
        System.out.println("names = " + names);//names = [Jim, Brad, Brad, Ali]
        //remove("Brad") method removed first occurrence of "Brad" and it returns boolean

        //remove(1);
        System.out.println("names.remove(1) = " + names.remove(1));//names.remove(1) = Brad
        System.out.println("names = " + names);//names = [Jim, Brad, Ali]
        //remove(1) method removes index of 1 and it returns the removed element(node)

        //removeLast();
        System.out.println("names.removeLast() = " + names.removeLast());//names.removeLast() = Ali
        System.out.println("names = " + names);//names = [Jim, Brad]

        names.add("Brad");
        names.add("Brad");
        names.add("Brad");
        names.add("Jim");
        names.add("Jim");
        names.add("Jim");
        System.out.println("names = " + names);//names = [Jim, Brad, Brad, Brad, Brad, Jim, Jim, Jim]

        //removeFirst()
        System.out.println("names.removeFirst() = " + names.removeFirst());//names.removeFirst() = Jim
        System.out.println("names = " + names);//names = [Brad, Brad, Brad, Brad, Jim, Jim, Jim]

        //removeFirstOccurrence()
        System.out.println("names.removeFirstOccurrence() = " + names.removeFirstOccurrence("Jim"));
        //names.removeFirstOccurrence() = true
        System.out.println("names = " + names);//names = [Brad, Brad, Brad, Brad, Jim, Jim]

        //removeLastOccurrence();
        System.out.println("names.removeLastOccurrence() = " + names.removeLastOccurrence("Brad"));
        //names.removeLastOccurrence() = true
        System.out.println("names = " + names);//names = [Brad, Brad, Brad, Jim, Jim]

        System.out.println("names1 = " + names);
        //removeAll(Collections.singleton("Jim"));
        names.removeAll(Collections.singleton("Jim"));//// remove all occurrences of "Jim"
        System.out.println("names = " + names);//names = [Brad, Brad, Brad]

        System.out.println("names.contains(\"Ali\") = " + names.contains("Ali"));//names.contains("Ali") = false
        System.out.println(names.contains("Brad"));//true
        System.out.println(names.contains("Ali"));//false
        System.out.println("names = " + names);//names = [Brad, Brad, Brad]


        //clone() method creates a copy of the original list to compare and check the original list
        LinkedList<String> backupList = (LinkedList<String>) names.clone();

        //clear() method remove all elements in the linkedlist
        backupList.clear();
        System.out.println("backupList = " + backupList);//backupList = []

        names.add("Ali");
        names.add("Veli");
        names.add("Mehmet");
        System.out.println("names = " + names);//names = [Brad, Brad, Brad, Ali, Veli, Mehmet]

        //Iterators(
        Iterator<String> descendingIterator = names.descendingIterator();
        LinkedList<String> reversedList = new LinkedList<>();
        while (descendingIterator.hasNext()){
            String namesReversed = descendingIterator.next();
            reversedList.add(namesReversed);
        }
        System.out.println("reversedList = " + reversedList);//reversedList = [Mehmet, Veli, Ali, Brad, Brad, Brad]

        /*
        we create a new LinkedList called reversedList to hold the reversed elements of the names list.
        We then use a while loop to iterate over the elements of names in reverse order
        using the descendingIterator() method.
        Inside the loop, we get the next element from the iterator using the next() method,
        and add it to the reversedList using the add() method.
         */

    }
}
