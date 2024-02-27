package m42_access_modifiers_final_object_class.final_keyword;

public class Animal { //public final class Animal, olursa inherit olamaz

    public String name;
    public final String breed;
    public final String gender;
    public int age;
    public final static String PLANET;

    static{
        PLANET = "Earth";
    }

    public Animal(String name, String breed, String gender, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public final String toString() {          //final yazdigi icin overridden yapilamaz
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public final void drink(){
        System.out.println(name + " is drinking water");
    }
}
