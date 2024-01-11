package m10_variables_data_types;

public class CharVariable {
    public static void main(String[] args) {
        char ch1 = 'a';
        System.out.println(ch1);

        char ch2 = 97;
        System.out.println(ch2);

        char ch3 = 0x61;
        System.out.println(ch3);

        char ch4 = 45000;
        System.out.println(ch4);

        System.out.println("------------------------------");

        char x = 64;           //decimal @
        char y = 0X40;         //hexadecimal @
        char z = '@';          //single character
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
