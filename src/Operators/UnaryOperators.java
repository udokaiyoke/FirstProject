package Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        // ++ --> increment Operator
        // it increases the value of the operand by 1
        // pre-increment / post-increment

        int x = 1;
        System.out.println(++x);

        int y = 1;
        System.out.println(y++);
        System.out.println(y);

        int w = 10;
        System.out.println(++w);
        System.out.println(++w);
        System.out.println(w++);
        System.out.println(w);
        System.out.println(w++);

        System.out.println(--w);
        System.out.println(--w);
        System.out.println(w--);
        System.out.println(w);
        System.out.println(w--);

        boolean isColorRed = true;
        System.out.println(isColorRed);
        System.out.println(!isColorRed);
    }
}
