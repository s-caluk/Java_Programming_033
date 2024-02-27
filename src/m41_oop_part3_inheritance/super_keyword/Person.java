package m41_oop_part3_inheritance.super_keyword;

public class Person {
    public String name;
    public int age;
    public String gender;
    public static boolean isHuman;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void eat(){
        System.out.println(name + " is eating");
    }


}

