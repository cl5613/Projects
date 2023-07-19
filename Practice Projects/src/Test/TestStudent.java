package Test;

import Domain.Student;
import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Welcome to Student Management System");
            System.out.println("1 Add student:");
            System.out.println("2 Look for student:");
            System.out.println("3 Delete student:");
            System.out.println("4 Revise student");
            System.out.println("5 Quit");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    addStudent(list);
                    break;
                case 2:
                    queryStudentInfo(list);
                    break;
                case 3:
                    deleteStudentById(list);
                    break;
                case 4:
                    UpdateStudentById(list);
                    break;
                case 5:
                    System.out.println("Thank you for using.");
                    System.exit(0);
                default:
                    System.out.println("Wrong number entered, try again");
                    break;
            }
        }
    }

    private static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student iD:");
        String id = " ";

        while(true) {
            id = sc.next();

            int index = getIndex(id, list);

            if (index == -1) {
                break;
            }
            else {
                System.out.println("Student id already there, enter a new one");
            }
        }

        System.out.println("Enter student name:");
        String name = sc.next();
        System.out.println("Enter student age:");
        int age = sc.nextInt();
        System.out.println("Enter student birthday:");
        String birthday = sc.next();

        Student stu = new Student(id, name, age, birthday);
        list.add(stu);
    }

    private static void UpdateStudentById(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID:");

        String updateID = sc.next();
        int index = getIndex(updateID, list);

        if(index == -1) {
            System.out.println("No student assiciate with this id");
        }
        else {
            System.out.println("Enter student new name:");
            String name = sc.next();

            System.out.println("Enter student new age:");
            int age = sc.nextInt();

            System.out.println("Enter student new birthday:");
            String birthday = sc.next();

            Student stu = new Student(updateID, name, age, birthday);
            list.set(index, stu);
            System.out.println("Updated successfully");
        }
    }

    private static void deleteStudentById(ArrayList<Student> list) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ID:");

        String id = sc.next();
        int index = getIndex(id, list);

        if(index == -1) {
            System.out.println("No student assiciate with this id");
        }
        else {
            list.remove(index);
        }
    }


    private static void queryStudentInfo(ArrayList<Student> list) {
            if (list.size() == 0) {
                System.out.println("No students in the list");
            }
            else{
                for (int i = 0; i < list.size(); i++) {
                    Student stu = list.get(i);
                    System.out.println(stu.getName() + "---" + stu.getId() + "---"
                            + stu.getBirthday() + "---" + stu.getAge());
                }
            }
    }

    public static int getIndex(String id, ArrayList<Student> list) {

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
