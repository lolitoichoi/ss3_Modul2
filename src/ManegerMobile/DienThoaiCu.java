package ManegerMobile;

public class DienThoaiCu extends Mobile{

    private int tinhTrangPin;


    public DienThoaiCu() {
        super();
    }

    public DienThoaiCu(int id, String tenDienThoai, double giaBan, String hangSX, int thoiGianBaoHanh, int tinhTrangPin) {
        super(id, tenDienThoai, giaBan, hangSX, thoiGianBaoHanh);
        this.tinhTrangPin = tinhTrangPin;
    }


}
