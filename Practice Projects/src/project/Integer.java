package project;

import java.util.Scanner;

public class Integer {

    public static int subtractProductAndSum(int n) {
        long sum = 0;
        long prd = 1;

        while (n > 0) {
            int result = n % 10;
            sum += result;
            prd *= result;
            n = n / 10;
        }
        return (int) (prd - sum);
    }

    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int res = subtractProductAndSum(num);

        System.out.println(res + " is the final answer after subtract the sum from product "
                + "of each digit");
    }

}
