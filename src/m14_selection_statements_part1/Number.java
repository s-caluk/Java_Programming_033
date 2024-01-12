package m14_selection_statements_part1;

public class Number {
    public static void main(String[] args) {
        int number = 100;

        /*
        if(number > 0){
            System.out.println("Pozitive");
        }
        if(number < 0){
            System.out.println("Negative");
        }
        if(number == 0){
            System.out.println("zero");
        }

         */

        if(number > 0){
            System.out.println("pozitiv");
        } else if (number < 0) {
            System.out.println("negativ");
        }else{
            System.out.println("zero");
        }
    }
}
