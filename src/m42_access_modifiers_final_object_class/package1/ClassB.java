package m42_access_modifiers_final_object_class.package1;

public class ClassB {
    public static void main(String[] args) { //ayni packagede iken access modifier

        System.out.println(ClassA.a);
        System.out.println(ClassA.b);
        System.out.println(ClassA.c);
        // System.out.println(ClassA.d); // private
    }
}
