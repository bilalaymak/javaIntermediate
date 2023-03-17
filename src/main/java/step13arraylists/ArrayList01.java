package step13arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {


       //Example 1: Create a String array, add 5 elements into the list, remove a specific element from the list

        List<String> names = new ArrayList<>();
        names.add("Christian");
        names.add("Alex");
        names.add("Tommy");
        names.add("Adriana");
        names.add("Tom");
        System.out.println(names);//[Christian, Alex, Tommy, Adriana, Tom]

        // names.remove("Alex"); removes "Alex" from the "names" list
        //remove() method returns true if the element exists and removed, otherwise it will return false
        boolean isRemoved = names.remove("Alex");
        System.out.println(isRemoved);//true
        System.out.println(names);//[Christian, Tommy, Adriana, Tom]

        //names.remove(2); removes the element "at index 2" from the "names" list
        //remove() method with index returns the removed element
        String removedElement = names.remove(2);
        System.out.println("removedElement = " + removedElement);//removedElement = Adriana
        System.out.println(names);//[Christian, Tommy, Tom]

        System.out.println("****************");

        //example 2: create an Integer list, add 6 elements into it, remove a specific element

        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(13);
        ages.add(7);
        ages.add(32);
        ages.add(1);
        ages.add(55);
        System.out.println("ages = " + ages);//ages = [12, 13, 7, 32, 1, 55]

        //if you put an integer into remove() method parenthesis, java accepts the integer as "primitive int"
        //if the number you put inside remove() method parenthesis is "primitive int", it will be "index"
        //to fix that problem, change primitive int to wrapper class by using "(Integer)13"
        boolean isRemoved2 = ages.remove((Integer) 13);
        System.out.println("isRemoved2 = " + isRemoved2);//isRemoved2 = true
        System.out.println("ages = " + ages);//ages = [12, 7, 32, 1, 55]

        System.out.println("*****************************");

        //example 3: create a string list, add 5 elements into it, remove the elements whose length is less than 6

        List<String> n = new ArrayList<>();
        n.add("Christian");
        n.add("Alex");
        n.add("Tommy");
        n.add("Adriana");
        n.add("Tom");
        System.out.println("n = " + n);//n = [Christian, Alex, Tommy, Adriana, Tom]

        //1. way:
      //normally we prefer to use "for-each-loop" but whenever you have to use "indexes" switch to use "for-loop"
        for (int i = 0; i < n.size(); i++){
      //get() method gives you the element at a specific index. for example,get(5) gives you the element at index 5
            if(n.get(i).length()<6){
                n.remove(n.get(i));
                i--;
            }
        }
        System.out.println("n = " + n);//n = [Christian, Adriana]

        System.out.println("*************************");
        //2. way:
        List<String> clonedN = new ArrayList<>(n);//creates a copy of list by "(n)"
        for (String w: clonedN){
            if (w.length()<6){
                n.remove(w);
            }
        }
        System.out.println("n = " + n);//n = [Christian, Adriana]

        /*
1)What it is
2)Why it is
3)Simple implementation
4)Mid-level implementation
5)Advanced level implementation
6)Do mini projects
7)Regular projects
         */







    }
}









