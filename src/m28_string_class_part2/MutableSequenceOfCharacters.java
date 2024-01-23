package m28_string_class_part2;

public class MutableSequenceOfCharacters {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Java");
        stringBuilder.append(" Programming");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        String result = stringBuilder.toString();
        System.out.println(result);                //gnimmargorP avaJ

        //------------------------------------

        StringBuffer stringBuffer = new StringBuffer("Java");
        stringBuffer.append(" Programming");
        stringBuffer.reverse();
        String result2 = stringBuffer.toString();   //gnimmargorP avaJ
        System.out.println(result2);


    }
}
