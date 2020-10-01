package DataTypes;

public class DeclaringPrimitiveVariables {

    public static void main(String[] args) {

        //Create a byte variable
        byte byteVariable = 115;
        //byte byteVariable2 = -129;  byte can only store numbers from -128 to 127

        // create a short variable
        short shortVariable = 20000;
        //short shortVariable2 = 33000; short can only store numbers from -32768 to 32767


        // create an int variable
        int intVariable = 1000000;
        //int intVariable2 = 3000000000; int can only store numbers from -2147483648 to 2147483647

        // create a long variable
        long longVariable = 9223372036854775807l;
        //long longVariable2 = 3000000000; long only stores from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        float var1 = 100.50f;
        System.out.println(var1);

        char charVariable = 'w';

        char c1 = 100;
        System.out.println(c1);

        char c2 = 228;
        System.out.println(c2);
    }
}
