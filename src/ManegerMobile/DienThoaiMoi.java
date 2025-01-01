package ManegerMobile;

import java.util.Scanner;

public class DienThoaiMoi extends Mobile{

    private int soLuong;

    public DienThoaiMoi() {
        super();
    }

    public DienThoaiMoi(int id, String tenDienThoai, double giaBan, String hangSX, int thoiGianBaoHanh, int soLuong) {
        super(id, tenDienThoai, giaBan, hangSX, thoiGianBaoHanh);
        this.soLuong = soLuong;
    }
    public void input() {
        Scanner in = new Scanner(System.in);

        super.input();
        System.out.println("Moi ban nhap soLuong");
        soLuong = in.nextInt();
    }

    public void output() {
        super.output();
        System.out.println("so luong: " + soLuong);
    }
}
