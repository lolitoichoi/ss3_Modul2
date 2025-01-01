package ManegerMobile;

import java.util.Scanner;

public class DienThoaiCu extends Mobile{

    private int tinhTrangPin;
    private String moTa;


    public DienThoaiCu() {
        super();
    }

    public DienThoaiCu(int id, String tenDienThoai, double giaBan, String hangSX, int thoiGianBaoHanh, int tinhTrangPin, String moTa) {
        super(id, tenDienThoai, giaBan, hangSX, thoiGianBaoHanh);
        this.tinhTrangPin = tinhTrangPin;
        this.moTa = moTa;
    }

    public void input() {
        super.input();
        Scanner in = new Scanner(System.in);

        System.out.println("Moi ban nhap vao tinh trang Pin: ");
        this.tinhTrangPin = in.nextInt();

        System.out.println("Moi ban nhap mo ta: ");
        this.moTa = in.next();
    }

    public void output() {
        super.output();
        System.out.println("Moi ban nhap vao tinh trang Pin: " + this.tinhTrangPin);
        System.out.println("Moi ban nhap mo ta: " + this.moTa);
    }
}
