package com.company;
import java.util.*;
public class palindrome_num {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int dup=n,s=0;
        while(dup>0)
        {
            s=s*10+(dup%10);
            dup/=10;
        }
        if(s==n)
            System.out.println(n+" is a Palindrome number.");
        else
            System.out.println(n+" is not a Palindrome number");
    }
}
