package Cst_BaoDong;

public class QL_Student {
    public static void main(String[] args) {

        Student stu = new Student(1, "Nguyen van tuan", 9.4);

        // kiem tra thong tin
        System.out.println("id: " + stu.getId());
        System.out.println("name: " + stu.getName());
        System.out.println("diem: " + stu.getScore());


        // cap nhat thong tin
        stu.setName("Do thi thi mai");
        stu.setScore(9.5);

        System.out.println("Thong tin sau cap nhat");
        System.out.println("id: " + stu.getId());
        System.out.println("name: " + stu.getName());
        System.out.println("diem: " + stu.getScore());

        // nhap thong tin sai
        stu.setName(" ");
        stu.setScore(12);
    }
}
