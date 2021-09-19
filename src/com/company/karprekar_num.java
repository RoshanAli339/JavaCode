package com.company;
import java.util.*;
public class karprekar_num {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int a2 = (int)Math.pow(a,2), l=String.valueOf(a2).length();
        int f=0;
        if(l%2==0)
        {
            int a3=a2%((int)Math.pow(10,l/2));
            int a4=a2/((int)Math.pow(10,l/2));
            f=a3+a4;
        }
        else
        {
            int a3=a2%((int)Math.pow(10,(l+1)/2));
            int a4=a2/((int)Math.pow(10,(l+1)/2));
            f=a3+a4;
        }

        if(f==a)
            System.out.println(a+" is a Karprekar number.");
        else
            System.out.println(a+" is not a Karprekar number.");
    }
}
