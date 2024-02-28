package m43_oop_part4_abstraction;

public interface InterfaceMethods {
    int VAR = 100;  //default olarak final ve statictir

    void abstractMethod();

    static void staticMethod(){
        System.out.println(VAR);   //static oldugu icin static method kabul eder
        //VAR = 200;               //final oldugu icin degistirilemez
        System.out.println("Static Method");
    }

    default void defaultMethod(){
        System.out.println("Default Method");
    }

    private static void privateMethod(){
        System.out.println("Private Method");
    }
}
