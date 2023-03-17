package step26exceptions;

public class E03 {

    /*
    1) "finally block" is used to execute some codes under every condition
    2) "finally block" can be used with "try-catch" or just with "try"
    3) "try block" can be used alone
       "try block" can be used   i) with a single catch
                                ii) with multiple catch block
                               iii) with a single catch and finally
                                iv) with a multiple catches and finally
                                 v) with just a finally
    4)"finally block" can be used just once

         interview question: can you explain "final", "finally", "finalize" keywords?

       "finalize" is a process java does before throwing unused things from memory to trash

     */

    public static void main(String[] args) {

           divide(6,0);

    }

    //example 1: create a method to do division
    //the method should print "the mission is completed" even exception thrown or not

    public static int divide(int a, int b){
         int result = 0;
         try {
             result = a/b;
         }catch (ArithmeticException e){
             System.out.println(e.getMessage());
         }finally {
         System.out.println("the mission is completed");
         }
         return result;


    }


}
