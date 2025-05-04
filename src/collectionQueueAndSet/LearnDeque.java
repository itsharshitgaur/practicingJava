package collectionQueueAndSet;

import java.util.ArrayDeque;

public class LearnDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offerLast(20);
        dq.offerFirst(30);

        System.out.println(dq);

        System.out.println(dq.poll());
        System.out.println(dq.pollLast());

        System.out.println(dq);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
