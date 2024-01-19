package m21_methods_part2;

public class ReturnOddOrEven {
    public static void main(String[] args) {

        String s1 = returnOddOrEven(100);
        System.out.println(s1);

        System.out.println(returnOddOrEven(101));
    }
    public static String returnOddOrEven(int number){
        if(number%2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }
}
