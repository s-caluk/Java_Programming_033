package m32_arrays_part2;

public class FindMaximumNumber {
    public static void main(String[] args) {

        int[] x = {10, 2, 3, 40, 20};

        System.out.println(maxValue(x));

        int[] y = {6, 8, 3, 5, 1, 9};

        System.out.println(maxValue(y));
        
    }
    
    public static int maxValue(int[] numbers){
        if(numbers == null || numbers.length == 0){
            System.out.println("Array is empty");
            return 0;
        }

        int max = numbers[0];
        for (int number : numbers) {
            if(number > max){
                max = number;
            }
        }
        return max;
    }
}
