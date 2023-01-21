package day14multidimensionalarraysarraylists;

public class Md02 {
    public static void main(String[] args) {

        //example 1: type code to find the multiplication of all elements of multidimensional array
        //           [ [5,4],[10,6,3] ] ==> 3600

        int arr[][] = { {5,4}, {10,6,3} };
        int multply = 1;
        for (int[] w: arr){

            for (int u: w){
                multply = multply *u;
            }
        }
        System.out.println(multply);//3600




    }
}
