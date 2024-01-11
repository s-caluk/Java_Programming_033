package m13_operators_part3;

/**
 *  && Logical and operator; kisa devreler icin yani ilk false buldugunda gerisine bakmiyor sonuc false.
 *  & Bitweise and operator; her ikisine bakip sonucu veriyor
 */
public class AND_Operator {
    public static void main(String[] args) {
        int a = 100;

        System.out.println(  (a > 0) & (a < 200) );
        //                    true  &  true  ===> true

        System.out.println( (a == 200) & (a > 50)  );
        //                  false  &  true  ====> false


        System.out.println( (a < 1000) && (a > -100) );
        //                   true   &&     true    ====> true

        System.out.println( (a < 0)  &&  (a > 20) );
        //                   false  &&  --    ====> false

    }
}
