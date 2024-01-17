package m18_loops_part3;

public class Lab3 {
    public static void main(String[] args) {
        //debugging yaparak kodu takip et. continue da kod atlayip diger döngüye geciyor. break da döngüden cikiyor

        int number = 0;
        while(number < 15){
            number++;
            if(number <= 5){
                System.out.println("Skipping number "+ number);
                continue;
            }
            System.out.println("Number = "+ number);

            if(number >= 10){
                System.out.println("Breaking at "+ number);
                break;
            }
        }
    }
}
