package m43_oop_part4_abstraction;

public class Rectangle extends Shape{
    public double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculate_area() {
        return width*length;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calculate_area() +
                '}';
    }
}
