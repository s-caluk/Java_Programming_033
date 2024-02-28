package m43_oop_part4_abstraction;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculate_area(){
        return radius*radius*Math.PI;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + calculate_area() +
        '}';
    }
}
