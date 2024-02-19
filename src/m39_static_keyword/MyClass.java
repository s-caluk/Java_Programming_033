package m39_static_keyword;

public class MyClass {

    public static int staticVar;
    public int instanceVar;

    public static void main(String[] args) {
        System.out.println(staticVar);
        //System.out.println(instanceVar); //non-static variable instanceVar, static bir metod icinden cagrilamaz.
    }

    public void instanceMethod(){          //instanceMEthodlar static olan ve olmayan variableleri cagirabilir.
        System.out.println(instanceVar);
        System.out.println(staticVar);
    }


}
