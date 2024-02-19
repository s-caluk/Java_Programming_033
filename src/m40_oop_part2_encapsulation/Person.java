package m40_oop_part2_encapsulation;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Person {

    public String name;
    public int age;

    public String getName(){
        if(name==null){
            System.err.println("Name can not be null");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name){
        if(name==null || name.isBlank() || name.isEmpty()){
            System.out.println("Invalid input "+ name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Age can not be negative: " + age);
            System.exit(1);
        }
        this.age = age;
    }

}

