package day22overridingencapsulation.student;

import java.util.Arrays;

public class Student {


  /*
      1) when we type code, we may need to hide some data for some reasons
         "encapsulation" means "hiding data"
      2) after encapsulating a data, if you need, you may read the value
         by using "get method" (getter)
         we use getter to read hiding data

  */

    public String stdName;
    int stdGpa;
    private String psychologicalIssues = "Depression";

    public String getPsychologicalIssues(){
        return psychologicalIssues;
    }




}
