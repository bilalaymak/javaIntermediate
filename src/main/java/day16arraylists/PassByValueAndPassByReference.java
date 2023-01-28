package day16arraylists;

public class PassByValueAndPassByReference {

    public static void main(String[] args) {

 /*
        1)PassByValue creates a copy of the value and uses the copy in the method.
          That is why methods can change just the copy not original value.
          Java uses PassByValue to protect original values
        2)Some programming languages like C# use PassByReference.
          PassByReference creates the copy of the reference(address) and use the copy as if a real assigned value,
          in the methods.
          Copy Reference and Original Reference point the original value that is why, original is updated by the methods.
          I mean if you use PassByReference, you cannot protect original values.
          Java uses PassByValue== it does not change the actual assigned value of an object.
     */



        int shirtPrice=100;
        int discountedStudent = studentShirtPrice(shirtPrice, 10 );
        System.out.println("discountedStudent = " + discountedStudent);//discountedStudent = 90
        System.out.println("shirtPrice = " + shirtPrice);//100
        veteransdiscount(shirtPrice,20);//discountedPrice = 80
        System.out.println("shirtPrice = " + shirtPrice);//100

        String name = "Ajda";
        String result =  putExclamationMark(name);
        System.out.println("result = " + result);//result = Ajda!
        System.out.println("name = " + name);//name = Ajda original one was not changed

        int salary = 20000;
        double newSalary =  increaseSalary(salary);
        System.out.println("the increased salary is = " + newSalary);//the increased salary is = 24000.0
        System.out.println("salary = " + salary);//salary = 20000

        int abs = getAbsoluteValue(-5);
        System.out.println("abs = " + abs);//5
        //we can also do
        System.out.println(getAbsoluteValue(-5));//5

        System.out.println("add of two int : " + add(1,2));//add of two int : 3
        System.out.println("get the first char and the last char :" + getfirstAndLastChar("Java"));
        //get the first char and the last char :J and a
        System.out.println(getSumOfAsciiValues("Java"));//386



    }

    public static int studentShirtPrice(int shirtPrice, int discount){
        return shirtPrice- discount;

    }

    public static void veteransdiscount(int shirtPrice, int discount){
        int discountedPrice = shirtPrice - discount;
        System.out.println("discountedPrice = " + discountedPrice);
    }
    public static String putExclamationMark( String name){
        return name + "!";
    }

    //create a method that increases the salary by 20%

    public static double increaseSalary(double salary){
       return salary * 1.2;
    }
    //create a method that calculates the absolute value of an integer
    // -5 ==> 5  5 ==> 5  0 ==> 0

    public static int getAbsoluteValue(int n){
        if (n<0){
           return n * -1;
        }else {
            return n;
        }
    }
    //Create a method adds two integers
    //Create a method prints the first and the last character on the console
    //Create a method prints the sum of the ASCII values of characters in a String

    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static String getfirstAndLastChar(String str1){
        char firstChar = str1.charAt(0);
        char lastChar = str1.charAt(str1.length()-1);
        return firstChar + " and " + lastChar;
    }

    public static int getSumOfAsciiValues (String str2){
        int sum = 0;
        for (int i = 0; i < str2.length(); i++){
            sum = sum + str2.charAt(i);
        }
        return sum;
    }









}
















