package ArrayList;

import java.util.ArrayList;

public class ArrayListMethodsUse {

    /*
    ArrayList<> list = new Arraylist<>();
    .add(E e)
    .add(int index, E element)

    .remove(int index)
    .remove(Object a)

    .set(int index, E element)

    -------------------------

    .get(int index)
    .size( )
     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("me");
        System.out.println(list);

        list.set(0, "you");
        System.out.println(list);
    }
}
