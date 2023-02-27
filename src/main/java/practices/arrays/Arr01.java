package practices.arrays;

import java.util.Arrays;
import java.util.function.Function;

public class Arr01 {
    public static void main(String[] args) {


        int arr[] = {1,3,5,7,8,9};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);

        //Example 1: Create an integer array  with 5 elements and print elements  console.
        int arr1[]= new int[5];
        arr1[0] = 4;
        arr1[1] = 6;
        arr1[2] = 8;
        arr1[3] = 9;
        arr1[4] = 10;
  //      arr1[5] = 6; it returns ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(arr1));//[1, 2, 3, 4, 5]
        for (Integer w: arr1){
            System.out.print(w + " ");
        }

        System.out.println("**********");
        //Example 2: print elements these are less than or equal to  7 console.

        for (Integer w: arr1){
            if (w<=7){
                System.out.print(w + " ");////4 6
            }
        }

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));//[4, 6, 8, 9, 10]
        for (Integer w: arr1){
            if (w>=7){
                break;
            }else {
                System.out.print(w + " ");//4 6
            }
        }

        System.out.println();
        //if we want to print every element except specific element

        for (Integer w: arr1){
            if (w==7){
                break;
            }else {
                System.out.print(w + " ");//4 6 8 9 10
            }
        }



    }
}
