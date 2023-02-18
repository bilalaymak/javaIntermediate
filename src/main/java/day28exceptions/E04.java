package day28exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04 {

    /*




     */


        public static void main(String[] args) throws IOException {


        readTextFile();


    }


      //example 1: create a method to read a text file

    public static void readTextFile() throws IOException {


        FileInputStream fis = new FileInputStream("src/main/java/day28exceptions/MyText.txt");

        int k = 0;

        while ((k = fis.read()) != -1){
            System.out.print((char) k);
        }
    }





}
