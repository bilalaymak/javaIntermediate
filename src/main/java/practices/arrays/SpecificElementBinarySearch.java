package practices.arrays;

import java.util.Arrays;

public class SpecificElementBinarySearch {

    public static void main(String[] args) {

        //Type code to check if a specific element in an Array or not

        //String[] str=new String[6];

        String[] str={"Ellie", "Susan", "Tom", "Brad", "Ali", "Veli"};
        String name= "Brad";
        int counter=0;

        //1.way
        for(String w: str){

            if(w.equals(name))

                counter++;
        }
        if(counter>0){

            System.out.println(name + " exists in the Array");
        }else {
            System.out.println(name+ " does not exist in the Array");
        }

        //2.way:by using binarySearch()

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));//[Ali, Brad, Ellie, Susan, Tom, Veli]

        int idx= Arrays.binarySearch(str, name);
        System.out.println(idx);

        int idxSally= Arrays.binarySearch(str, "Sally");

        System.out.println(idxSally);
    }

}

