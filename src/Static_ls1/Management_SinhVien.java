package Static_ls1;

public class Management_SinhVien {
    public static void main(String[] args) {

        SinhVien sv1 = new SinhVien(101011, "tuan",9.5);
        SinhVien sv2 = new SinhVien(101012, "anh",9.2);
        SinhVien sv3 = new SinhVien(101013, "thinh",5.5);

        System.out.println("tong thong tin sinh vien: " + SinhVien.demSoLuongSinhVien());
    }
}
