package practices.wrapperclasses;

public class WrapperClass01 {
    public static void main(String[] args) {

        /*
        Wrapper Class
        They are Non-primitive Data Types, non-primitives have "values" and "methods".
        we can do many actions by using "methods", this is very useful.
        but primitive do not have any actions/methods with them,
        Java created a structure called wrapper class for primitive values and methods.

        Primitive Data
        byte
        short
        int
        long
        float
        double
        char
        boolean




         */

        int i = 12; //There is no method

        Integer number = 456; //There are many methods

        char c = 'A';

        Character wc = 'A';

        //1) AutoBoxing: To convert "primitive data" to "wrapper class" of the primitive data
        byte b = 23;

        System.out.println(b);
        Byte wb = b;
        System.out.println(wb.floatValue());


        //2) Unboxing: To convert "wrapper class" to "primitive data" of the wrapper class
        Short ws = 34;

        short s = ws;

        //How to get the minimum and maximum values of numeric data types in Java.
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Short.MAX_VALUE); //32767
        System.out.println(Short.MIN_VALUE); //-32768

        System.out.println(Character.MAX_VALUE); //
        System.out.println(Integer.MIN_VALUE); //2147483648
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Character.MAX_VALUE); //
        System.out.println(Character.MIN_VALUE); //
        System.out.println(Short.MIN_VALUE); //-32768
        System.out.println(Short.MAX_VALUE); //32767
        System.out.println(Long.MIN_VALUE); //-9223372036854775808
        System.out.println(Long.MAX_VALUE); //9223372036854775807
        System.out.println(Double.MAX_VALUE); //1.7976931348623157E308
        System.out.println(Double.MIN_VALUE); //4.9E-324
        System.out.println(Byte.MIN_VALUE); //-128
        System.out.println(Byte.MAX_VALUE); //127
        System.out.println(Float.MIN_VALUE); // 1.4E-45
        System.out.println(Float.MAX_VALUE); //3.4028235E38
    }
}
