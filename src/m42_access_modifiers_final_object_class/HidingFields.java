package m42_access_modifiers_final_object_class;

class Parent{

    public static int a = 100;
    public int b = 200;

    public static void staticMethod(){
        System.out.println("Parent class' static method");
    }

}

class Child extends Parent{

    public static int a = 1000;
    public int b = 2000;

    public static void staticMethod(){
        System.out.println("Child class' static method");
    }

}

public class HidingFields {
    public static void main(String[] args) {

        Parent.staticMethod();
        Child.staticMethod();

        System.out.println(Parent.a);
        System.out.println(Child.a);

        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(parent.b);
        System.out.println(child.b);


    }
}
