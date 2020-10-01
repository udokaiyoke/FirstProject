package Excercises;


import Utilities.CheckNumber;

import javax.swing.*;
import java.util.Scanner;

public class CalculateSimpleInterest {

    public static void main(String[] args)
    {
         try
         {
             String stringPrincipalAmount = JOptionPane.showInputDialog("Enter the Principal Amount");
             double pAmt = Double.parseDouble(stringPrincipalAmount);
             String stringRateOfInterest = JOptionPane.showInputDialog("Enter the Rate of Interest");
             double roInterest = Double.parseDouble(stringRateOfInterest);
             String stringTime = JOptionPane.showInputDialog("Enter the Time Duration");
             int time = Integer.parseInt(stringTime);
             double simpleInterest = (pAmt * roInterest * time ) / 100;
             String op = "For Principal Amount: " + pAmt + " with Rate of Interest: " + roInterest  + " and time duration: " + time;
             String op2 = ", the simple interest is: " + simpleInterest;
             JOptionPane.showMessageDialog(null, op + op2);
         }
         catch (Exception io)
         {
             System.out.println("Invalid Principal / Interest / time was entered");
             System.exit(1);
         }

    }





}
