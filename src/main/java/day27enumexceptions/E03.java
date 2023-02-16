package day27enumexceptions;

public class E03 {
    public static void main(String[] args) {

          String str1 = "Java";
          String str2 = "";
          String str3= " ";
          String str4 = null;
        System.out.println(getNumOfCharsInString(str1));
        System.out.println(getNumOfCharsInString(str2));
        System.out.println(getNumOfCharsInString(str3));
        System.out.println(getNumOfCharsInString(str4));//NullPointerException
        //some methods in String create issue when we used them with
        //Java throws "NullPointerException" for this issue

        System.out.println("********************");
        System.out.println(convertStringToInt("123")-3);//120
        System.out.println(convertStringToInt("123a"));//NumberFormatException ==> for String "123a"
        //if you try to convert a String that contains a non-digit character
        //Java throws "NumberFormatException"



    }

          //Example 1: Create a method to get the number of characters in a String

    public static int getNumOfCharsInString(String str){
        try {
            return str.length();
        }catch (NullPointerException e){
            System.out.println("do not use length() method on null String ");
            return 0;
        }

    }

         //Example 2: Create a method to convert a String to an integer
         public static int convertStringToInt(String str){
        try {
            return Integer.valueOf(str);
        }catch (NumberFormatException e){
            System.out.println(str + " has non-digit character in it");//123a has non-digit character in it
            System.out.println(e.getMessage());//For input string: "123a"
            //to see the "technical message" use getMessage() method
            e.getStackTrace();//to see detailed error message, use printStackTrace() method
        return 0;
        }
         }






}
