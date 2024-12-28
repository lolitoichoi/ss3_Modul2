package KeThua;

public class Teacher extends Person {
    private double slary;

    public Teacher() {
        super();
    }

    public Teacher(int id, String name, double slary) {
        super(id, name);
        this.slary = slary;
    }
}
