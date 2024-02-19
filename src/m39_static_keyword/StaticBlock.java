package m39_static_keyword;

public class StaticBlock {
    public static int num = 1000;

    static{
        num = 100;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {

        System.out.println(num);  //100
    }
}
