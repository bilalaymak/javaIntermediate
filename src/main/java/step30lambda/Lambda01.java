package step30lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {


    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        printSortedUpperUnique(names);//ALEX ALEXANDER JİM MARY MİCHAEL TOM
        System.out.println();
        printUpperUniqueSortWithLength(names);//TOM JİM ALEX MARY MİCHAEL ALEXANDER
        System.out.println();
        printUpperUniqueSortWithLastChar(names);//MİCHAEL TOM JİM ALEXANDER ALEX MARY
        System.out.println();
        printSortedByLengthThenFirstChar(names);//JimTomAlexAlexMaryMichaelAlexander
        System.out.println();
        printSquareOfLengthDistinctlyInReverseOrder(names);//81 49 16 9
        System.out.println();
        System.out.println(checkLengthsToBeLessThanTwelve(names));//true
        System.out.println();
        System.out.println(checkInitialsNotToBeX(names));//true
        System.out.println();
        System.out.println(checkLastCharToBeLowerCaseR(names));//true


    }
    //1)print the list elements on the console in natural order with uppercases and unrepeatedly
    public static void printSortedUpperUnique(List<String> names){
        names.
                stream().
                distinct().
                sorted().map(t-> t.toUpperCase()).
                forEach(t-> System.out.print(t + " " ));
    }

    //2)print the list elements on the console by ordering them according to their length,
    // with uppercases and unrepeatedly

    public static void printUpperUniqueSortWithLength(List<String> names){
        names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::printInTheSameLineWithSpace);
    }

    //we can also sort them by using ==> sorted(Comparator.comparing(String::length)) ==> method reference

    //3)Print the list elements on the console
    // by ordering them according to their last characters, with upper cases, and un-repeatedly

    public static void printUpperUniqueSortWithLastChar(List<String> names){
        names.
                stream().
                distinct().
                map(t-> t.toUpperCase()).
                sorted(Comparator.comparing(t-> t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t + " "));
    }

    //4)Create a method to sort the elements according to their lengths
    // then according to their first character
    //TOM JİM ALEX ALEX MARY MİCHAEL ALEXANDER ==> JİM TOM ALEX ALEX MARY MİCHAEL ALEXANDER

    public static void printSortedByLengthThenFirstChar(List<String> names) {
        names.
                stream().
                sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(0))).
                //if a method needs parameter
                //it cannot be used in "method reference"
                forEach(Utils::printInTheSameLineWithSpace);//JimTomAlexAlexMaryMichaelAlexander
             //we called our method from our method storage class with method reference

    }

    //5)Create a method which takes the square of the length of every element,
    // prints them distinctly in reverse order
    public static void printSquareOfLengthDistinctlyInReverseOrder(List<String> names){

        names.
                stream().
                map(String::length). //this code converts the string to int length  the length of every element
                distinct(). //prints them distinctly
                map(Utils::getSquare). //we converted the numbers to squares of them
                sorted(Comparator.reverseOrder()).  //in reverse order
                forEach(Utils::printInTheSameLineWithSpace);


    }

    //6)Create a method to check if the lengths of "all elements"(allMatch() method) are less than 12

    public static boolean checkLengthsToBeLessThanTwelve(List<String> names){
        return names.stream().
                     allMatch(t-> t.length()<12);
    }

    //7)Create a method to check if at least one of the elements ending with "X"

    public static boolean checkInitialsNotToBeX(List<String> names){
        return names.stream().noneMatch(t->t.startsWith("X"));
    }




    //8)Create a method to check if at least one of the elements ending with "r"

    public static boolean checkLastCharToBeLowerCaseR(List<String> names){
        return names.stream().anyMatch(t->t.endsWith("r"));
    }









}

