import javax.swing.*;
import java.util.Random;

public class Utility
{

    public static String phoneNumberCleaner(String uncleanPhone)
    {
        String newPhoneNumber = uncleanPhone.replaceAll("([()\\s-.+!@#$%^&*])", "");
        newPhoneNumber = newPhoneNumber.replaceAll("^(1)", "");
        newPhoneNumber = newPhoneNumber.replaceAll("[Xx]", "P");

        return  newPhoneNumber;
    }

    public static void phoneNumberCleaner(String[] uncleanPhones)
    {
        for (int i = 0; i < uncleanPhones.length; i++)
        {
             uncleanPhones[i] = phoneNumberCleaner(uncleanPhones[i]);
        }

    }

        public static String sayHello()
    {
        return "Hello!";

    }

    public static int createRandomInt(Random randomObject)
    {
        int somenumber = randomObject.nextInt();

        return somenumber;

    }


    public static void displaySomethingInJO()
    {
        JOptionPane.showMessageDialog(null, sayHello());
    }

    public static void displaySomethingInJO(String saySomething)
    {
        JOptionPane.showMessageDialog(null, saySomething);
    }


}
