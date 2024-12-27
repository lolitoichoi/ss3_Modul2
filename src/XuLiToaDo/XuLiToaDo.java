package XuLiToaDo;

public class XuLiToaDo {
    public static void main(String[] args) {
        ToaDo toaDo1 = new ToaDo();
        ToaDo toaDo2 = new ToaDo();

        System.out.println("Nhap toa do diem thu nhat");
        toaDo1.input();

        System.out.println("Nhap toa do diem thu hai");
        toaDo2.input();

        double khoangCachHaiDiem = toaDo1.khoangCach(toaDo2);
        System.out.println("Khoang cach giưữa hai điểm là : " + khoangCachHaiDiem);

    }
}
