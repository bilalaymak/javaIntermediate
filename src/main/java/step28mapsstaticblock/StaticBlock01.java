package step28mapsstaticblock;

import java.time.LocalDate;

public class StaticBlock01 {
  /*
    1) Other name of the "static variable" is "class variable"
       Because "Java Class Loader" loads the static variables together with the class.
       So Static variables are created when the class created.
    2) Non-Static variables (Instance or Object variables) are created when you create and object
    3) To initialize "static variables" we have two option
        i) Initialize is directly like : public static int price=1000;
        ii) Initialize it by using "Static Block"
        1) Sometimes to initialize a static variable, we need to type code.
          To do that, use "Static Block"
        2) Static blocks are executed before everything in the class. Even before main method.
     4) There is also "instance block"
        Instance Block is used if you want to execute same code in all constructors in a class.(in all object creation)
     */

    public static int price;

    static {
        System.out.println("This is Static Block and It is called just once in Class Loading");
        int numOfMonth = LocalDate.now().getMonthValue();
        if (numOfMonth == 2) {
            price = 1000;
        } else {
            price = 2000;
        }
    }

    public int year;

    {
        System.out.println("I am instance block");
    }

    StaticBlock01() {
        System.out.println("First constructor");
    }

    StaticBlock01(int a) {
        System.out.println("Second constructor");
    }
















}
