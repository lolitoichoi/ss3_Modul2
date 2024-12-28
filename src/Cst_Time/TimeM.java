package Cst_Time;

public class TimeM {
    public static void main(String[] args) {
        TimeF timeF = new TimeF();
        timeF.output();

        TimeF timeF2 = new TimeF(7);
        timeF2.output();

        TimeF timeF3 = new TimeF(7,33);
        timeF3.output();

        TimeF timeF4 = new TimeF(7,33, 58);
        timeF4.output();

        TimeF timeF5 = new TimeF(timeF4);
        timeF5.output();
    }
}
