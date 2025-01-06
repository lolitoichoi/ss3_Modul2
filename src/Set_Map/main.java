package Set_Map;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(40);

        for(Integer item : integerSet) {
            System.out.println(item);
        }
        System.out.println(integerSet);


    }
}
