package m38_oop_part1_constructor;

public class StudentClients {
    public static void main(String[] args) {
        /*
        Student student1 = new Student();

        System.out.println(student1); //ConstructorIntro obj2 = new ConstructorIntro(10);
        System.out.println(student1.name); //null

        student1.name = "James";
        student1.age = 19;

        System.out.println(student1.name); //James
        System.out.println(student1.age);  //19

         */

        Student student1 = new Student("James", 19);
        System.out.println(student1.name);
        System.out.println(student1.age);

        Student student2 = new Student();
        System.out.println(student2);

        Student student3 = new Student("Hazel");
        System.out.println(student3);

        Student student4 = new Student("Brenna", 28, "Female", 3.5);
        System.out.println(student4);


    }
}
