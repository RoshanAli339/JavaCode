package com.company;
import java.util.*;
public class hetermetric {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =sc.nextInt();
        int f =(int)Math.sqrt(n);
        if(f*(f+1)==n)
            System.out.println(n+" is a Heteromecic number");
        else
            System.out.println(n+" is not a Heteromecic number");
    }
}
