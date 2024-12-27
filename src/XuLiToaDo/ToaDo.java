package XuLiToaDo;

import java.util.Scanner;

public class ToaDo {
    private double x;
    private double y;

    void input() {
        Scanner in = new Scanner(System.in);

        System.out.println("Moi ban nhap toa do x: ");
        x = in.nextDouble();

        System.out.println("Moi ban nhap toa do y: ");
        y = in.nextDouble();

        // tinh khoang cach giua 2 diem
    }

    public double khoangCach(ToaDo other) {
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }
}
