package com.company;
import java.io.*;

public class InterestCalculator {
    public static void main(String[] args) throws IOException {
        Float principalAmount  = new Float(0);
        Float rateOfInterest = new Float(0);
        int numberOfYears = 0;

        DataInputStream in = new DataInputStream(System.in);

        String tempString;
        System.out.print("Enter principal amount: ");
        System.out.flush();
        tempString = in.readLine();
        principalAmount = Float.valueOf(tempString);

        System.out.print("Enter rate of interest: ");
        System.out.flush();
        tempString = in.readLine();
        rateOfInterest = Float.valueOf(tempString);

        System.out.print("Enter number of years: ");
        System.out.flush();
        tempString = in.readLine();
        numberOfYears = Integer.parseInt(tempString);

        float interestTotal = principalAmount * rateOfInterest * numberOfYears;
        System.out.println("Total interest= "+ interestTotal);

    }
}
