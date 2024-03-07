package m47_collections_part1;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequePractice {
    public static void main(String[] args) {

        Deque<String> queue = new ArrayDeque<>();

        queue.add("apple");
        queue.add("banana");

        queue.offer("strawberry");
        queue.offer("cherry");

        queue.offer("lemon");

        System.out.println(queue);  //[apple, banana, strawberry, cherry, lemon]

        System.out.println(queue.peekFirst());  //apple
        System.out.println(queue.peekLast());  //lemon

        queue.offerFirst("egg");
        queue.offerLast("pumpkin");

        System.out.println(queue);    //[egg, apple, banana, strawberry, cherry, lemon, pumpkin]

        queue.pollFirst(); //FIFO
        queue.pollLast(); //LIFO

        System.out.println(queue);  //[apple, banana, strawberry, cherry, lemon]

    }


}
