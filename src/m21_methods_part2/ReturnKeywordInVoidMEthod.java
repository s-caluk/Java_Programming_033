package m21_methods_part2;

public class ReturnKeywordInVoidMEthod {
    public static void main(String[] args) {
        eligibleToVote(178);

    }

    public static void eligibleToVote(int age) {

        if (age < 0 || age > 150) {
            System.err.println("Invalid age: " + age);
            return; //exit the method
        }
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are NOT eligible to vote");
        }
    }
}
