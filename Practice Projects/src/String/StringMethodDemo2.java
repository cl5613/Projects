package String;

public class StringMethodDemo2 {


    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "ABC";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));


    }

}
