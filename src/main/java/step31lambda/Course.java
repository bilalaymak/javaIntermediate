package step31lambda;

public class Course {
    //"pojo class" ==> plain old java object
    /*
    to create pojo class follow the steps
    1) private variables
    2) constructor with all parameters
    3) constructor without parameters
    4) public getters and setters
    5) toString method

     */

    //1) private variables
    private String courseName;
    private int numberOfStudents;
    private String season;
    private double averageScore;


    //3) constructor without parameters
    public Course() {
    }

    //2) constructor with all parameters
    public Course(String courseName, int numberOfCourse, String season, double averageScore) {
        this.courseName = courseName;
        this.numberOfStudents = numberOfCourse;
        this.season = season;
        this.averageScore = averageScore;
    }

    //4) public getters and setters


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    //5) toString method
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", numberOfCourse=" + numberOfStudents +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
