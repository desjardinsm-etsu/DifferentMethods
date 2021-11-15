import jdk.jshell.execution.Util;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

	    String[] phoneNumbers = {"(423) 555 5555", "+14235555555", "423.555.5555", "(423)555-5555x1555", "+1-(423)555-5555x1555"};

	    String[] newNumbers = new String[phoneNumbers.length];

        for (int i = 0; i < phoneNumbers.length; i++)
        {
            newNumbers[i] = phoneNumbers[i];
        }

       Utility.phoneNumberCleaner(phoneNumbers);

        for (String num: phoneNumbers)
        {
            System.out.println(num);
        }

        for (String num: newNumbers)
        {
            System.out.println(num);
        }
        //System.out.println(Utility.sayHello());
        //Utility.displaySomethingInJO();
        //Utility.displaySomethingInJO("It will say whatever I put here!");

        //System.out.println(Utility.createRandomInt(new Random()));

        //Scanner kb = new Scanner(System.in);

        //String userInputPhoneNumber = kb.nextLine();
        //System.out.println(Utility.phoneNumberCleaner(userInputPhoneNumber));


        //Decoding Exercise
	    String encodedMessage = "r slkv mlylwb wvxlwvh gsrh nvhhztv"; //i hope nobody decodes this message


        //do the letters appear 1 or evenly
	    String characterCounterExample1 = "abcabc"; //true
        String characterCounterExample2 = "abcabcd"; //false
        String characterCounterExample3 = "123abc!"; //true

        //rule is if a 9 exists between two 7's the 7's eat the 9
        int sevenAteNineExample1 = 79712312; //7712312
        int sevenAteNineExample2 = 79797; //777
        int sevenAteNineExample3 = 79579795; // 7957795




    }




}
