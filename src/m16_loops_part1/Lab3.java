package m16_loops_part1;

public class Lab3 {
    public static void main(String[] args) {
        //Print the square of numbers which start from 1 and ends at 10 as below:
        // num  | num^2
        // -------------
        // 1    | 1
        // 2    | 4
        // 3    | 9 ...
        // 10   | 100

        System.out.println("num\t|\tnum^2");
        System.out.println("----------------");

        for (int number = 1; number <= 10; number++) {
            System.out.println(number + "  " +"|  " + (number * number));
        }

        System.out.println("----------------------------------");
        //Print KPH and MPH conversion table, 1 mile = 0,62 * km , 20-140 km (KPH to MPH)

        int kph = 0;
        double mph = 0.0;
        System.out.println("kph\t|\tmph");
        System.out.println("----------------");
        for (int i = 20; i <= 140 ; i += 10) {
            kph = i;
            mph = kph * 0.62;
            System.out.println(kph +"\t|\t" + mph );
        }

    }
}
