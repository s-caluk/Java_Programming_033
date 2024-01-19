package m21_methods_part2;

public class EmpoyeeInfo {
    public static void main(String[] args) {

        displayEmployeeInfo( "Josh", 29, "New York");

        System.out.println("------------------------------------");

        String name= "Isabella";
        int age=26;
        String city= "Los Angles";
        displayEmployeeInfo(name, age, city);
    }

    public static void displayEmployeeInfo(String name, int age, String city) {
        System.out.println("Employee name is " + name);
        System.out.println(name + " is " + age + " years old ");
        System.out.println(name+ " is from " + city);
    }
}
