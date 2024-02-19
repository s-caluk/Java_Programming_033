package m38_oop_part1_constructor;

public class InstanceBlock {
    public InstanceBlock(){
        System.out.println("No-Arg Constructor");
    }

    {
        System.out.println("Instance Block 1");
    }

    {
        System.out.println("Instance Block 2");
    }


    public static void main(String[] args) {

        InstanceBlock obj1 = new InstanceBlock();
        InstanceBlock obj2 = new InstanceBlock();


    }
}
