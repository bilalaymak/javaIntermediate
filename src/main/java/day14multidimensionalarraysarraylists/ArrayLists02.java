package day14multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {

  /*
       when you talk about arrays use array's length
       when you talk about use list's size
   */




    public static void main(String[] args) {

        //example 1: type code to print the elements of a list
        //           if the elements is greater than the number of elements in the list
        //           [5,9,3,4,6]  ==> 9-6
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(9);
        nums.add(3);
        nums.add(4);
        nums.add(6);

        //1. step: find the number of list elements
        int numOfEl = nums.size();

        //2. check if an element is greater than the number of list elements then print it

        for (Integer w: nums){

            if (w>numOfEl){
                System.out.print(w + " ");//9 6
            }
        }





    }
}
