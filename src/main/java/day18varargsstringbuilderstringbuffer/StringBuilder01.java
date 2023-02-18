package day18varargsstringbuilderstringbuffer;

public class StringBuilder01 {

  /*
     1)"StringBuilder" is a Class in Java, it is used to create Strings.
        2)Question: We have "String Class" to create "Strings", why did Java create "StringBuilder" class to create "Strings"?
                    "String Class" is "Immutable", we sometimes need "Mutable Strings" that is why Java created "StringBuilder" class
        3)StringBuilder is NOT "thread-safe" and is NOT "synchronized"
        "thread-safe" means being able to do "multiple threads(task)" at the same time
        "synchronized" means being able to select appropriate order for "multi thread"
        4)If you need a String to use in "multi thread" use "StringBuffer"
          "StringBuffer" is a Class in Java, and it is used to create Strings.
          "StringBuffer" is "thread-safe" and it is "synchronized"

          "StringBuffer" was created before "StringBuilder", it was created in Java 5

          To create String we have 3 options;
          i)String Class: If you need "immutable String" use String Class to create a String
          ii)StringBuilder Class: If you need "mutable String" and do not need "multi thread" and "synchronization" use
                                  StringBuilder Class to create a String.
          iii)StringBuffer Class:  If you need "mutable String" and "multi thread" and "synchronization" use
                                  StringBuffer Class to create a String.

          Note: StringBuilder is faster than StringBuffer

   */






    public static void main(String[] args) {

        String s= "Java";
        //string class is "immutable", that is why when you do any update on "s",
        // java does not change the value in "s container"
        //java creates a new container for the updated value and puts the  updated value in the new container
        String t = s.concat("!");
        System.out.println("s = " + s);//s = Java  original value did not change, because it is immutable
        System.out.println("t = " + t);//t = Java!

        s = s.concat("Woooow");
        System.out.println("s = " + s);//s = JavaWoooow


        //let us create a "mutable string"
        StringBuilder sb1 = new StringBuilder("Java");
        System.out.println("sb1 = " + sb1);//sb1 = Java

        //when I use any method to update a StringBuilder original value will be updated
        sb1.append("!");  //append() method is for StringBuilder
        System.out.println("sb1 = " + sb1);//sb1 = Java!

        sb1.insert(4," is love");//skip 4 character and then insert " is love"
        System.out.println("inserted sb1 = " + sb1);//inserted sb1 = Java is love!

        sb1.insert(2,"Money",1,4);//1,4 is for substring of "Money"
        System.out.println("inserted sb1 = " + sb1);//inserted sb1 = Ja"one"va is love!

        sb1.replace(2,5,"1");
        System.out.println("replaced sb1 = " + sb1);//replaced sb1 = Ja1va is love!

        sb1.deleteCharAt(0);
        System.out.println("deleted char at sb1 = " + sb1);//deleted char at sb1 = Java is love!

        sb1.delete(8,12);
        System.out.println("deleted sb1 = " + sb1);//deleted sb1 = Java is !

        //if "reverse s string"question is asked in an interview, do not forget to mention reverse() method
        sb1.reverse();
        System.out.println("reversed sb1 = " + sb1);//reversed sb1 = ! si avaJ


        //toString(); is for converting "stringbuilder" to "string",
        // but toString() method does not change the structure of original "StringBuilder"
        String newS =  sb1.toString();


        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");

        //
        int r = sb2.compareTo(sb3);//compareTo() method compares in alphabetical order "lexicographically",
        // and return int
        //if sb2 is before sb3 the result will be negative,
        //if sb2 is after sb3 the result will be positive
        //the int value method returns displays the difference between the ASCII values
        System.out.println("r = " + r);//r = 0




    }
}
