package m18_loops_part3;

public class Lab2 {
    public static void main(String[] args) {

    /*
    FINRA Pattern yaziyoruz , do while ile,
    3e bölünüyorsa FIN, 5 e bölünüyorsa RA, ikisine bölünüyorsa FINRA yazilacak
    Example input: 20
    Output:1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA
     */

    int n = 20;
    int number = 1;

        do {

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.print("FINRA");
            } else if (number % 3 == 0) {
                System.out.print("FIN");
            } else if (number % 5 == 0) {
                System.out.print("RA");
            } else {
                System.out.print(number + " ");
            }
            number++;
        }while (number <= n);
    }
}