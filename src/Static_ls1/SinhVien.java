package Static_ls1;

public class SinhVien {
    private int maSinhVien;
    private String name;
    private Double diem;
    private static int demSinhVien;

    public SinhVien(int maSinhVien, String name, Double diem) {
        this.maSinhVien = maSinhVien;
        this.name = name;
        this.diem = diem;
        demSinhVien++;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public String getName() {
        return name;
    }

    public Double getDiem() {
        return diem;
    }

    public static int getDemSinhVien() {
        return demSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public static void setDemSinhVien(int demSinhVien) {
        SinhVien.demSinhVien = demSinhVien;
    }

    public static int demSoLuongSinhVien() {
        return demSinhVien;
    }
}
