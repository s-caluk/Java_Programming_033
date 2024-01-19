package m21_methods_part2;

public class ParametersArgumentsIntro {
    public static void main(String[] args) {
        eligibleToVote(15);
    }

    public static void eligibleToVote(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

    }

    public static class SumOfThreeNumbers {
        public static void main(String[] args) {
            int a = 10;
            byte b = 20;
            short c = 30;

            int x = 10;
            byte y = 20;
            short z = 30;

            sumOf3Numbers(x, (int) y, (int) z); //explicit casting


        }
        public static void sumOf3Numbers(int num1, int num2, int num3){
            System.out.println("Sum: " + (num1+num2+num3));
        }
    }
}
