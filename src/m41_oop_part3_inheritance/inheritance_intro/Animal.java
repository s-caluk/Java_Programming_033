package m41_oop_part3_inheritance.inheritance_intro;

public class Animal {//encapsulation!
    private String name, breed, gender;
    private int age;
    private String color;

    public Animal(String name, String breed, String gender, int age, String color) {
        setName(name);     //bu alan artik this. seklinde degil, setter üzerinden atama yapiliyor
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setColor(color);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

}
