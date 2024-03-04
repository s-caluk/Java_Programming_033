package m46_error_exception_handling;

public class ThrowingException {
    public static void main(String[] args) {
        Person person = new Person();
        //person.setAge("");
        person.setAge(-10);

        System.out.println(person);
    }
}
