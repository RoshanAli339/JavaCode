package com.company;
import java.util.Scanner;
public class looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        while(a<=b){
            System.out.print(a+" ");
            a++;
        }
    }
}
