package m14_selection_statements_part1;

public class Grading {
    public static void main(String[] args) {

        int score = 155;
        String result;

        if( score >= 0 && score <= 100){ // if the score is valid

            if(score >= 90){
                result = "Passed with distinction";
            }else if(score >= 60){
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else{
            result = "Invalid Score";
        }

        System.out.println(result);

    }

}

/*
Write a program using nested if evaluates the given score .
    If a score is less than 60, then print “Fail”
    If a score is greater or equal to 60, but less than 90, then print “Pass”
    If a score is greater or equal to 90, then print “Passed with Distinction”
    If a score is not between 0 and 100, then print “Invalid score”

    Example-1:
        Input:   75
        Output:  Pass

    Example-2:
        Input:   90
        Output:  Passed with Distinction
 */

