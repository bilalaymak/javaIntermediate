package day33lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaForCourseObjects {
    public static void main(String[] args) {



        Course courseTurkishDay = new Course("Turkish day time", 124, "summer", 97.2);
        System.out.println(courseTurkishDay);
        //Course{courseName='turkish day time', numberOfCourse=124, season='summer', averageScore=97.2}
        //it came from toString method
        //if we did not use toString method, it gives hashcode

        Course courseTurkishNight = new Course("Turkish night time", 125, "winter", 98.4);
         System.out.println(courseTurkishNight);
        //Course{courseName='turkish night time', numberOfCourse=125, season='winter', averageScore=98.4}

        Course courseEnglishDay = new Course("English day time", 126, "spring", 93.8);
         System.out.println(courseEnglishDay);
        //Course{courseName='english day time', numberOfCourse=126, season='spring', averageScore=93.8}

        Course courseEnglishNight = new Course("English night time", 127, "summer", 94.2);
        System.out.println(courseEnglishNight);
        //Course{courseName='english night time', numberOfCourse=127, season='summer', averageScore=94.2}

        List<Course> courses = new ArrayList<>();
        courses.add(courseTurkishDay);
        courses.add(courseTurkishNight);
        courses.add(courseEnglishDay);
        courses.add(courseEnglishNight);

        System.out.println(courses);
        //[Course{courseName='turkish day time', numberOfCourse=124, season='summer', averageScore=97.2},
        // Course{courseName='turkish night time', numberOfCourse=125, season='winter', averageScore=98.4},
        // Course{courseName='english day time', numberOfCourse=126, season='spring', averageScore=93.8},
        // Course{courseName='english night time', numberOfCourse=127, season='summer', averageScore=94.2}]

        System.out.println(courses.get(0).getNumberOfStudents());//124
        //we get the number of students from the list of courses getNameOfStudent

        System.out.println(checkAverageScoresToBeGreaterThanAnyNumberStream(courses,91));//true
        System.out.println(checkAverageScoresToBeGreaterThanAnyNumber(courses,91));//true
        System.out.println(checkCourseNameContainsTurkishStream(courses,"Turkish"));//true
        printCourseWhoseAvgIsHighest(courses);
        System.out.println(skipFirstTwoReturnOthersAfterSorting(courses));
        //[Course{courseName='Turkish day time', numberOfCourse=124, season='summer', averageScore=97.2},
        //Course{courseName='Turkish night time', numberOfCourse=125, season='winter', averageScore=98.4}]
        System.out.println(printTheThirdCourseAfterReverseOrder(courses));
        //[Course{courseName='Turkish night time', numberOfCourse=125, season='winter', averageScore=98.4}]



    }

    //1)Create a method to check if all average scores are greater than 91
    public  static boolean checkAverageScoresToBeGreaterThanAnyNumber(List<Course> courses, int averageNum){
        for (Course course : courses) {
            if (course.getAverageScore() > averageNum) {
                return true;
            }
        }
        return false;
    }

     //1.a way in Stream
    public  static boolean checkAverageScoresToBeGreaterThanAnyNumberStream(List<Course> courses, int averageNum){
        return courses.stream().allMatch(t-> t.getAverageScore() > averageNum);
        //allMatch() method returns false if any of them is false
    }

    //2)Create a method to check if at least one of the course names contains "Turkish" word
    public  static boolean checkCourseNameContainsTurkish(List<Course> courses){
        return courses.stream().anyMatch(t-> t.getCourseName().contains("Turkish"));
    }
    //2.a way
    public  static boolean checkCourseNameContainsTurkishStream(List<Course> courses,String word){
        return courses.stream().anyMatch(t-> t.getCourseName().contains(word));
    }

    //3)Create a method to print the course whose average score is the highest
    public  static void printCourseWhoseAvgIsHighest(List<Course> courses){
        courses.stream().max(Comparator.comparing(Course::getAverageScore)).ifPresent(System.out::println);
        //max() method returns null if there are no elements
        System.out.println("2. way " +courses.stream().max(Comparator.comparing(Course::getAverageScore)).get());

        System.out.println("3. way " + courses.stream().sorted(Comparator.comparing(Course::getAverageScore)).findFirst().get());

    }

      //4)Sort the list elements according to the average score in ascending order(natural order) and skip first 2 elements
    public  static List<Course> skipFirstTwoReturnOthersAfterSorting(List<Course> courses){
        return courses.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());

    }
    //5)Sort the list elements according to the number of students in descending order and print just the 3rd one
    public  static List<Course> printTheThirdCourseAfterReverseOrder(List<Course> courses){
        return courses.stream().
                sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).
                skip(2).limit(1). //we did it to get 3. one
                collect(Collectors.toList());
    }










}
