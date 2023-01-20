package practices.operators;

public class Operators03 {
    // Write a Java program to break an integer into a sequence of individual digits.
    // Hint: use /(division operator) and % (modulus operator ==> give the remainder of a division operation)
    // x: input: 12345  ==> divide and give remainder
    //    output: 1
    //            2
    //            3
    //            4 ==>10 and then %10
    //            5

    public static void main(String[] args) {

        int number=12345;
        int ones= number%10;
        System.out.println("ones = " + ones);

        int tens= (number/10)%10;
        System.out.println("tens = " + tens);

        int hundreds=(number/100)%10;
        System.out.println("hundreds = " + hundreds);

        int thousands= (number/1000)%10;
        System.out.println("thousands = " + thousands);

        int tenThousands= (number/10000)%10;
        System.out.println("tenThousands = " + tenThousands);

        int num=12;
        int a=num%5;
        System.out.println("a = " + a);

    }

}
