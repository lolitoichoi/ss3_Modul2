package TinhDaHinh;

import java.util.Scanner;

public class Cat  extends Animal implements Fly {
    public void tiengKeu() {
        System.out.println("Meo meo");
    }

    public void batChuot() {
        System.out.println("Meo bat chuot");
    }

    @Override
    public void fly() {
        System.out.println("Meo fly");
    }
}
