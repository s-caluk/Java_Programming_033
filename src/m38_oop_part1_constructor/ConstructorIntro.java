package m38_oop_part1_constructor;

public class ConstructorIntro {

    public ConstructorIntro(){
        System.out.println("Object is created by using no-arg constructor");
    }

    public ConstructorIntro(int a){
        System.out.println("Object is created by suing the parameterized constructor");
    }
    public static void main(String[] args) {

        ConstructorIntro obj = new ConstructorIntro();

        ConstructorIntro obj2 = new ConstructorIntro(10);


    }
}
