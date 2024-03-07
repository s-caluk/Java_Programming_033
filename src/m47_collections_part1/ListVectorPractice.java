package m47_collections_part1;

import java.util.Arrays;
import java.util.Vector;

public class ListVectorPractice {

    public static void main(String[] args) {

        Vector<String> list = new Vector<>();

        list.addAll(Arrays.asList(
                "apple", "orange", "banana", "apple", null, "grape", "banana", null, "apple", "grape", "banana"
        ));

        System.out.println(list);
        System.out.println(list.get(1));
        list.add("Strawberry");
        System.out.println(list);


    }
}
