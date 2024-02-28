package m44_oop_part5_polymorphism;

import m43_oop_part4_abstraction.Circle;
import m43_oop_part4_abstraction.Shape;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        //  Shape shape = (Shape) new Circle(3); // upcasting

        Shape shape = new Circle(5);             //upcasting

        System.out.println(shape.name);                //Circle
        System.out.println(shape.calculate_area());    //78.5398

        // System.out.println(shape.radius);          //circle nin variablesi radius

        // Circle circle = (Circle)shape;
        //  System.out.println(circle.radius);

        System.out.println(  ( (Circle)shape ).radius  );    // 5.0  downcasting

        // System.out.println( ( (Rectangle)shape ).width );


        Shape shape1 = new Circle(10);
        Shape shape2 = new Circle(10);

        System.out.println(shape1 == shape2);      //false

        System.out.println(shape1.equals(shape2)); //false

        Shape shape3 = new Circle(20);

        System.out.println(shape3.equals(shape1) );  //False

    }
}
