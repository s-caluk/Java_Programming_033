package m39_static_keyword;

public class StaticOrder {
    static int x=5;        //1.

    static{
        x += 10;           //2.
    }
    static {
        x/=3;              //3.
    }

    public static void main(String[] args) {
        System.out.println("x = "+ x);   //5
    }
}
