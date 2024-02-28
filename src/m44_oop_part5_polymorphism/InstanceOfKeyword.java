package m44_oop_part5_polymorphism;
import m43_oop_part4_abstraction.*;
public class InstanceOfKeyword { //...´nin örnegi mi? true/false
    public static void main(String[] args) {
        Shape shape1 = new Circle(4);
        Shape shape2 = new Rectangle(3, 4);
        Shape shape3 = new Cube(5);

        boolean r1 = shape1 instanceof Circle;  //true

        System.out.println(r1);

        boolean r2 = shape1 instanceof Rectangle;  //false

        System.out.println(r2);

        boolean r3 = shape2 instanceof Rectangle; //true

        System.out.println(r3);

        System.out.println("---------------------------------");

        Shape[] shapes = {
                new Rectangle(3, 4), new Cylinder(), new Cube(4), new Circle(3),
                new Rectangle(7, 8), new Circle(5), new Cube(2), new Circle(10),
                new Circle(10), new Circle(10)
        };

        int count = 0;

        for (Shape each : shapes) {
            if (each instanceof Circle){
                count++;
            }
        }

        System.out.println(count); //5


    }
}
