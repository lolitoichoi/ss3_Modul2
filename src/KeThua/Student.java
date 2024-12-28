package KeThua;

import java.util.Scanner;

public class Student extends Person {
    private double score;

    public Student() {
        super();
    }

    public Student(int id, String name, double score) {
        super(id, name);
        this.score = score;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        super.input();

        System.out.println("nhap vao score: ");
        score = Integer.parseInt(in.nextLine());
    }

    public void output() {
        super.output();

        System.out.println("nhap vao score: " + score);
    }
}
