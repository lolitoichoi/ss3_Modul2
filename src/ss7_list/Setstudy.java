package ss7_list;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setstudy {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("Tuan", 12,5.2));
        set.add(new Student("Tuan", 12,5.2));
        set.add(new Student("Mai", 13,6.2));
        set.add(new Student("Mai", 13,6.2));

        System.out.println(set.size());
    }
}
