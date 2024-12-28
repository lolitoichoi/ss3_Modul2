package Cst_Time;

public class TimeF {
    private int gio;
    private int phut;
    private int giay;

    public TimeF() {
        gio = 0;
        phut = 0;
        giay = 0;
    }

    public TimeF(int gio) {
        this.gio = gio;
        phut = 0;
        giay = 0;
    }

    public TimeF(int gio, int phut) {
        this.gio = gio;
        this.phut = phut;
        giay = 0;
    }

    public TimeF(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public TimeF(TimeF other) {
        this.gio = other.gio;
        this.phut = other.phut;
        this.giay = other.giay;
    }

    public void output() {
        System.out.printf("%02d:%02d:%02d\n", gio, phut, giay);
    }
}
