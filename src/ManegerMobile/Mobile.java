package ManegerMobile;

import java.util.Scanner;

public class Mobile {
    private int id;
    private String tenDienThoai;
    private double giaBan;
    private String hangSX;
    private int thoiGianBaoHanh;


    public Mobile() {

    }

    public Mobile(int id, String tenDienThoai, double giaBan, String hangSX, int thoiGianBaoHanh) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.giaBan = giaBan;
        this.hangSX = hangSX;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public void input() {
        Scanner in = new Scanner(System.in);

        System.out.println("Moi ban nhap id :");
        id = in.nextInt();

        System.out.println("Moi ban nhap ten dien thoai");
        tenDienThoai = in.nextLine();

        System.out.println("Gia dien thoai: ");
        giaBan = in.nextDouble();

        System.out.println("Moi ban nhap hang sx");
        hangSX = in.nextLine();

        System.out.println("Thoi gian bao hanh: ");
        thoiGianBaoHanh = in.nextInt();
    }

    public void output() {

        System.out.println("Ten dien thoai: " + tenDienThoai);
        System.out.println("Gia dien thoai: " + giaBan);
        System.out.println("Hang sx: " + hangSX);
        System.out.println("Thoi gian bao hanh: " + thoiGianBaoHanh);
    }
}
