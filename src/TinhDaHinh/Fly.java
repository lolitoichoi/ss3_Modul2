package TinhDaHinh;

import org.w3c.dom.ls.LSOutput;

public interface Fly {
    int MAX = 100;
    void fly();

    default void fly2() {
        System.out.println("Co body - default");
    }

    static void fly3() {
        System.out.println("Co body - static");
    }

}
