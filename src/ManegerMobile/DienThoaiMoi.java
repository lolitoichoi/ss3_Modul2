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

//        System.out.println("Moi ban nhap id :");
//        id = in.nextInt();
//
//        System.out.println("Moi ban nhap ten dien thoai");
//        tenDienThoai = in.nextLine();
//
//        System.out.println("Gia dien thoai: ");
//        giaBan = in.nextDouble();
//
//        System.out.println("Moi ban nhap hang sx");
//        hangSX = in.nextLine();
//
//        System.out.println("Thoi gian bao hanh: ");
//        thoiGianBaoHanh = in.nextInt();

        System.out.println("Moi ban nhap soLuong");
        soLuong = in.nextInt();
    }

    public void output() {

        super.output();
        System.out.println("so luong: " + soLuong);
    }
}
