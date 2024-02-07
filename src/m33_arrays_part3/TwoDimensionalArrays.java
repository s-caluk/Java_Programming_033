package m33_arrays_part3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70};
        int[] arr3 = {80, 90};

        int[][] numbers = new int[3][]; //colon belirsiz birakti, degisebilir diye.
        numbers[0] = arr1;
        numbers[1] = arr2;
        numbers[2] = arr3;

        //System.out.println(Arrays.toString(numbers));       //[[I@e9e54c2, [I@65ab7765, [I@1b28cdfa]

        System.out.println(Arrays.deepToString(numbers));   //[[10, 20, 30], [40, 50, 60, 70], [80, 90]]

        System.out.println(Arrays.toString(numbers[1]));    //[40, 50, 60, 70]

        System.out.println(numbers[1][2]); //60
        System.out.println(numbers[2][0]); // 80

        System.out.println("--------------------------------------");

        //index:               0                  1                2
        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}};
        // elements:        0   1   2      0   1   2   3   4     0   1

        System.out.println(arr2D.length);                //3

        System.out.println(Arrays.deepToString(arr2D));  //[[10, 20, 30], [40, 50, 60, 70, 80], [90, 100]]

        System.out.println(Arrays.toString(arr2D[1]));   //[40, 50, 60, 70, 80]

        System.out.println(arr2D[1][2]);                  //60

        arr2D[0][2] = 3000;
        arr2D[2][0] = 9000;

        System.out.println(Arrays.deepToString(arr2D)); //[[10, 20, 3000], [40, 50, 60, 70, 80], [9000, 100]]


    }
}
