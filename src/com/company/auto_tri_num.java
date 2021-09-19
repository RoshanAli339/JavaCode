package com.company;
import java.util.*;
public class auto_tri_num {

    boolean automorhpic(int a)
    {
        int l=String.valueOf(a).length();
        int a2= (int)Math.pow(a,2);
        if((a2%((int)Math.pow(10,l)))==a)
            return true;
        else
            return false;
    }

    boolean trimorphic(int a)
    {
        int l=String.valueOf(a).length();
        int a2= (int)Math.pow(a,3);
        if((a2%((int)Math.pow(10,l)))==a)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        auto_tri_num ob = new auto_tri_num();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(ob.automorhpic(a))
            System.out.println(a+" is an Automorphic number");
        else if (ob.trimorphic(a))
            System.out.println(a+" is a Trimorphic number");
        else
            System.out.println(a+" is neither and Automorphic nor a Trimorphic number");
    }
}
