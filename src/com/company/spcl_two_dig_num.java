package com.company;
import java.util.*;
public class spcl_two_dig_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int n = sc.nextInt();
        int s=0,p=1;
        if(String.valueOf(n).length()==2)
        {
            for(int dup=n;dup>0;dup/=10)
            {
                s+=dup%10;
                p*=dup%10;
            }
            if((s+p)==n)
                System.out.println(n+" is a Special two-digit number.");
            else
                System.out.println(n+" is not a Special two-digit number.");
        }
        else
            System.out.println(n+" is not a two-digit number!!");
    }
}
