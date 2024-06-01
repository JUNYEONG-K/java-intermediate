package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
//        Deque<Integer> deque = new LinkedList<>();

        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        deque.offerLast(4);
        System.out.println(deque);

        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        deque.push(5);
        System.out.println(deque);
        System.out.println("deque.pop() = " + deque.pop());

        deque.offer(6);
        System.out.println(deque);
        System.out.println("deque.poll() = " + deque.poll());
    }
}
