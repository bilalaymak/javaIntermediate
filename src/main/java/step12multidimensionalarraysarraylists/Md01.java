package step12multidimensionalarraysarraylists;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        //example 1: convert dimensional array to 1 dimensional array
        // [ [5,3],[9,8,7] ] ==> [5,3,9,8,7]

        int a[][] = { {5,3}, {9,8,7} };

        //1. step: find th number of elements in the multidimensional array

        int sum = 0;
        for(int[] w : a){
            sum = sum + w.length;
        }
        System.out.println("sum: " + sum);//5


        //2. step: create 1 dimensional array whose length is the same
        //         with numbers elements in the multidimensional array


        int b[] = new int[sum];

        //3. step: transfer the elements from the multidimensional array to the 1 dimensional array
        int idx = 0;
        for (int[] w: a){

            for (int k: w){
                b[idx] = k;

                idx++;
            }
        }
        System.out.println(Arrays.toString(b));//[5, 3, 9, 8, 7]










    }
}
