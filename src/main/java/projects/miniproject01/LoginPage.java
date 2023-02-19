package projects.miniproject01;

import java.util.Scanner;

public class LoginPage {

    public static void main(String[] args) {
        start();
    }

    public static void start() {

        Scanner inp = new Scanner(System.in);
        UserService service = new UserService();
        int select;

        do {
            showMenu();
            select = inp.nextInt();
            switch (select) {
                case 1:
                    service.signup();
                    break;
            }

        }while (select!=0);
    }

    public static void showMenu(){
        System.out.println("===TECHPROEDUCATION===");
        System.out.println("1-sign up");
        System.out.println("2-login");
        System.out.println("0-OUT");
        System.out.println("Your choice: ");
    }








}
