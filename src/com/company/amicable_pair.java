package com.company;
import java.util.*;
public class amicable_pair {
    int sum_fact(int n)
    {
        int s=0;
        for(int i=1;i<n;i++) {
            if (n % i == 0)
                s = s + i;
        }
        return s;
    }

    public static void main(String args[])
    {
        amicable_pair ob = new amicable_pair();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a pair of numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((ob.sum_fact(a)==b)||(ob.sum_fact(b))==a)
            System.out.println(a+" and "+b+" are an Amicable pair");
        else
            System.out.println(a+" and "+b+" are not an Amicable pair");
    }
}
