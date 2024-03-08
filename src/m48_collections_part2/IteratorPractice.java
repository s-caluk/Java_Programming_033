package m48_collections_part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(
                1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 9, 3, 8, 7, 1, 2, 6, 5, 8, 9
        ));

        System.out.println(numbers);

        /*
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) < 5){
                numbers.remove(i);
            }
        }

         */

        // numbers.removeIf(p -> p < 5);

        Iterator<Integer> it = numbers.iterator();

        while(it.hasNext()){
            if(it.next() < 5){
                it.remove();
            }
        }

        System.out.println(numbers);



    }
}
