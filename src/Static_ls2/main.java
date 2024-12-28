package Static_ls2;

public class main {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;

        double tong = MathUtil.add(a, b);
        double hieu = MathUtil.subtract(a, b);
        double tich = MathUtil.multiply(a, b);
        double thuong = MathUtil.divide(a, b);

        System.out.println("tong 2 so la: " + tong);
        System.out.println("hieu 2 so la: " + hieu);
        System.out.println("tich 2 so la: " + tich);
        System.out.println("thuong 2 so la: " + thuong);
    }

}
