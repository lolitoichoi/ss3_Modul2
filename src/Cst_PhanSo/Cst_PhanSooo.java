package Cst_PhanSo;

import PhanSooo.PhanSo;

public class Cst_PhanSooo {
    private int phanTu;
    private int phanMau;

    public Cst_PhanSooo() {
        phanTu = 0;
        phanMau = 1;
    }


    public Cst_PhanSooo(int phanTu) {
        this.phanTu = phanTu;
        phanMau = 1;
    }

    public Cst_PhanSooo(int phanTu, int phanMau) {
        this.phanTu = phanTu;
        this.phanMau = phanMau;
        rutGon();
    }

    public void rutGon() {
        int ucln = uocChungLonNhat(phanTu, phanMau);
        phanTu /= ucln;
        phanMau /= ucln;


        if (phanMau < 0) {
            phanTu = -phanTu;
            phanMau = -phanMau;
        }
    }

    public int uocChungLonNhat(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }
        a = Math.abs(a);

        for (int i = a; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    // phuong thuc xuat
    public void output() {
        if (phanMau == 0) {
            System.out.println(phanTu);
        } else {
            System.out.println(phanTu + "/" + phanMau);
        }
    }

    public void cong(int value) {
        phanTu += value * phanMau;
        rutGon();
    }

    // cop py
    public Cst_PhanSooo copy() {
        return new Cst_PhanSooo(phanTu, phanMau);
    }

}
