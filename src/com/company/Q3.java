package com.company;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(a>99&&a<1000)
            System.out.println(a+" is a 3-digit number");
        else
            System.out.println(a+" is not a 3-digit number.");
    }
}
