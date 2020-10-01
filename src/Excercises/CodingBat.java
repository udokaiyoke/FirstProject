package Excercises;

public class CodingBat {

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile)
    {
        return aSmile == bSmile;
    }

    /*Given two int values, return their sum. Unless the two values are the same, then return double their sum.*/
    public static int sumDouble (int a, int b)
    {
        return  (a==b)? 2*(a+b): a+b;
    }

    public static void main(String[] args) {

        System.out.println(sumDouble(1,2));
        System.out.println(sumDouble(5,9));
        System.out.println(sumDouble(4,4));
        System.out.println(sumDouble(3,2));
        

//        System.out.println(monkeyTrouble(true,true));
//        System.out.println(monkeyTrouble(false,false));
//        System.out.println(monkeyTrouble(false,true));
//        System.out.println(monkeyTrouble(true,false));
    }
}
