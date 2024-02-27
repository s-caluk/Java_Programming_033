package m41_oop_part3_inheritance.super_keyword;

public class Student extends Person {

    public String schoolName;
    public String studentId;

    public Student(){
        super("Unknown", 16, "Male");
    }

    public Student(String name, int age, String gender, String schoolName, String studentId) {
        super(name, age, gender);
        this.schoolName = schoolName;
        this.studentId = studentId;
        // this.eat();
        //   super.eat();
        //   System.out.println( super.age );
        //    System.out.println( this.age);
        //  System.out.println( super.isHuman );

    }

}
