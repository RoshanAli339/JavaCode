package com.company;
import java.util.*;
public class harshad_num {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int s=0;
        if(n>0)
        {
            for(int dup=n;dup>0;dup/=10)
                s=s+(dup%10);
            if(n%s==0)
                System.out.println(n+" is a Harshad number.");
            else
                System.out.println(n+" is not a HArshad Number.");
        }
        else
            System.out.println(n+" is not a Harshad number.");
    }
}
