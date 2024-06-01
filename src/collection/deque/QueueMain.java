package collection.deque;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        // LinkedList 는 List 와 Deque 를 모두 구현한다. 하지만 ArrayDeque 가 훨씬 빠르다 ㅎㅎ
//        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println(queue);
    }
}
