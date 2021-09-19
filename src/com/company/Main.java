package com.company;
import java.util.*;
public class Main {

    boolean triplet(int a, int b, int c)
    {
        if((a*a)==((b*b)+(c*c)))
            return true;
        else
            return false;
    }
    public static void main(String args[]) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Main ob = new Main();
        System.out.print("Enter 3 numbers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(ob.triplet(a,b,c)||ob.triplet(b,c,a)||ob.triplet(c,a,b))
            System.out.println(a+" ,"+b+", "+" and "+c+" form a pythagoras triplet");
        else
            System.out.println(a+" ,"+b+", "+" and "+c+" do not form a pythagoras triplet");
    }
}
