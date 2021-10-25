package com.company;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a!=b&&b!=c&&a!=c)
            System.out.println(a+", "+b+" and "+c+" are three unique numbers.");
        else
            System.out.println(a+", "+b+" and "+c+" are not unique numbers.");
    }
}
