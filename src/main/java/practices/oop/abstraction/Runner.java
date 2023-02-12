package practices.oop.abstraction;

public class Runner {

    //Type code to calculate area of rectangle and triangle.(Use abstraction)
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.calculateArea(5,4));
        System.out.println(triangle.calculateArea(3,2));
        System.out.println(triangle.calculateArea(6,2));

        //System.out.println(new Rectangle().calculateArea(5,6));//Not Recommended
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.calculateArea(10,5));
        System.out.println(rectangle.calculateArea(6,3));

    }








}
