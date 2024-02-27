package m41_oop_part3_inheritance.method_overriding;

public class EmployeeClients {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Yulia", 35, 90_000);
        Driver driver = new Driver("Jake", 40, 80_000);

        System.out.println(teacher);
        System.out.println(driver);

        teacher.work();
        driver.work();

        Developer developer = new Developer("Hazel", 28, 110_000);
        System.out.println(developer);
        developer.work();

    }
}
