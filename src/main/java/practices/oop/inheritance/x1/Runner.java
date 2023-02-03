package practices.oop.inheritance.x1;

public class Runner {

    public static void main(String[] args) {

        Volume volume= new Volume();
        System.out.println("Volume of Cylinder is: "+volume.volumeOfCylinder(5, 10));//Volume of Cylinder is: 785.0

        System.out.println("Volume of Rectangular Prism is: "+volume.volumeOFRectangularPrism(4, 5, 11.5));
        //Volume of Rectangular Prism is: 230.0

        Area area= new Area();
        System.out.println("Area of square is: "+area.areaOfASquare(4.5));
        //Area of square is: 18.0

    }


}
