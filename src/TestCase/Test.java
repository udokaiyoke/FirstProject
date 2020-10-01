package TestCase;


import Intropackage.Home;
import Intropackage.StartPage;

public class Test {

    public static int age = 40;

    public static void main(String[] args) {

        //System.out.println(Home.street);
        Home house = new Home();
        System.out.println(house.address);
        System.out.println(Home.street);



        System.out.println(StartPage.departmentID);

    }
}
