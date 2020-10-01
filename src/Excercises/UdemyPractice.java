package Excercises;

import java.nio.file.Watchable;

public class UdemyPractice
{

    public static void main(String[] args)
    {
        String abc = new String();

        abc = "Hello";

        System.out.println(abc);
        //String Concatenation;
        String s1 = "Way";
        String s2 = "2";
        String s3 = "Automation";

        String s4 = s1+s2+s3;

        System.out.println(s4);
       //Integer Concatenation
        int num1 = 20;
        int num2 = 10;

        System.out.println(num1+num2);

        System.out.println(num1+num2+"after");


        System.out.println("before"+(num1+num2)+"after");

        System.out.println(!false);

    }
}
