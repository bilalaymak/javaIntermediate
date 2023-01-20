package practices.loops.forloop;

public class SumOfdigits01 {
    public static void main(String[] args) {

        // Type code to find the sum of the digits of an integer
        //  584 ==> 5+8+4= 17  ==> %10 AND ORDINARY DIVISION BY 10

        int sum=0;
        int number= -584;
        number= Math.abs(number);//584

        for (int i=number; i>0;  i=i/10 ){


            sum=  sum + i%10;


        }
        System.out.println(sum);



    }
}
