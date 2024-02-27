package m41_oop_part3_inheritance.inheritance_intro;

public class AnimalClients {
    public static void main(String[] args) {

        Dog dog = new Dog("Lucy", "Husky", "Female", 4, "Brown");
        // dog.name = "Lucy";     name private olunca hata veriyor!
        // dog.breed = "Husky";
        // dog.setName( "Lucy");  private olunca setter üzerinden atama yapabilirsin
        // dog.setBreed("Husky");

        Cat cat = new Cat("Max", "Stray", "Male", 3, "Black and White");
        //  cat.name = "Max";
        //  cat.breed = "Stray";
        // cat.setName("Max");
        //  cat.setBreed("Stray");


        System.out.println(dog);
        System.out.println(cat);

        dog.eat();
        dog.sleep();
        dog.bark();

        cat.eat();
        cat.sleep();
        //cat.bark();
        cat.scratch();

    }
}
