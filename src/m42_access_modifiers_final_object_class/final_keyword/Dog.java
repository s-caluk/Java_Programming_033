package m42_access_modifiers_final_object_class.final_keyword;

public class Dog extends Animal{
    public Dog(String name, String breed, String gender, int age) {
        super(name, breed, gender, age);
    }

   /* //final yazdigi icin methodda overriden edilemez
    @Override
    public void drink() {
        super.drink();
    }

    */
}
