package step20overridingencapsulation.animal;

public class Animal {

 /*
                                  OVERRIDING
        1)Sometimes using method directly from parent class may not be enough for us.
          We may need the method to specify.
          When we need the method to specify, we change the method body.
          This is called "Method Overriding"
        2)We cannot touch "Method Signature"(Method Name and Method Parameters) in "Method Overriding"
          I mean do not touch Method Name and Method Parameters in "Method Overriding"
        3)The method in child class(Overriding Method) can use "same"
          or "wider" access modifier than the method in parent class(Overridden Method)
        4)When you change the "return type" in "method overriding",
          from child to parent you must have "IS-A" relationship.
        5)Return Type of the Overridden Method can be the "top return type" of the Overriding Method
        6)If there is "IS-A" relationship between return types, those called "Covariant Return Types"
        7)Between the "Wrapper Classes" there is no "parent-child relationship"
          that is why you cannot have "IS-A" relationship
          If you do not have "IS-A" relationship you cannot change return type in "Method Overriding"
        8)Between the "primitive data types" there is no "parent-child relationship"
          that is why you cannot have "IS-A" relationship
          If you do not have "IS-A" relationship you cannot change return type in "Method Overriding"
        9)If the return type is void, you cannot change it in method overriding  ***
        10)"private" methods in "parent class" cannot be overridden
        11)"static" method cannot be overridden

        "final" keyword in Java:
        1)"final" keyword can be used for variables
          If you use "final" keyword for variables
          i)You have to initialize the variable
          ii)After assigning a value you cannot update the value.
        2)"final" keyword can be used for classes
          If you use "final" keyword for a class, the class cannot have "Child Class"
        3)"final" keyword can be used for methods
          If you use "final" keyword for methods, the method cannot be overridden.
          The body of a "final method" cannot be updated,
          so it cannot be overridden because in overriding we update the method body

        12)polymorphism = method overloading + method overriding
           what is the difference between "method overloading" + "method overriding"
           i) "method overriding" needs "inheritance"
           but "method overloading" occurs in a single class we do not need "inheritance"
           ii)"private" method cannot be overridden but can be overloaded
           iii)we do not touch "method signature" in "method overriding"
               but we change "parameters" I mean "method signature" in "method overloading"
           iv)we cannot override "static" methods, we can "overload" them
           v)other name of "method overloading" is "static polymorphism"
             other name of "method overriding" is "dynamic polymorphism"
           v)other name of "method overloading" is "compile time polymorphism"
             other name of "method overriding" is "run time polymorphism"
     */

    protected void eat(){// Overridden Method
        System.out.println("Animals eat...");
    }

    public Animal create(){
        return new Animal();
    }

    public Integer number(){
        return 123;
    }

    public int num(){
        return 12;
    }






}






















