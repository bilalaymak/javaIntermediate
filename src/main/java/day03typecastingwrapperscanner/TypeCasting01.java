package day03typecastingwrapperscanner;

public class TypeCasting01 {
    public static void main(String[] args) {

        /*
        There are types of data type in Java
        1)Primitive Data Types ==> byte < short < int < long < float < double ==>numaric primitive data types

                                  boolean==> true or false
                                  char  ==> for a single data

         2)Non-Primitive data types==> String ==> used for multiple different characters storage inside an object

         String str = "Tom Hanks 123)?";

         What are the differences between "Primitive Data Types" and "Non-Primitive Data Types"?
         1)Primitive data types have just values but Non-Primitive Data Types have values and methods
         2)Primitive Data Types are created by Java, we cannot create a primitive data type
           But we can create Non-Primitive data types whenever we need

         3) "Primitive data types uses lowercases in naming convention and Non-Primitive ones uses Upper case naming
         convention

         4) Usage of memory for primitive data types changes from data type to data type.
            But Non-Primitive data types use same amount of memory in heap memory

            There are 2 types of memory in Java.
            1)Stack Memory=> 1)Primitive data 2)References(addresses) of Non-Primitive data type are stored
            2)Heap Memory==>< Stores Non-Primitive Data types/values
         */


        int a = 23, i=12;

        String str = "Tom";
        System.out.println(a + i + str);

        System.out.println(str + (a +i));

        //Type Casting
        /*
        1) AutoWidening
        Java can put small data types into large dat types automatically
        When you put small data type object into a large data type object, you are widening the small dat type.

         */

        int m= 14;

        double d =m;

        /*
        2)Explicitly Narrowing
        Java does not put large data types into small data types automatically. Java thinks this is risky.

         */
        int n= 20;
        byte b=(byte) n;


    }
}
