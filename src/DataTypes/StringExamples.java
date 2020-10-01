package DataTypes;

public class StringExamples {
    public static void main(String[] args) {

        String s1 = "Udoka";
        String s2 = "Udoka";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        s1 = "Udoka Jeremiah";
        System.out.println(s2);

        System.out.println(s1.hashCode());
    }
}
