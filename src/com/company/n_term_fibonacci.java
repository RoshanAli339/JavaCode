package com.company;

import java.util.Scanner;

public class n_term_fibonacci {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of term to print: ");
        int n = sc.nextInt();
        int a=0,b=1,c=0;
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("The "+n+"th term of the Fibonacci series is: "+b);
    }
}
