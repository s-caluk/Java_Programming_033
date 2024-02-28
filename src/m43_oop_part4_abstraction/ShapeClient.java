package m43_oop_part4_abstraction;

public class ShapeClient {
    public static void main(String[] args) {

       // Shape shape = new Shape();

        Circle circle = new Circle(5);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(7, 8);
        System.out.println(rectangle);

    }
}
