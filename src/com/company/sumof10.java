package com.company;
import java.util.Scanner;
public class sumof10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n;
        int i =1;
        while(i<11){
            System.out.print("Enter value "+i+": ");
            n = sc.nextInt();
            sum+=n;
            i++;
        }
        System.out.println("The sum of 10 values is"+ sum);
    }
}
