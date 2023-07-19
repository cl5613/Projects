package String;

import java.util.Scanner;

public class StringTest1 {

    public static void main(String[] args) {

        String username = "admin";
        String password = "123456";

        Scanner sc = new Scanner(System.in);

        int i = 1;

        for (; i <= 3; i++) {

            System.out.println("put username:");
            String inputUserName = sc.nextLine();

            System.out.println("put password");
            String inputPassword = sc.nextLine();

            if (inputUserName.equals(username) && inputPassword.equals(password)) {
                System.out.println("log in successful");
                break;
            }
            else {
                if (i == 3) {
                    System.out.println("can't enter more");
                }
                else {
                    System.out.println("log in unsuccessful try " + (3-i) + " more times");
                }
            }
        }
    }
}

