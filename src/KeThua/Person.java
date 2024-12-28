package KeThua;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;

    public Person() {

    }
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void input() {
        Scanner in = new Scanner(System.in);

        System.out.println("nhap vao id: ");
        id = Integer.parseInt(in.nextLine());

        System.out.println("Nhap vao ten: ");
        name = in.nextLine();
    }

    public void output() {
        System.out.println(" id: " + id );
        System.out.println(" Name: " + name );
    }

}
