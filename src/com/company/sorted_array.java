package com.company;
import java.util.*;
public class sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int l=sc.nextInt();
        int[] list = new int[l];
        for(int i=0;i<l;i++)
        {
            System.out.print("Enter the value"+(i+1)+": ");
            list[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for(int i=1;i<l;i++)
        {
            if(list[i]<list[i-1])
            {
                isSorted = false;
                break;
            }
            else
                continue;
        }
        if(isSorted)
            System.out.println("The given array is sorted.");
        else
            System.out.println("The given array is not sorted.");
    }
}
