package practices.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class LongestName {

    String longest(String names[], int n) {

        Arrays.sort(names, Comparator.comparingInt(String::length));
        return names[n - 1];

        // String longestName = "";
        // for (String e : names) {
        //     longestName = e.length()>longestName.length() ? e : longestName;
        // }
        // return longestName;
        // }

    }

    public static void main(String[] args) {

        LongestName longestName = new LongestName();

        String names[] ={ "ali","ahmet", "ayse","muhammed"};
        String str = longestName.longest(names,4);
        System.out.println("str = " + str);//str = muhammed

    }







}
