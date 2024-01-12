package m15_selection_statements_part2;

public class TernaryVote {
    public static void main(String[] args) {
        int age = 28;

        String result = (age >= 18) ? "you are eligible to vote" : "you are not eligible to vote";

        System.out.println(result);

    }
}
