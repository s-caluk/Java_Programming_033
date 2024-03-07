package m47_collections_part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayListPractice {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll( Arrays.asList(
                "apple", "orange", "banana", "apple", null, "grape", "banana", null, "apple", "grape", "banana"
        ));

        removeDuplicates(list);

        System.out.println("list = " + list);


        /*
        List<String> uniqueList = new ArrayList<>();

        for (String each : list) {
            if(uniqueList.contains(each)){
                continue;
            }
            uniqueList.add(each);
        }

        System.out.println("uniqueList = " + uniqueList);
         */

    }


    public static void removeDuplicates(List<String> list){

        List<String> uniqueList = new ArrayList<>();

        for (String each : list) {
            if(uniqueList.contains(each)){
                continue;
            }
            uniqueList.add(each);
        }

        list.clear();
        list.addAll(uniqueList);

    }

}
