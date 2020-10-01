package Operators;

public class BinaryOperators {
    public static void main(String[] args) {
        // + --> addition/concatenation
        //- --> subtraction
        //* --> multiplication
        // / --> quotient
        // & --> remainder

        int a = 10;
        double b = 2;

        System.out.println( a/b);

        a = 13;


        System.out.println(a/b);
        System.out.println( a%b);
        byte k = 100;
        k = (byte) (k + 10);

        int y = 50;
        int z = 50;
        y = y + 40;
        z += 40;

        System.out.println(y);
        System.out.println(z);

        int p = 100;
        int l = 60;

        p += 40;
        l += 80;

        System.out.println(p);
        System.out.println(l);

        int n = 40;
        n -= 39;

        int j = 80;
        j /= 4;
        System.out.println(j);

        int i = 20;
        i %= 3;

        System.out.println(i);
        System.out.println(n);

        int u = 12;

        u *= 2;

        System.out.println(u);

        long longnumber = 2000l;
        float floatnumber = 25.2f;

        longnumber = (long) (longnumber + floatnumber);

        floatnumber = floatnumber + longnumber;

        System.out.println(longnumber);
        System.out.println(floatnumber);

        short shortNumber = 5;
        char charCharacter = 'a';

        shortNumber += charCharacter;

        System.out.println(shortNumber);

    }
}
