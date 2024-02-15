package m36_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Methods {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        // addAll(Collection):
        // Adds all the elements in the specified Collection to the target Collection.

        list.addAll( Arrays.asList("Java", "Python", "C#", "Ruby", "Java", "Python", "C#", "C++", "Ruby") );
        System.out.println(list);     //[Java, Python, C#, Ruby, Java, Python, C#, C++, Ruby]


        // containsAll(Collection):
        // Returns true if the target Collection contains all the elements in the specified Collection

        boolean result = list.containsAll( Arrays.asList( "Java", "Python", "C#", "SWIFT" )  );
        System.out.println(result);    //false  hepsini liste iceriyor mu ?


        //removeAll(Collection):
        //Removes from the target Collection all of its elements that are also contained in the specified Collection.
        System.out.println(list);
        list.removeAll( Arrays.asList("Ruby", "C++") );
        System.out.println(list);      //[Java, Python, C#, Java, Python, C#]


        //retainAll(Collection):
        //Removes from the target Collection all its elements that are NOT also contained in the specified Collection.
        list.retainAll( Arrays.asList("Java", "Python") );  //harici olanlari sil
        System.out.println(list);      //[Java, Python, Java, Python]


        //clear(): Removes all elements from the Collection.
        list.clear();
        System.out.println(list);      //[]

    }
}
