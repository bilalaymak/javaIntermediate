package day33lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LambdaForTextFiles {

    public static void main(String[] args) throws IOException {


        //how to access a text file and print the text on console
        Files.lines(Paths.get("src\\main\\java\\day33lambda\\MyTextFile.txt")).
                forEach(System.out::println);





    }



}
