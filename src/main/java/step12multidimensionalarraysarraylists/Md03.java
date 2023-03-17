package step12multidimensionalarraysarraylists;

public class Md03 {
    public static void main(String[] args) {

        //example 1: find the sum of the min and max elements in a multidimensinal array
        // int arr[][] = { {5,4}, {10,6,7} }; ==> 4+ 10 = 14

        int arr[][] = { {5,4}, {10,6,7} };

        int min = arr[0][0];
        int max =arr[0][0];
        for (int[] w: arr){

            for (int k: w){
               min =  Math.min(min,k);
               max = Math.max(max,k);
            }
        }
        System.out.println("sum : " + (min +max));//14






    }
}
