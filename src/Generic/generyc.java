package Generic;

import java.util.ArrayList;
import java.util.List;

public class generyc {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(10);
        list.add("10");

        int dem = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                dem += (Integer)list.get(i);
            } else if (list.get(i) instanceof String) {
                dem += (Integer)list.get(i);
            }
        }
    }
}
