package projects.encapsulation.practiceencapsulation;

public class Manager {

    public static void managerRules(){
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

        NativeStudent ogrenci1 = new NativeStudent();
        ogrenci1.setName("Ahmet");
        ogrenci1.setLanguage("Turkish");
        ogrenci1.setAge("20");
        ogrenci1.setId(123);

        System.out.println(ogrenci1.getId());
        System.out.println(ogrenci1.getName());
        System.out.println(ogrenci1.getLanguage());
        System.out.println(ogrenci1.getAge());




    }


}
