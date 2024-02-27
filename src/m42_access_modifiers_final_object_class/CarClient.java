package m42_access_modifiers_final_object_class;

public class CarClient {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car);
        // car.finalize();
        car.equals(car);
        // car.clone();
        car = null;
    }
}
