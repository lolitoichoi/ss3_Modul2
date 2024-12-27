package Ls1;

import java.util.Scanner;

public class HocSinh {
    String name;
    double diemToan;
    double diemVan;

    // nhap thong tin

    public void input() {
        Scanner in = new Scanner(System.in);

        System.out.println("Nhập tên học sinh: ");
        name = in.nextLine();

        System.out.println("Nhập điểm toán: ");
        diemToan = Double.parseDouble(in.nextLine());

        System.out.println("Nhập điểm văn: ");
        diemVan = Double.parseDouble(in.nextLine());
    }

    // xuat thong tin
    public void output() {
        System.out.println("===========Thông tin học sinh========");
        System.out.println("Name: " + name);
        System.out.println("Diem Toan: " + diemToan);
        System.out.println("Diem Van: " + diemVan);
        System.out.println("Điểm trung bình: " + diemTrungBinh());
    }

    // tinh diem trung binh
    public double diemTrungBinh() {
        return (diemToan + diemVan) / 2;
    }
}
