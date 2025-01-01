package TinhDaHinh;

import java.util.ArrayList;

public class Main  extends Animal{
    public static void main(String[] args) {
//        Animal a = new Cat();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());



        for (Animal a : animals) {
            if(a instanceof Dog){
                ((Dog)a).tiengKeu();
            } else if(a instanceof Cat){
                ((Cat)a).tiengKeu();
            }
            a.tiengKeu();
        }
    }
}
