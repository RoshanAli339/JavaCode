package com.company;
import java.util.*;
public class armstrong_num {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int s=0;
        for(int dup=n;dup>0;dup/=10)
        {
            s=s+(int)(Math.pow(dup%10,3));
        }
        if(s==n)
            System.out.println(n+" is an Armstrong number.");
        else
            System.out.println(n+" is not an Armstrong number.");
    }
}
