package m25_class_and_object;

public class DogClient {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Debbie";
        dog1.breed = "Husky";
        dog1.age = 2;
        dog1.color = "Brown";
        System.out.println("Name: " + dog1.name);
        System.out.println("Breed: " + dog1.breed);
        System.out.println("Age: " + dog1.age);
        System.out.println("Color: " + dog1.color);
        dog1.bark();
        dog1.eat();
        dog1.sleep();

        System.out.println(dog1);  //return degeri yazdiriyor

        System.out.println("---------------------");

        Dog dog2 = new Dog();

        dog2.name = "Lessy";
        dog2.age = 1;
        dog2.breed = "Corgi";
        dog2.color = "Red";
        System.out.println(dog2);  //return

        dog2.bark();
        dog2.eat();
        dog2.sleep();

        System.out.println("---------------------");
        Dog dog3 = new Dog();
        System.out.println(dog3); //verilmemisse default degerleri yazdirir


    }
}
