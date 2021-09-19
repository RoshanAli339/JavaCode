package com.company;
import java.util.*;
public class min_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list  = new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter value"+(i+1)+": ");
            list[i] = sc.nextInt();
        }
        int min=list[0];
        for (int i=1;i<10;i++)
        {
            if(list[i]<min)
                min=list[i];
        }
        System.out.println(min+" is the minimum number.");
    }
}
