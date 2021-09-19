package com.company;
import java.util.*;
public class evil_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int d= Integer.parseInt(Integer.toBinaryString(n));
        int c=0;
        for(int dup=d;dup>0;dup/=10)
        {
            if(dup%10==1)
                c++;
        }
        if(c%2==0)
            System.out.println(n+" is an Evil number.");
        else
            System.out.println(n+" is not an Evil number");
    }
}
