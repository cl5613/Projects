package String;

public class StringMethodDemo1 {

    public static void main(String[] args) {

        String s1 = "me";

        // separate chars into single ones
        char[] chars = s1.toCharArray();

        System.out.println(chars);

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i)); // print character at specific index
        }

    }
}
