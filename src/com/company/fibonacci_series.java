package com.company;
import java.util.*;
public class fibonacci_series {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a+" "+b+" ");
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
