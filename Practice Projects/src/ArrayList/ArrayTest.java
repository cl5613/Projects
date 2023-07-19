package ArrayList;

import java.util.ArrayList;

public class ArrayTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("me");
        list.add("you");
        list.add("he");
        list.add("him");

        for (int i = list.size() - 1; i >= 0; i--) {
            String s = list.get(i);
            if("me".equals(s)) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);


    }

}



