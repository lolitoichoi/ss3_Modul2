package studen_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Management {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 2;

        ArrayList<Student> students = new ArrayList<Student>();
        Student student;
        for (int i = 1; i <= n; i++) {
            System.out.printf("=====nhap vao thong tin sinh vien thu %d ==== \n" ,i);
            student = new Student();
            student.input();
            students.add(student);
        }
        System.out.println(" ");
        for (int i = 1; i < n; i++) {
            System.out.printf("Thong tin sinh vien thu %d ", i);
            students.get(i - 1).output();
        }

    }
}
    // class là bản thiết kế
// object là đối tượng của bản thiết kế
