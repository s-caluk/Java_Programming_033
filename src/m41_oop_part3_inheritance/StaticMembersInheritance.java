package m41_oop_part3_inheritance;
/*
static metodlar ayni isimde ise , childdeki method parenttekini gizler=Method hiding
 */

class ClassA{

    public static int a = 100;

    public static void method(){
        System.out.println("Parent class' static method");
    }
}
class ClassB extends ClassA{

    //@Override  hata verir. staticler overridden olmaz
    public static void method(){
        System.out.println("Child class' static method");
    }

}

public class StaticMembersInheritance {
    public static void main(String[] args) {

        System.out.println(ClassA.a);
        System.out.println(ClassB.a);

        ClassA.method();
        ClassB.method(); //parentteki static metodu gizler = Method hiding

    }
}
