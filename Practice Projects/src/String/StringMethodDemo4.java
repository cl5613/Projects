package String;

import java.io.StringBufferInputStream;

public class StringMethodDemo4 {


    public static void main(String[] args) {

        String s1 = "abcd";

        s1 = s1.replace("cd", "bb");

        System.out.println(s1);

        String s2 = "abc+d+ef";

        String[] arr = s2.split("\\+"); // \\

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
