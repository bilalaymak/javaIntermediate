package day23encapsulationabstraction.practiceencapsulation;

public class Runner {
    public static void main(String[] args) {


        NativeStudent nativeStudent = new NativeStudent();
        nativeStudent.setId(1234);
        nativeStudent.setLanguage("English");
        nativeStudent.setAge("23");
        nativeStudent.setName("Tony");

        ForeignStudent foreignStudent = new ForeignStudent();
        foreignStudent.setId(4321);
        foreignStudent.setLanguage("French");
        foreignStudent.setAge("24");
        foreignStudent.setName("Mark");

        Student[] students = {foreignStudent, nativeStudent};
        for (Student w: students){
            System.out.println( "name: " + w.getName() + " -- "+ "age: " + w.getAge());
        }




    }
}
