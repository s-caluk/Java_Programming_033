package m42_access_modifiers_final_object_class.final_keyword;

public class AnimalClients  {
    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", "Male", 4);

        System.out.println(dog);

        // dog.breed = "Corgi";
        // dog.gender = "Female";
        // Dog.PLANET = "Moon";

        dog.drink();


    }
}
