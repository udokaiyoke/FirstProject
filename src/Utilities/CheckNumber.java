package Utilities;

public class CheckNumber {

    public static boolean isNumber(String str) {
        try
        {
            double v = Double.parseDouble(str);
            return true;
        }
        catch (Exception nfe)
        {
            return false;
        }
    }
}
