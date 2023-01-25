package day16arraylists;

public class PassByValueAndPassByReference {

    public static void main(String[] args) {

 /*
        1)PassByValue creates a copy of the value and uses the copy in the method.
          That is why methods can change just the copy not original value.
          Java uses PassByValue to protect original values
        2)Some programming languages like C-Sharp use PassByReference.
          PassByReference creates the copy of the reference(address) and use the copy in the methods.
          Copy Reference and Original Reference point the original value that is why original is updated by the methods.
          I mean if you use PassByReference, you cannot protect original values.
     */



        int shirtPrice=100;
        studentShirtPrice(shirtPrice, 10 );

    }

    public static int studentShirtPrice(int shirtPrice, int discount){
        return shirtPrice- discount;

    }




    }
















