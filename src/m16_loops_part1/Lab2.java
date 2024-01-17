package m16_loops_part1;

public class Lab2 {
    public static void main(String[] args) {
        // calculate the sum of even and odd numbers between 1 and 10 (exclusive)
        // then print the result as below
        // 1-3-5-7-9--> 0+1=1 / 1+3=4 / 4+5=9 /9+7=16 / 16+9=25 gibi  --> (nextOddNumber)
        // 2-4-6-8-10--> 0+2=2 /2+4=6 /6+6=12 /12+8=20 /20+10=30      --> (nextEvenNumber)

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <= 10 ; i += 2) {
            sumEven += i;
        }
        for (int i = 1; i < 10; i +=2) {
            sumOdd += i;

        }
        System.out.println("sum of even number " + sumEven);
        System.out.println("sum of odd number " + sumOdd);

        //2nd solution
        System.out.println("---------------------");

        int sumEven2 = 0;
        int sumOdd2 = 0;

        for (int i = 0; i <= 10 ; i ++) {

            if(i % 2 == 0){
                sumEven2 += i;
            }else{
                sumOdd2 += i;
            }
        }
        System.out.println("sum of even number " + sumEven2);
        System.out.println("sum of odd number " + sumOdd2);


    }
}
