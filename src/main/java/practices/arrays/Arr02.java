package practices.arrays;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {


        //q1. create an array and sort the numbers in the array from smallest to largest.

        int arr[] = {9, 8, 5, 1};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 5, 8, 9]

        String name[] = {"messi", "C.Ronaldo", "Pale", "ronaldinho"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));//[C.Ronaldo, Pale, messi, ronaldinho]


        //Example 3: Type code to check if a specific element exists in the array or not
        char ch[] = new char[4];
        ch[0] = 'A';
        ch[1] = 'Y';
        ch[2] = 'C';
        ch[3] = 'I';

        //1. way
        int counter = 0;
        for (char w : ch) {
            if (w == 'A') {
                System.out.println( w);
                counter++;
                break;
            }
        }
        if (counter>0){
            System.out.println("it is exist");
        }else {
            System.out.println("it is not exist");
        }
        //2. way binary search()

        //always binary search type with sort() method
        Arrays.sort(ch);
        int idxY = Arrays.binarySearch(ch,'Y');
        System.out.println(idxY);//3
        int idxX = Arrays.binarySearch(ch,'X');
        System.out.println(idxX);//-4

       // Q4.  Create an integer array and  Find the sum of all elements.


        // 1st way
        int num1[]={8,5,12,11,14};
        int sum = 0;
        for (int w: num1){
            sum += w;
        }
        System.out.println(sum);//50

        //2. way
        int total = 0;
        for (int i=0;i<num1.length;i++){
            total +=num1[i];
        }
        System.out.println(total);



    }
}
