package PhanSooo;

import java.util.Scanner;

public class ChechPhanSo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();

        System.out.println("Moi ban nhap phan so thu nhat :");
        ps1.input();

        System.out.println("Moi ban nhap phan so thu hai :");
        ps2.input();

        System.out.println("Thong tin phan so thu nhat sau khi rut gon");
        ps1.output();

        System.out.println("Thong tin phan so thu hai sau khi rut gon");
        ps2.output();

        System.out.println("Tong hai phan so: ");
        PhanSo cong = ps1.cong(ps2);
        cong.output();

        System.out.println("Hieu hai phan so: ");
        PhanSo hieu = ps1.hieu(ps2);
        hieu.output();

        System.out.println("Tich hai phan so: ");
        PhanSo tich = ps1.tich(ps2);
        tich.output();

        System.out.println("Thuong hai phan so: ");
        PhanSo thuong = ps1.thuong(ps2);
        thuong.output();

        // KIEM TRA PHAN SO DUONG

        System.out.println("Phan so thu nhat la phan so :" + (ps1.kiemTraSoDuong() ? "Duong" : "AM") + " ");
        System.out.println("Phan so thu hai la phan so :" + (ps2.kiemTraSoDuong() ? "Duong" : "AM") + " ");
        // KIEM TRA PHAN SO AM
        System.out.println("Phan so thu nhat la phan so:" + (ps1.kiemTraPhanSo() ? "Bang khong" : "khac khong") + " ");
        System.out.println("Phan so thu hai la phan so:" + (ps2.kiemTraPhanSo() ? "Bang khong" : "khac khong") + " ");

    }
}
