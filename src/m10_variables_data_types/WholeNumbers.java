package m10_variables_data_types;

/**
 * primitiv: byte,int,short,long,float,double,char,boolean
 * non-primitiv:String,Array,Classes,Interfaces
 */
public class WholeNumbers {
    public static void main(String[] args) {
        // DataType variableName = Data/Value;

        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;  //sona L, F gelebilir

        System.out.println(maxByte);
        System.out.println(maxShort);
        System.out.println(maxInt);
        System.out.println(maxLong);

    }
}
