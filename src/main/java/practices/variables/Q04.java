package practices.variables;

public class Q04 {
    //Type a code that calculates the hypotenuse.
    //Formula of hypotenuse: a²+b²=c²
    public static void main(String[] args) {

        double a = 3;

        double b = 4;

        double c = Math.sqrt(a*a+b*b);

        System.out.println("Hypotenuse: "+c);

    }
}
