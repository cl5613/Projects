package array;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {

        int[] arr = {13, 232, 3, 31, 56, 41, 674, 672};

        //arr[0] - arr[1], arr[0] - arr[2] .....
        //arr[1] - arr[2], arr[1] - arr[3] .....

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

