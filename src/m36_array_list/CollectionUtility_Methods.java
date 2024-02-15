package m36_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5,2,8,1,10,8,8,8,8));
        System.out.println(numbers);                    //[5, 2, 8, 1, 10, 8, 8, 8, 8]


        // sort(list): Sorts the elements of the given list in natural order.
        Collections.sort(numbers);
        System.out.println(numbers);                     //[1, 2, 5, 8, 8, 8, 8, 8, 10]

        // binarySearch(list, element): Searches for the specified value in a sorted list in ascending order
        // using a binary search algorithm.
        int index = Collections.binarySearch(numbers, 5);
        System.out.println(index);                       //2


        // min(list): Returns the minimum element in the collection, according to the natural order.
        int min = Collections.min(numbers);
        System.out.println("min = " + min);              //min = 1


        // max(list): Returns the maximum element in the collection, according to the natural order.
        int max = Collections.max(numbers);
        System.out.println("max = " + max);              //max = 10


        // reverse(list): Reverses the order of elements in the list.
        Collections.reverse(numbers);
        System.out.println(numbers);                     //[10, 8, 8, 8, 8, 8, 5, 2, 1]


        // shuffle(list): Randomly shuffles (randomly reorder) the elements in the list.
        //Collections.shuffle(numbers);
        System.out.println(numbers);                   //listeyi rastgele düzenliyor


        // rotate(list, distance): Rotates the elements in the list by the specified distance.
        Collections.rotate(numbers, 4);  //saga dogru 4 eleman kaydirarak yazdiriyor
        System.out.println(numbers);             //[8, 5, 2, 1, 10, 8, 8, 8, 8]


        // replaceAll(list, oldValue, newValue): Replaces occurrences of oldValue with newValue in the list.
        Collections.replaceAll(numbers, 8, 100);
        System.out.println(numbers);             //[100, 5, 2, 1, 10, 100, 100, 100, 100]


        // frequency(list, element): Returns the frequency of occurrence of a value in the collection.
        int count = Collections.frequency(numbers, 100);
        System.out.println(count);               //5 defa 100 var


        // fill(list, element): Replaces all elements of the list with the specified value.
        Collections.fill(numbers, 10);
        System.out.println(numbers);             //[10, 10, 10, 10, 10, 10, 10, 10, 10]

    }
}
