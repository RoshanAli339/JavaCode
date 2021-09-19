package com.company;
import java.util.*;
public class removing_zeroes {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =sc.nextInt(),dup=n, s=0,f=0;
        for(;dup>0;dup/=10)
        {
            if((dup%10)!=0)
                s=s*10+(dup%10);

        }
        while(s>0)
        {
            f=f*10+(s%10);
            s/=10;
        }
        System.out.println("Given number: "+n);
        System.out.println("Removing zeroes: "+f);
    }
}
