package com.company;
import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"= "+(n*i));
        }
    }
}
