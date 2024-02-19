package m40_oop_part2_encapsulation;

public class PersonClient {
    public static void main(String[] args) {
        Person person1 = new Person();

        //person1.name = "James";
        //System.out.println(person1.name);


        //person1.setName(null);
        person1.setName("James");
        System.out.println(person1.getName());

        //person1.setAge(-10);
        person1.setAge(10);
        System.out.println(person1.getAge());

    }
}
