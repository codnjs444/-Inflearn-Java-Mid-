package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class QueueMain {
    public static void main(String[] args) {
        Deque<Integer> queque = new ArrayDeque<>();
        queque.offer(1);
        queque.offer(2);
        queque.offer(3);
        System.out.println("queque = " + queque);

        System.out.println("queque.peek() = " + queque.peek());

        System.out.println("queque.poll() = " + queque.poll());
        System.out.println("queque.poll() = " + queque.poll());
        System.out.println("queque.poll() = " + queque.poll());
        System.out.println("queque = " + queque);
    }
}
