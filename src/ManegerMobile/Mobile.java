package ManegerMobile;

import java.util.Scanner;

public abstract class Mobile {
    private String id;
    private String tenDienThoai;
    private double giaBan;
    private String hangSX;
    private int thoiGianBaoHanh;


    public Mobile() {
        super();
    }

    public Mobile(String id, String tenDienThoai, double giaBan, String hangSX, int thoiGianBaoHanh) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.giaBan = giaBan;
        this.hangSX = hangSX;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getId() {
        return id;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public String getHangSX() {
        return hangSX;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract double calculateTotalPrice();

    public void input() {
        Scanner in = new Scanner(System.in);

        System.out.println("Moi ban nhap id :");
        id = String.valueOf(in.nextInt());

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
        System.out.println("ID: " + this.id);
        System.out.println("Ten dien thoai: " + this.tenDienThoai);
        System.out.println("Gia dien thoai: " + this.giaBan);
        System.out.println("Hang sx: " + this.hangSX);
        System.out.println("Thoi gian bao hanh: " + this.thoiGianBaoHanh);
    }
}
