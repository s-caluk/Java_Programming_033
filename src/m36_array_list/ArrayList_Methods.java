package m36_array_list;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> groceriesList = new ArrayList<>();

        System.out.println(groceriesList);                    //[]

        // add(object): appends the specific element to the end of a list.
        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking Oil");

        System.out.println(groceriesList);                    //[Eggs, Paper Towels, Apples, Cooking Oil]


        // add(index, object): inserts the specific element at a specific position index in the list.
        groceriesList.add(2, "Chicken");
        System.out.println(groceriesList);                     //[Eggs, Paper Towels, Chicken, Apples, Cooking Oil]


        // size(): Returns the number of elements in list.
        System.out.println(groceriesList.size());              //5  length veriyor, index degil


        // get(index): Returns the element at the given index.
        String firstElement = groceriesList.get(0);
        System.out.println("firstElement = " + firstElement);   //firstElement = Eggs
        String lastElement = groceriesList.get( groceriesList.size() -1 );
        System.out.println("lastElement = " + lastElement);     //lastElement = Cooking Oil


        // set(index, object): Replaces the element at the given index with the given element.
        groceriesList.set(2, "Oranges");
        System.out.println(groceriesList);                     //[Eggs, Paper Towels, Oranges, Apples, Cooking Oil]


        // remove(int): Removes/Returns value at given index.
        groceriesList.remove(1);
        System.out.println(groceriesList);                     //[Eggs, Oranges, Apples, Cooking Oil]


        // remove(Object): Removes the first occurrence of the specified element from this list, if it is present.
        groceriesList.remove("Eggs");
        System.out.println(groceriesList);                     //[Oranges, Apples, Cooking Oil]


        // indexOf(object): Returns the index the first occurrence of a specific element.
        System.out.println( groceriesList.indexOf("Oranges") );  //0


        // lastIndexOf(object): Returns the index in this list of the last occurrence of the specified element.
        System.out.println( groceriesList.indexOf("Apples"));   //1
        groceriesList.add("Apples");
        System.out.println(groceriesList);                             //[Oranges, Apples, Cooking Oil, Apples]
        System.out.println( groceriesList.lastIndexOf("Apples"));   //3


        // contains(object): Returns true if this list contains the specified element.
        System.out.println( groceriesList.contains("Cooking Oil") );  //true
        System.out.println(groceriesList.contains("Milk"));           //false


        // isEmpty(): Returns true if this list contains no elements.
        System.out.println( groceriesList.isEmpty() );                //false


        // clear(): Removes all elements of the list.
        // groceriesList.clear();
        System.out.println(groceriesList);                           //[Oranges, Apples, Cooking Oil, Apples]
        System.out.println(groceriesList.isEmpty());                 //False


        // removeIf(Predicate): It is used to remove all the elements from the list that satisfies the given predicate.

        System.out.println(groceriesList);                       //[Oranges, Apples, Cooking Oil, Apples]
        groceriesList.removeIf( p -> p.startsWith("A") );
        System.out.println(groceriesList);                       //[Oranges, Cooking Oil]

    }
}
