package m25_class_and_object;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public String color;

    public void bark(){
        System.out.println(name + " is barking");
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

}
