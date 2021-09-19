package com.company;
import java.util.*;
public class sum_n_num {
    static int sum=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =sc.nextInt();
        int result = sum(n);
        System.out.println("The sum of first "+n+" natural numbers is: "+result);
    }

    static int sum(int n)
    {
        if(n==0)
            return sum;
        else
        {
            sum+=n;
            n-=1;
            return sum(n);
        }
    }
}
