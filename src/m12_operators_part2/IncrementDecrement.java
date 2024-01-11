package m12_operators_part2;

public class IncrementDecrement {
    public static void main(String[] args) {
        // pre-increment & decrement:
        int x = 5;

        int y = ++x; // y = 6

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int a = 10;

        int b = --a; // b = 9

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //post increment & decrement:
        int m = 5;

        int n = m++; // n = 5, m ==> 6

        System.out.println("m = " + m);
        System.out.println("n = " + n);

        int r = 10;

        int t = r--; // t = 10, r ==> 9

        System.out.println("r = " + r);
        System.out.println("t = " + t);

    }
}
