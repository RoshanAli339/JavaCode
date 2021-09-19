package com.company;
import java.util.*;
public class tribonacci_series {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of terms: ");
        int n = sc.nextInt();
        int a=0,b=0,c=1,d=0;
        System.out.print(a+" "+b+" "+c+" ");
        for(int i=4;i<=n;i++)
        {
            d=a+b+c;
            System.out.print(d+" ");
            a=b;
            b=c;
            c=d;
        }
    }
}
