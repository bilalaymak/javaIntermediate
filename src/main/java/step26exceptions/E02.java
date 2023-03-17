package step26exceptions;

public class E02 {

    public static void main(String[] args) {

     //   printAge(-23);

        printGrades(98);//your grade is 98
        printGrades(120);//IllegalArgumentException ==> your grade must be greater than 0 and less than 100






    }

    //example 1: create a method to print user's age on the console
    //           if the age is negative, the age should not be printed on the console

    public static void printAge(int age){


        if (age<0){
            throw new  IllegalArgumentException("age cannot be less than zero");
        }
        System.out.println("your age is " + age);
    }

    //example 2: create a method to print student's grades
    //           if the age is less than zero or greater than 100, the age should throw Exception with a message


    public static void  printGrades(int grade){

        if (grade<0 || grade>100){
            throw new IllegalArgumentException("your grade must be greater than 0 and less than 100 - you entered " + grade);
        }
        System.out.println("your grade is " + grade);


    }











}
