package m44_oop_part5_polymorphism;

import m43_oop_part4_abstraction.*;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Shape circle = new Circle(3.5);
        Shape rectangle = new Rectangle(4,5);
        Shape cube = new Cube(7);

        Volume obj = new Cube(9);


        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(cube);
        System.out.println(obj);

        //   System.out.println(circle.radius);
        //   System.out.println(rectangle.width);  bu verileri cagiramaz cünkü aramaya shape den basliyor.
        //  System.out.println(rectangle.length);

        displayAreaOfShape(circle);
        displayAreaOfShape(rectangle);
        displayAreaOfShape(cube);

        System.out.println("------------------------");
        Shape[] shapes = {new Circle(10), new Rectangle(20,30), new Cube(40)};

        for (Shape each : shapes) {
            //System.out.println(each);
            displayAreaOfShape(each);

        }


    }

    public static void displayAreaOfShape(Shape shape) {
        System.out.println("The area of " + shape.name + " is " + shape.calculate_area());
    }


}
