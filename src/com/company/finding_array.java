package com.company;
import java.util.*;
public class finding_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list  = new int[5];
        list[0]=0;
        list[1]=1;
        list[2]=2;
        list[3]=3;
        list[4]=4;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int c=0;
        for(int i=0;i< list.length;i++)
        {
            if(n==list[i])
                c++;
        }
        if(c==1)
            System.out.println(n+" is present in the list array.");
        else
            System.out.println(n+" is not present in the list array.");
    }
}
