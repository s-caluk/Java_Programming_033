package m48_collections_part2;

import java.util.*;

public class ListSetQueue {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll( Arrays.asList(
                "apple", "orange", "banana", "apple",  "grape", "banana",  "apple", "grape", "banana"
        ));

        System.out.println(list);

        System.out.println("For Loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Fo Each Loop");
        for (String each : list) {
            System.out.println(each);
        }

        System.out.println("-------------------------------------------------");

        Set<String> set = new HashSet<>();
        set.addAll( Arrays.asList(
                "apple", "orange", "banana", "apple",  "grape", "banana",  "apple", "grape", "banana"
        ));

        System.out.println(set);

        for (String each : set) {
            System.out.println(each);
        }

        System.out.println("-------------------------------------------------");

        Queue<String> queue = new PriorityQueue<>();
        queue.addAll( Arrays.asList(
                "apple", "orange", "banana", "apple",  "grape", "banana",  "apple", "grape", "banana"
        ));

        System.out.println(queue);

        for (String each : queue) {
            System.out.println(each);
        }

        System.out.println("-------");

        while (!queue.isEmpty()){
            System.out.println( queue.poll());
        }

        System.out.println(queue);

        System.out.println("-------------------------------------------------");

        List<String> result = new ArrayList<>(set);

        System.out.println(result);
        System.out.println(result.get(2));

    }
}
