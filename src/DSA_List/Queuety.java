package DSA_List;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queuety {
//    public static void main(String[] args) {
//        Stack stack = new Stack();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//
//        System.out.println(stack.pop());
//    }


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
