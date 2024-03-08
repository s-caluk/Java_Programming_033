package m48_collections_part2;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll( Arrays.asList(
                "apple", "orange", "banana", "apple", null, "grape", "banana", null, "apple", "grape", "banana"
        ));

        System.out.println(list);

        // Set<String> set = new HashSet<>(); // Random order
        Set<String> set = new LinkedHashSet<>(); // Insertion order
        set.addAll( Arrays.asList(
                "apple", "orange", "banana", "apple", null, "grape", "banana", null, "apple", "grape", "banana"
        ));

        System.out.println(set);


        Set<String> treeset = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        treeset.addAll(Arrays.asList(
                "Zack", "Yulia", "Anna", "Jake", "Breanna", "Emily", "ali", "daniel", "ahmed", "ben"
        ));

        System.out.println(treeset);
    }
}
