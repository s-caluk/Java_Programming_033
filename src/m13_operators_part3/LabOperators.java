package m13_operators_part3;

public class LabOperators {
    public static void main(String[] args) {
        int b = 2;
        boolean result = (++b == 2 || b == 2) && --b == 2;
        System.out.println("result = " + result);
        System.out.println("b = " + b);  //b neden 3 ? en son 2 (--b) oldugunda b hic calistirilmadigi icin 3 oluyormus

        System.out.println("====== eligible for Work ===============");

        int age = 42;
        boolean isEligible = age >= 18 && age <= 65;
        System.out.println("Am i eligible to work? " + isEligible);

        System.out.println("======= FruitCount ======================= ");

        int appleCount = 5;
        int orangeCount = 2;
        int strawberryCount = 1;

        boolean result2 = appleCount < orangeCount || orangeCount >= strawberryCount;
        System.out.println(result2);

        System.out.println("======= Eligible to Drive ======================= ");

        double yas = 20.0;

        boolean hasLearningPermit = true;
        boolean hasDriverLicense = false;

        boolean result3 = (yas >= 18 && hasDriverLicense) || (yas >= 15.5 && hasLearningPermit);
        System.out.println("Is Mike eligible to drive? " + result3);

        System.out.println("======= Leap Year ======================= ");

        int year = 2000;

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("Is " + year + "a leap year ? " + isLeapYear);

        

    }
}
