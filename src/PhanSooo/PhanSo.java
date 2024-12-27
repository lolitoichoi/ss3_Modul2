package PhanSooo;

import java.util.Scanner;

public class PhanSo {
    private int phanTu;
    private int phanMau;

    public void input() {
        Scanner in = new Scanner(System.in);

        System.out.println("Mời bạn nhập phần tử: ");
        phanTu = in.nextInt();

        do {
            System.out.println("Mời bạn nhập phần mẫu != 0: ");
            phanMau = in.nextInt();
        } while(phanMau == 0);
    }

    // rut gon phan so
    public void rutGon() {
        int ucln = uocChungLonNhat(phanTu, phanMau);
        phanTu /= ucln;
        phanMau /= ucln;

        // mau số là số dương
        if (phanMau < 0 ){
            phanTu = -phanTu;
            phanMau = -phanMau;
        }
    }

    // tim uoc chung lon nhat
    public int uocChungLonNhat(int tu, int mau) {
        if(tu == 0 || mau == 0){
            return 1;
        }
        tu = Math.abs(tu);
        for(int i = tu; i >= 1; i--){
            if(tu % i == 0 && mau % i == 0){
                return i;
            }
        }
        return 1;
    }

    public void output() {
        rutGon();
        if(phanMau == 1) {
            System.out.println(phanTu);
        } else {
            System.out.println(phanTu + "/" + phanMau);
        }

    }

    // Tinh tong 2 phan so
    PhanSo cong(PhanSo phanSoKhac){
        PhanSo ketQua = new PhanSo();
        ketQua.phanTu = this.phanTu * phanSoKhac.phanMau + phanSoKhac.phanTu * this.phanMau;
        ketQua.phanMau = this.phanMau * phanSoKhac.phanMau;
        return ketQua;
    }

    PhanSo hieu(PhanSo phanSoKhac){
        PhanSo ketQua = new PhanSo();
        ketQua.phanTu = this.phanTu * phanSoKhac.phanMau - phanSoKhac.phanTu * this.phanMau;
        ketQua.phanMau = this.phanMau * phanSoKhac.phanMau;
        return ketQua;
    }

    PhanSo tich(PhanSo phanSoKhac){
        PhanSo ketQua = new PhanSo();
        ketQua.phanTu = this.phanTu * phanSoKhac.phanTu ;
        ketQua.phanMau = this.phanMau * phanSoKhac.phanMau;
        return ketQua;
    }

    PhanSo thuong(PhanSo phanSoKhac){
        PhanSo ketQua = new PhanSo();
        ketQua.phanTu = this.phanTu * phanSoKhac.phanMau;
        ketQua.phanMau = this.phanMau * phanSoKhac.phanTu;
        return ketQua;
    }

    public boolean kiemTraSoDuong() {
        return phanTu * phanMau > 0;
    }

    public boolean kiemTraPhanSo() {
        return phanTu != 0;
    }

}
