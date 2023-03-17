package step26exceptions;

public class E01 {
    /*
    1) to handle multiple exceptions you can use "multiple catch blocks" or "single catch block"
    2) if you prefer to use "single catch block" use "exception" in "catch parenthesis"
    3) When you use "multiple catch blocks" the order of the catch blocks is not important if and only if
          the Exception Classes do not have parent child relationship among them.
          If there is parent child relationship among them the child must be used first.


     */


    public static void main(String[] args) {

        String s1 = "240";
        System.out.println("dividedByNumOfChars(s1) = " + dividedByNumOfChars(s1));//dividedByNumOfChars(s1) = 80
        String s2 = null;
        System.out.println("dividedByNumOfChars(s2) = " + dividedByNumOfChars(s2));//dividedByNumOfChars(s2) = NullPointerException
        //most probably the String is null - null

        String s3 = "2a4b0c";
        System.out.println("dividedByNumOfChars(s3) = " + dividedByNumOfChars(s3));//dividedByNumOfChars(s3) = NumberFormatException
        //most probably the string contains non-digit characters - For input string: "2a4b0c"

        String s4 = "2";
        System.out.println("dividedByNumOfChars(s4) = " + dividedByNumOfChars(s4));//dividedByNumOfChars(s4) = ArithmeticException
        //most probably divisor is zero - / by zero

        System.out.println("********************************");

        String s5 = "240";
        String s6 = null;
        String s7= "2a4b0c";
        String s8 = "2";
        System.out.println("dividedByNumOfChar(s5) = " + dividedByNumOfChar(s5));//dividedByNumOfChar(s5) = 120
        System.out.println("dividedByNumOfChar(s6) = " + dividedByNumOfChar(s6));//an exception occurred - null
        //dividedByNumOfChar(s6) = 0
        System.out.println("dividedByNumOfChar(s7) = " + dividedByNumOfChar(s7));//an exception occurred - For input string: "2a4b0c"
        //dividedByNumOfChar(s7) = 0
        System.out.println("dividedByNumOfChar(s8) = " + dividedByNumOfChar(s8));//an exception occurred - / by zero
        //dividedByNumOfChar(s8) = 0



    }

    //example 1: create e method divides an Integer converted from a String
    // by 1 less than the number of characters of the String

    //          String s = "240"; ==> 240 / 3 = 80

    //1. way: how to handle multiple exceptions by using multiple catch block
    public static int dividedByNumOfChars(String s){
        int result = 0;
        try {
            int numOfChars = s.length();//NullPointerException is possible
            int num =  Integer.valueOf(s);//NumberFormatException is possible
            result = num / (numOfChars-1);//ArithmeticException is possible
        }catch (NullPointerException e){
            System.out.println("most probably the String is null - " + e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("most probably the string contains non-digit characters - " + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("most probably divisor is zero - " + e.getMessage());
        }
        //we typed codes in our typing code, but we can also type catch blocks in another queue

      return result;

    }



    //2. way: how to handle multiple exceptions by using just a single catch block

    public static int dividedByNumOfChar(String s){
        int result = 0;
        try {
            int numOfChars = s.length();//NullPointerException is possible
            int num =  Integer.valueOf(s);//NumberFormatException is possible
            result = num / (numOfChars-1);//ArithmeticException is possible
        }catch (Exception e){
            System.out.println("an exception occurred - " + e.getMessage());
        }


        return result;

    }

    //3. way: how to handle multiple exceptions by using Exception and any other

    public static int dividedByNumOfCh(String s){
        int result = 0;
        try {
            int numOfChars = s.length();//NullPointerException is possible
            int num =  Integer.valueOf(s);//NumberFormatException is possible
            result = num / (numOfChars-1);//ArithmeticException is possible
        } catch (ArithmeticException e){
            System.out.println("most probably divisor is zero - " + e.getMessage());
        } catch (Exception e){
            System.out.println("an exception occurred - " + e.getMessage());
        }


        return result;

    }



















}
