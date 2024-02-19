package m39_static_keyword;

public class Circle {
    public double radius;
    public static final double PI = 3.14;

    public Circle(double radius){
        this.radius=radius;
    }

    public double area(){
        return radius*radius*PI;
    }

    public double perimeter(){
        return  2*radius*PI;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

}
