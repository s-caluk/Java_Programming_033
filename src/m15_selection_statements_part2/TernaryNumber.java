package m15_selection_statements_part2;

public class TernaryNumber {
    public static void main(String[] args) {
        int num = 3;

        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero"; // burada if , if else var.

        System.out.println( "Number is " +result);
    }
}
