package com.company;
import java.util.*;
public class spl_num {

    public static void main(String args[])
    {
        spl_num ob = new spl_num();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int a=0;
        for(int dup=n;dup>0;dup/=10)
            a=a+(ob.fact(dup%10));
        if(a==n)
            System.out.println(n+" is a Special number.");
        else
            System.out.println(n+" is not a Special number.");
    }

    int fact(int n)
    {
        if(n==1)
            return 1;
        else
            return (n*fact(n-1));
    }
}
