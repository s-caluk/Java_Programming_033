package m12_operators_part2;

public class UnaryOperatorPractices {
    public static void main(String[] args) {
        int x = 2;
        int y = x++;
        System.out.println(y);  //y=2  x=3

        System.out.println(x++); //3  x=4

        System.out.println(--x); //3 x=3

        int z = 8;
        y = z-- ;
        System.out.println(y);   //y=8 z=7
        System.out.println(y--); //8 y=7
        System.out.println(--z); //6

        int a=50;
        a = --a + a++ + a-- + a++;
        System.out.println(a);   //197

        int b = 4;
        int c = --b * 4 - b++;
        System.out.println(c);  //9
        System.out.println(b);  //4

    }
}
