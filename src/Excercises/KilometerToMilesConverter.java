package Excercises;

import Utilities.CheckNumber;

import javax.swing.*;

public class KilometerToMilesConverter {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the value of Kilometer");
        boolean isValidNumber = CheckNumber.isNumber(input);
        if(!isValidNumber)
        {
            System.out.println("Invalid Number entered");
            System.exit(1);
        }
        else
        {
            double kilometer = Double.parseDouble(input);
            double miles = kilometer / 1.609;
            String displayMessage = kilometer + " kilometers is " + miles + " miles";
            JOptionPane.showMessageDialog(null, displayMessage);
            System.exit(0);
        }
    }
}
