package array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] arr1 = {10, 3, 5, 852, 3564, 134};
        System.out.println("unsorted array: " + Arrays.toString(arr1));
        int m = getMax(arr1);
        int s = getSum(arr1);
        int c = getAvg(arr1);
        int l = arr1.length;
        System.out.println("Max = " + m);
        System.out.println("Sum = " + s);
        System.out.println("Avg = " + c);
        System.out.println("Count = " + l);
        Arrays.sort(arr1);
        System.out.println("Sorted array: " + Arrays.toString(arr1));
    }

    public static int getMax(int[] arr) {

        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int getSum(int[] arr) {
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public static int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }
}
