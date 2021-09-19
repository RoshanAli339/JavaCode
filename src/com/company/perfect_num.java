package com.company;
import java.util.*;
public class perfect_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
            System.out.println(n+" is a Perfect number.");
        else
            System.out.println(n+" is not a perfect number.");
    }
}
