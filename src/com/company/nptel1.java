package com.company;
import java.util.Scanner;

public class nptel1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
//Use while loop check the number is Armstrong or not.
//store the output(1 or 0) in result variable.
        int temp = n;
        while (temp > 0)
        {
            result += (int)(Math.pow(temp%10, 3));
            temp /= 10;
        }

        if (result == n)
            System.out.print(result);
        else
            System.out.print("0");
    }
}
