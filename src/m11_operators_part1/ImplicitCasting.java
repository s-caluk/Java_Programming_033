package m11_operators_part1;

public class ImplicitCasting {
    public static void main(String[] args) {

        byte num1 = 25;  // byte degeri inte atacak
        int num2 = num1; // implicit casting

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        double num3;
        int num4 = 10;

        num3 = num4; // 10.0

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

    }
}
