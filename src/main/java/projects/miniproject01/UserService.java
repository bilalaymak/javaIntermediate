package projects.miniproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    List<String> usernames = new ArrayList<>();
    List<String> emails = new ArrayList<>();
    List<String> passwords = new ArrayList<>();

    public void signup() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Name-Surname: ");
        String name = inp.nextLine();

        String username;
        boolean existsUsername;
        do {
            System.out.println("Enter username: ");
            username = inp.nextLine();
            existsUsername = this.usernames.contains(username);
            if (existsUsername) {
                System.out.println("This username is used, try a different username!");
            }
        }while(existsUsername);
//        usernames.add(username);

        /*
        : must contain @
        : Must end with gmail.com,hotmail.com or yahoo.com.
        In the username part of the mail (before the @) there can only be upper and lower case letters, numbers or -._ symbols.
         */

        String email;
        boolean isValid;
        boolean existsEmail;

        do {
            System.out.println("Enter email: ");
            email = inp.nextLine();
            isValid = validateEmail(email);
            existsEmail = this.emails.contains(email);
            if (existsEmail) {
                System.out.println("This email is already registered, try a different email!");
                isValid = false;
            }
        } while(!isValid);
        this.emails.add(email);
    }

    //to run your code without validation you need to comment out validateEmail()
    public boolean validateEmail(String email){

        return false;
    }





}
