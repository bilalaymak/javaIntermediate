package step31lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaForTextFiles {

    public static void main(String[] args) throws IOException {


        //how to access a text file and print the text on console
        Files.lines(Paths.get("src\\main\\java\\day33lambda\\MyTextFile.txt")).
                forEach(System.out::println);

        System.out.println("*************");
        //Convert all characters in the text file to uppercase then print the text on the console
        Files.lines(Paths.get("src\\main\\java\\day33lambda\\MyTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

        ////Check if the text file has word "Java" in it
        boolean isExistJava = Files.lines(Paths.get("src\\main\\java\\day33lambda\\MyTextFile.txt")).
                anyMatch(t -> t.contains("Java"));
        System.out.println(isExistJava);//true

        System.out.println("*******************");

        //Print distinct words on the console in the file

        Files.lines(Paths.get("src\\main\\java\\day33lambda\\MyTextFile.txt")).
                map(t-> t.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);

        System.out.println("*******************");

        //Get the words which end with "s" and print them on the console
        Files.lines(Paths.get("src\\main\\java\\day33lambda\\MyTextFile.txt")).
                map(t-> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("s")).
                forEach(System.out::println);

        System.out.println("*******************");


        //Get the words distinctly, convert them to lowercase and print them on the console in reverse order
        Files.lines(Paths.get("src\\main\\java\\day33lambda\\MyTextFile.txt")).
                map(t-> t.split(" ")).
                flatMap(Arrays::stream).
                map(t->t.toLowerCase()).distinct().
                map(t-> t.replaceAll("[^a-zA-Z]","")).
                sorted(Comparator.reverseOrder()).
                forEach(System.out::println);

        System.out.println("*******************");

        //Find the total number of words in the text file
        int resultSum = Files.lines(Paths.get("src\\main\\java\\day33lambda\\MyTextFile.txt")).
                map(t-> t.split(" ")).
                flatMap(Arrays::stream).
                map(t-> t.replaceAll("[^a-zA-Z]","")).
                map(t->t.length()).reduce(Math::addExact).get();
        System.out.println(resultSum);//76





    }



}
