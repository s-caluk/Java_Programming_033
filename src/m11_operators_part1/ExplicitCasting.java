package m11_operators_part1;

public class ExplicitCasting {
    public static void main(String[] args) {

        double num1 = 100.5789;

        short num2 = (short)num1;  // sayiyi shorta cevir ata

        System.out.println("num1 = " + num1);  //100.5789
        System.out.println("num2 = " + num2);  //100

        int num3 = 500;

        byte num4 = (byte) num3;

        System.out.println("num3 = " + num3);  //500
        System.out.println("num4 = " + num4);  //-12

    }
}
