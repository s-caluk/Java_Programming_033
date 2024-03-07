package m47_collections_part1;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();

        queue.add("apple");
        queue.offer("banana");

        queue.offer("strawberry");
        queue.offer("cherry");

        queue.offer("lemon");
        queue.add("apple");

        System.out.println(queue); //[apple, banana, apple, cherry, lemon, strawberry]

        queue.remove(); // FIFO
        queue.poll(); // FIFO

        System.out.println(queue);  //[banana, cherry, strawberry, lemon]

        String element =queue.peek();
        System.out.println(element); //banana

        System.out.println(queue);   //[banana, cherry, strawberry, lemon] degismedi

        queue.remove("lemon");

        System.out.println(queue);   //[banana, cherry, strawberry]

        queue.add(null);

        System.out.println(queue);

    }
}
