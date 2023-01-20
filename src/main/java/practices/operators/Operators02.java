package practices.operators;

import java.util.Scanner;

public class Operators02 {
    //Ask user to enter an integer then print "Even" on the console if the number is even.

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer");
        int number= input.nextInt();
        boolean checkedNum=number%2==0;
        System.out.println("Is the number even? " + checkedNum);


        //Check a number if it is odd or not

        Scanner input2= new Scanner(System.in);
        System.out.println("Enter a digit to check if it is an odd number ");

        int checkOdd= input2.nextInt();

        System.out.println("Is the number odd? " + (checkOdd%2!=0));

    }

}
