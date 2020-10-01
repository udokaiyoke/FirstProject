package Excercises;

import javax.swing.*;

public class CalculatingAreaPerimterofRectangle
{
    public static void main(String[] args)
    {

        try
        {
            String stringLengthRectangle = JOptionPane.showInputDialog("Enter the Length of the Rectangle");
            double lengthRectangle = Double.parseDouble(stringLengthRectangle);
            String stringBreadthRectangle = JOptionPane.showInputDialog("Enter the Breadth of the Rectangle");
            double breadthRectangle = Double.parseDouble(stringBreadthRectangle);
            double area = lengthRectangle * breadthRectangle;
            double perimeter = 2* (lengthRectangle + breadthRectangle);
            String op = "The Area of the Rectangle is " + area;
            String op2 = "\nThe Perimeter of the Rectangle is " + perimeter;
            JOptionPane.showMessageDialog(null, op + op2);
        }
        catch (Exception io)
        {
            System.out.println("Invalid Principal / Interest / time was entered");
            System.exit(1);
        }

    }
}

