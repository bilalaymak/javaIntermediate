package day31lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SomeMethods {
    public static void main(String[] args) {
        /*
        in lambda
what is reduce() method?
what is filter() method?
what is map() method?

          In Java, the reduce(), filter(), and map() methods are part of the Stream interface
          and are commonly used with lambda expressions to perform functional programming tasks.

           reduce() method:
           The reduce() method takes a binary operator and returns an Optional
           that contains the result of applying the operator to the elements of the stream,
           starting with the first element. If the stream is empty, the result is an empty Optional.
           Here's an example of how to use the reduce() method to find the sum of all the integers in a list:

         */
         //reduce()method
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
        if (sum.isPresent()) {
            System.out.println("Sum: " + sum.get());
        } else {
            System.out.println("The stream was empty.");
        }


        //filter() method:
        //The filter() method takes a predicate and returns a stream that contains only the elements
        // that match the predicate. Here's an example of how to use the filter()
        // method to find all the even numbers in a list:


        List<Integer> numbers01 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers01.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        //map() method:
        //The map() method takes a function and returns a stream that contains the result of applying the function
        // to each element of the original stream. Here's an example of how to use the map() method
        // to convert a list of strings to a list of their lengths:

        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<Integer> wordLengths = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Word lengths: " + wordLengths);












    }
}
