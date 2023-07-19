package array;

public class BinarySearch {


    public static void main(String[] args) {
        //sorted array

        int[] arr = {11,22,33,44,55,66,77,88,99};
        int index = binarySearch(arr, 44);

        System.out.println(index);

    }

    private static int binarySearch(int[] arr, int num) {

        int min = 0;
        int max = arr.length - 1;
        int mid;

        while (min <= max) {

            mid = (min + max) / 2;

            if (num > arr[mid]) {
                min = mid + 1;
            }
            else if (num < arr[mid]) {
                max = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}
