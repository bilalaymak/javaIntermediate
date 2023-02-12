package practices.ifternary;

public class RecursiveFactorial {

    //Create a method that calculates factorial without using loops.
    public static void main(String[] args) {

        System.out.println(factorial(-5));

    }

    public static int factorial(int number) {
        if (number >= 0) {
            if (number == 0 || number == 1) {
                return 1;
            } else {
                return number * factorial(number - 1);//recursive call !!!
            }
        } else {
            System.out.println("Number can not be negative!");
            return 0;
        }
    }


}

