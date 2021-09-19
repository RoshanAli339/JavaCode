package com.company;
import java.util.*;
public class disarium_num {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int l= String.valueOf(n).length();
        int f=0,dup=n;
        for(int i=l;i>0;i--)
        {
            f=f+(int)(Math.pow((dup%10),i));
            dup/=10;
        }
        if(f==n)
            System.out.println(n+" is a Disarium number");
        else
            System.out.println(n+" is not a Disarium number");
    }
}
