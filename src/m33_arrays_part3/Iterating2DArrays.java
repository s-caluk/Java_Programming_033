package m33_arrays_part3;


import java.util.Arrays;

public class Iterating2DArrays {
    public static void main(String[] args) {

        //index:               0                  1                2
        int[][] arr2D = { {10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100, 110, 120} };
        // elements:       0   1   2      0   1   2   3   4     0   1    2    3



        for (int i = 0; i < arr2D.length; i++) { // i: 0, 1, 2

            int[] each1DArray = arr2D[i];

            System.out.println(Arrays.toString(each1DArray));

            for (int j = 0; j < each1DArray.length; j++) {
                System.out.println(each1DArray[j]);
            }
        }

        System.out.println("--------------------------------------------------------");

        for (int[] each1DArray : arr2D) {

            System.out.println(Arrays.toString(each1DArray));

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }

        }

        System.out.println("--------------------------------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.println(arr2D[i][j]);
            }
        }

        System.out.println("--------------------------------------------------------");

        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }


    }
}
