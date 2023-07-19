package array;

import java.util.Arrays;

public class SwapArray {

    public static void main(String[] args) {

        //Part
        int[] arr = {0, 1, 2, 3, 4, 5, 6};

        int start = 0, end = arr.length - 1;

        for (; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        System.out.println(Arrays.toString(arr));

        for (int j : arr) {
            System.out.println(j);
        }

        // Part
        String originalStr = "Hello";
        String reversedStr = "";
        System.out.println("Original string: " + originalStr);

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        System.out.println("Reversed string: "+ reversedStr);

    }

}


