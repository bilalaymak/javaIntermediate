package practices.ifternary;

public class IfTernary01 {
    public static void main(String[] args) {

        //Example 1: Type code to select the minimum one of two integers

        int a= 35;
        int b= 5;

        //1.way
        if(a<b){
            System.out.println("a is minimum");

        }else {
            System.out.println("b is minimum");
        }

        //2.way:by using ternary

        int r1= a<b ? a : b ;
        System.out.println("Minimum value is: " + r1);

        //Example 2: Type code to calculate absolute value of an integer

        //  5  ==> 5     -  0 ==> 0      -5 ==> -1 * -5==> 5

        int c= -5;
        int r2= c<0 ? -1*c : c;

        System.out.println("Absolute value is: " + r2);

        //Example 3:If two integers are positive return the multiplication
        //         Otherwise, give a message like "I do not know how to multiply"
        //         3 and 4  ==> 12   -   -3  and -4 =>"I do not know how to multiply"

        int d= 3;
        int e= 4;

        Object r3= d>0 && e>0 ? d*e : "I do not know how to multiply";


        System.out.println(r3);


        //Type code to check if a number is positive or not

        int x= 0;
        //1.way:
        if(x>0){
            System.out.println("Positive");
        }else {
            System.out.println("Not Positive");
        }

        //2.way:by ternary

        String result=  x>0 ? "Positive" : "Not Positive";

        System.out.println(result);

        //Type code to check if an integer has 3 digits or not==>
        // Boundary Value Analysis--> -1000, -999, 100, -99, 0, 99, 999, 1000

        int y= -343;

        int absY= Math.abs(y);

        String result2= absY>99 && absY<1000 ? "It has 3 digits" : "It does not have 3 digits";

        System.out.println(result2);

    }


}
