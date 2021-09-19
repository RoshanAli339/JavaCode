package com.company;
import java.util.*;
public class buzz_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if((n%10)==7||(n%7)==0)
            System.out.println(n+" is a Buzz number.");
        else
            System.out.println(n+" is not a BUzz number.");
    }
}
