package step25enumexceptions;

public class E02 {
    public static void main(String[] args) {

        String[] arr = {"Tom","Mark","Ajda","Cuneyt"};
        System.out.println("getElement(arr,1) = " + getElement(arr, 1));//Mark
        System.out.println("getElement(arr,0) = " + getElement(arr, 0));//Tom
        System.out.println("getElement(arr,4) = " + getElement(arr, 4));//getElement(arr,4) =
        //ArrayIndexOutOfBoundsException
        //index of 4 is out of bound
        //if you use non-existing index in an array, java throws ArrayIndexOutOfBoundsException

        System.out.println("getElement(arr,-4) = " + getElement(arr, -4));//getElement(arr,-4) =

        System.out.println("****************");

        String str = "Java is so easy";
        getCharFromString(str,2);//v
        getCharFromString(str,15);//StringIndexOutOfBoundsException ==> String index is out of range 14
        //if you use non=existing index a String, java throws "StringIndexOutOfBoundsException"






    }

          //Example 1: Create a method to get any element from a String array

         public static String getElement(String[] arr, int idx){

        try {
            return arr[idx];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("do not use indexes less than 0 or greater than last index ");
            return "";
        }
    }

          //Example 2: Create a method to get a character from a String

    public static char getCharFromString(String str, int idx){
        try {
            return str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("do not use indexes less than 0 or greater than last index ");
            return ' ';// it must be single quotation mark, and it must be at least one character we type a space character
        }



    }










}
