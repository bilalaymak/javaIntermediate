package practices.oop.inheritance.mathematics;

public class Mathematics {


    public double multiply(double... x) {
        double result = 1;
        for (double w : x) {
            result *= w;  //result = result * w;
        }
        return result;
    }

    public double findSquare(double x) {
        return x * x;
    }









}
