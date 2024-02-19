package m38_oop_part1_constructor;

public class InstanceInitializationBlock {
    public String name;
    public int age;

    {
        name = "Unknown";
        age = 10;
    }

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {

        /*
        InstanceInitializationBlock obj = new InstanceInitializationBlock();

        System.out.println(obj.name);   //Unknown
        System.out.println(obj.age);    //10

         */

        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("James", 65);

        System.out.println(obj2.name);    //James
        System.out.println(obj2.age);     //65

    }
}
