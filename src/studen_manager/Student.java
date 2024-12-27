package studen_manager;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double score;
    private int age;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    Student () {   // constructor mặc định
//
//    }
//
//    Student (int id2, String name2, double score2, int age2) {   // constructor có tham số
//        this.id = id2;
//        this.name = name2;
//        this.score = score2;
//        this.age = age2;
//    }

    void input() {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap vao id: ");
        id = Integer.parseInt(in.nextLine());

        System.out.print("Nhap vao ten: ");
        name = in.nextLine();

        System.out.print("Nhap vao score: ");
        score = Double.parseDouble(in.nextLine());

        System.out.print("Nhap vao tuoi: ");
        age = Integer.parseInt(in.nextLine());


    }

    void output() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("score: " + score);
        System.out.println("age: " + age);
    }
}
