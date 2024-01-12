package m14_selection_statements_part1;

public class Lab2 {
    public static void main(String[] args) {

        //write a program that returns the greatest of given two numbers
        int num1 = 3;
        int num2 = 2;

        if(num1 > num2){
            System.out.println("num1 is greater than num2");
        }else if(num2 > num1){
            System.out.println("num2 is greater than num1");
        }else{
            System.out.println("the number are equal");
        }

        /* Write a program that calculates the avarage of math, chemistry and biology scores,
        and prints the grade table ; 0-59 F / 60-69 D / 70-79 C / 80-89 B / 90-100 A
         */

        double math = 60.0;
        double chemistry = 80.0;
        double biology = 70.0;

        double average = (math + chemistry + biology) / 3;

        if(average >= 90 && average <=100){
            System.out.println("Average is = " + average);
            System.out.println("Grade is A");
        }else if(average >= 80 && average <=90){
            System.out.println("Average is = " + average);
            System.out.println("Grade is B");
        } else if(average >= 70 && average <=80){
            System.out.println("Average is = " + average);
            System.out.println("Grade is C");
        }else if(average >= 60 && average <= 70){
            System.out.println("Average is = " + average);
            System.out.println("Grade is D");
        }else if(average >= 0 && average <= 60){
            System.out.println("Average is = " + average);
            System.out.println("Grade is F");
        }else{
            System.out.println("Invalid Average");
        }
    }
}
