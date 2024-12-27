package studen_manager;

import java.util.Scanner;

public class Les1 {
    private double phanTu;
    private double phanMau;

    public Les1() {
    }

    public Les1(double phanTu, double phanMau) {
        this.phanTu = phanTu;
        this.phanMau = phanMau;
    }
    // phuong thuc
    public void input() {
        Scanner in = new Scanner(System.in);

        System.out.println("moi ban nhap phan tu");
        phanTu = Double.parseDouble(in.nextLine());

        do {
            System.out.println("moi ban nhap phan mau");
            phanMau = Double.parseDouble(in.nextLine());
        } while (phanMau != 0);

    }

    public void setPhanMau(double phanMau) {
        if(phanMau == 0) {
            System.out.println("Khong hop le");
        } else{
            this.phanMau = phanMau;
        }
    }




    public double getPhanTu() {
        return phanTu;
    }

    public double getPhanMau() {
        return phanMau;
    }

    public void setPhanTu(double phanTu) {
        this.phanTu = phanTu;
    }




}
