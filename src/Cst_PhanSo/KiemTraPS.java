package Cst_PhanSo;

import PhanSooo.PhanSo;

public class KiemTraPS {
    public static void main(String[] args) {

        Cst_PhanSooo ps = new Cst_PhanSooo();
        ps.output();

        Cst_PhanSooo ps1 = new Cst_PhanSooo(1, 2);
        ps1.output();

        Cst_PhanSooo ps2 = new Cst_PhanSooo(3);
        ps2.output();

        Cst_PhanSooo ps3 = new Cst_PhanSooo(-6,-2);
        ps3.output();

        Cst_PhanSooo ps4 = new Cst_PhanSooo(3,-1);
        ps4.output();

        Cst_PhanSooo ps5 = ps4.copy();
        ps5.cong(100);
        ps4.output();
        ps5.output();
    }
}
