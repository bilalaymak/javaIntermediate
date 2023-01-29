package day19constructorsaccessmodifiersstatic.student;

import day19constructorsaccessmodifiersstatic.student.Students;

public class StudentsRunner {


    public static void main(String[] args) {

      Students std1 = new Students("Tom", 13, true, "male");

      Students std2 = new Students("Ali",21,false);

      Students std3 = new Students();

        System.out.println("std1.stdName = " + std1.stdName);//std1.stdName = Tom
        System.out.println("std2.gender = " + std2.gender);//std2.gender = null
        System.out.println("std2.age = " + std2.age);//std2.age = 21
        System.out.println("std3.age = " + std3.age);//std3.age = 0


    }
}
