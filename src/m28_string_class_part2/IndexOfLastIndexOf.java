package m28_string_class_part2;

public class IndexOfLastIndexOf {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        int indexOfFirsta = str.indexOf("a");
        System.out.println("index Of First a = " + indexOfFirsta);

        int indexOfSeconda = str.indexOf("a Programming");
        System.out.println("index Of Second a = " + indexOfSeconda);

        int indexOfThirda = str.indexOf("a", 5);    //5.indexden itibaren ara
        System.out.println("index Of Third a = " + indexOfThirda);

        int indexOfFourtha = str.indexOf("a", indexOfThirda + 1);
        System.out.println("index Of Fourth a = " + indexOfFourtha);

        int indexOfLasta = str.lastIndexOf("a");
        System.out.println("index Of Last a = " + indexOfLasta);



    }
}
