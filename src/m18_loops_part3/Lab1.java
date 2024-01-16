package m18_loops_part3;

public class Lap1 {
    public static void main(String[] args) {
        //----for Loop--------------------------
        int sumEven = 0 ;
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                sumEven += i;
            }
        }
        System.out.println("sumEven : " + sumEven);

        //-----While Loop-------------------------

        int i = 0;
        int sumEven2 = 0;
        while(i<10){
            if(i%2==0){
                sumEven2 += i;
            }
            i++;
        }
        System.out.println("sumEven2 : " + sumEven2);





    }
}
