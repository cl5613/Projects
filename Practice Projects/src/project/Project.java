package project;

import java.util.Random;

public class Project {
    public static void main(String[] args) {

        printTriangle(); //print triangle
        print99();   //print 99
        random();   //random number
    }

    public static void printTriangle() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }

    public static void print99() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------");

    }
    public static void random() {

        Random r = new Random();
        int c = 0;
        for (int i = 1; i <= 3; i++) {
            int num = r.nextInt(10) + 1;
            c++;
            System.out.println("Random numbers " + c + " = " + num);
        }
    }
}
