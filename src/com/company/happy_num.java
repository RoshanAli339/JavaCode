package com.company;
import java.util.*;
public class happy_num {

    int sum_sq_digs(int n)
    {
        int s=0;
        while(n>0)
        {
            s+=(n%10)*(n%10);
            n/=10;
        }
        if(String.valueOf(s).length()==1)
            return s;
        else
            return sum_sq_digs(s);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        happy_num ob = new happy_num();
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int f = ob.sum_sq_digs(n);
        if(f==1)
            System.out.println(n+" is a Happy number");
        else
            System.out.println(n+" is not a Happy number.");
    }
}

