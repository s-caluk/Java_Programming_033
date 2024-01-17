package m18_loops_part3;

public class Lab5 {
    public static void main(String[] args) {

        //bu kodlarin takibi nasil olur?

        int x = 3;
        int i = 0;

        while(i<3){
            x += 1;
            i += 1;
        }
        System.out.println(x); //? 6

        System.out.println("---------------------------------");

        int start = 1;
        int sum = 0;
        do {
            if (start % 2 == 0) {
                start++;
            }
            sum += start;
        } while (++start <= 10);

        System.out.println(sum);  //? 36

        System.out.println("-----------------------------------");

        int a = 20;
        while (a > 0) {
            do {
                a -= 2;
            } while (a > 5);
        }
        a--;
        System.out.println(a); //? -1

        System.out.println("-----------------------------------");

        int c = 0;
        boolean flag = true;
        for ( i = 0; i < 8; i++) {
            while (flag) {
                c++;
                if (i > c || c > 3) {
                    flag = false;
                }
            }
        }
        System.out.println(c);  //? 4

    }
}

