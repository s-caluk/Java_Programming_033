package m16_loops_part1;

public class Lab5 {
    public static void main(String[] args) {

        int i = 0 ;
        for ( i = 0; i <= 2; i++) {

        }
        System.out.println(i); //3!
        //----------------------------------------
        for (int j = 0; j < 10; j++){
            j++;
            System.out.print(j + " ");  //1 3 5 7 9
            System.out.println("Hello World");
        }

        //------------------------------------------
        int k = 0;
        int m = 0;

        for(int z=0; z<=3; z++){
            k++;
            if(z==2){
                z=4;
            }
            m++;
        }
        System.out.println(k + "," + m); // 3,3

        //---------------------------------------------

         int summ = 0;
         int jj = 5;
         int ii;

         for (ii = 0; ii < 10 && jj > 0 ; ii++ , jj--){
             if(ii % 3 == 0 || jj % 5 == 0 ){
                 summ = summ + ii + jj;
             }
         }
        System.out.println(summ+",\t" + ii+",\t" + jj);  //10,	5,	0

    }
}
