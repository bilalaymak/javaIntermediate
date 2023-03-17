package step30lambda;

public class Utils {


    public static void printInTheSameLineWithSpace(Object o){
        System.out.print(o + " ");
    }
    public static int getSquare(int num){
        return  num*num;
    }

    public static int getSumOfDigits(int num){
        int sum = 0;
        while (num !=0){
            sum = sum + num%10;
            num = num/10;
        }
        return sum;
    }











}
