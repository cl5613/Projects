package array;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        //swap if the element on the left is greater than the right
        int[] arr = {50, 40, 30, 20, 10, 4, 13};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
