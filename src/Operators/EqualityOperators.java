package Operators;

public class EqualityOperators {
    public static void main(String[] args) {

        String s1 = "Udoka";
        String s2 = "Udoka";
        String s3 = new String("Udoka");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}

