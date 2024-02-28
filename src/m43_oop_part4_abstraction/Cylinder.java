package m43_oop_part4_abstraction;

public class Cylinder extends Shape implements Volume{
    @Override
    public double calculate_area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
