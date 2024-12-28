package Cst_BaoDong;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double score;

    public Student() {

    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    // getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    // setter

    public void setName(String name) {
        // kiem tra name co chua khoang trang
        if(name.trim().equals("")) {
            System.out.println("name is empty");
        } else {
            this.name = name;
        }
    }

    public void setScore(double score) {
        // kiem tra diem so co nam tu 0 den 10
        if(score < 0 || score > 10) {
            System.out.println("score is out of range");
        } else {
            this.score = score;
        }
    }

//    public void input() {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Moi ban nhap id: ");
//        id = in.nextInt();
//
//        System.out.println("Moi ban nhap name: ");
//        name = in.next();
//
//        System.out.println("Moi ban nhap score: ");
//        score = Double.parseDouble(in.nextLine());
//    }
//
//    public void output() {
//        System.out.println("id: " + id);
//        System.out.println("name: " + name);
//        System.out.println("score: " + score);
//    }
}
