package step25enumexceptions;

public class E01 {
    public static void main(String[] args) {

/*
1) Exception means "un-expected issue" in codding
2) When we have exception we have two ways:
    i) We can handle it by using "try-catch block"
    ii) We "Throw Exception" and block the application.
3) We handle the Exception mostly, if you do not handle the exception
    i) Execution will be stopped
    ii) Application will be blocked
 */

        System.out.println(divide1(4,2));//2
        System.out.println(divide1(0,55));//0
        System.out.println(divide1(6,0));//Arithmetic Exception ==> / by zero
        System.out.println("hello world");//after exception, we will not see "hello world"
        //divide1(6/0) threw ArithmeticException that is why this code cannot execute
        //when you break any mathematical rule like dividing by zero,
        //Java throws ArithmeticException

        System.out.println(divide2(4,0));//divider cannot be 0 and 0
        System.out.println(divide2(4,1));//4







    }

    //Example 1: Create a method divides two integers
    //1. way: we can use if-else, but it is not recommended

    public static int divide1(int a, int b){
        if (b==0){
            System.out.println("divider cannot be 0");
            return 0;
        }else {
            return a / b;
        }

    }

    //2. Way: we can use try-catch block

    public static int divide2(int a, int b){
        int result = 0;
        try {
            result =  a/b;//when we use return keyword here, the next code will not execute,
                          //so we used a container to handle it
            System.out.println("hello world 2");
        }catch (ArithmeticException e){
            System.out.println("divider cannot be 0");
        }
        return result;
    }











}
