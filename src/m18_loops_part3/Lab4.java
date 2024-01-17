package m18_loops_part3;

public class Lab4 {
    public static void main(String[] args) {
    //debugging ile takibini yap

        int counter = 0;

        outher:
        for (int i = 0; i <= 10 ; i++) {
            inner:
            for (int j = 4; j >=0 ; j--) {

                if(i==j){
                    break outher;
                }else {
                    counter++;
                    break inner;
                }

            }

        }
        System.out.println(counter);
    }
}
