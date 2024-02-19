package m39_static_keyword;

import static java.lang.Math.PI;
import static java.lang.Math.max;
import static java.lang.Math.pow;
//import static java.lang.Math.* bunu da kullanabilirsin.
public class StaticImport {
    public static void main(String[] args) {
        int n1 = 5, n2 = 20;
        int n3 = max(n1,n2);

        System.out.println(n3);

        double r=3.5;
        double area = pow(r,2) * PI;

        System.out.println(area);



    }
}
