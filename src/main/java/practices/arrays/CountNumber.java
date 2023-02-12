package practices.arrays;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {


        //Example : Count the number of words starts with "s" in the String

        //String str= {"Learn Java earn money"};

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the sentence, please");

        String str=input.nextLine();

        String[] strArr= str.split(" ");

        int counter=0;
        for(String w: strArr){

            if (w.startsWith("e") || w.startsWith("E")){

                counter++;
            }

        }
        System.out.println(counter + " words are in the sentence");

        if (counter==0){
            System.out.println("There is not a word starting with 's'");
        }




    }




}
