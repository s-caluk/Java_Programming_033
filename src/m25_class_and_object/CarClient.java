package m25_class_and_object;

public class CarClient {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.make = "Toyata";
        car1.model = "Corolla";
        car1.year = 2023;
        car1.color ="Black";
        car1.price = 30_000;
        car1.start();
        car1.drive();
        car1.stop();
        car1.showCurrentSpeed(85,70);
        System.out.println(car1);

        Car car2 = new Car();
        System.out.println(car2);



    }
}
/*
Create a car object and assign the below values to the instance variables and call the below methods:

        Make: Toyota
        Model: Corolla
        year: 2023
        color: Black
        price: $30_000

        start()
        drive()
        stop()
        showCurrentSpeed(65, 70)
 */