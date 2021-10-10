package com.company;
import java.util.Scanner;
public class reverse_nu {

    int rev(int a) {
        int s = 0;
        for (int dup = a; dup > 0; dup /= 10) {
            s = s * 10 + (dup % 10);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int  a = sc.nextInt();
        reverse_nu ob= new reverse_nu();
        int r = ob.rev(a);
        System.out.println("Original: "+a+" reverse: "+r);
    }
}
