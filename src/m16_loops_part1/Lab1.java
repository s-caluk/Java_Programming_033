package m16_loops_part1;

public class Lab1 {
    public static void main(String[] args) {
        //in the same line with a space between the numbers
        //Output: 2 4 6 8 10
        for (int i = 2; i <= 10 ; i += 2) {
            System.out.print( i + " ");
        }

        //2nd solution
        System.out.println();
        for (int i = 1; i <=10 ; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        //Output: 1-3-5-7-9-11-13-15-17-19
        System.out.println();
        for (int i = 1; i <=19 ; i +=2) {
            System.out.print(i + "-");
        }
        //2nd solution
        System.out.println();
        System.out.print(1);
        for (int i = 3; i <=19 ; i++) {
            if(i % 2 == 1){
                System.out.print("-" + i  );
            }
        }


    }
}
