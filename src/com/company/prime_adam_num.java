package com.company;
import java.util.*;
public class prime_adam_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range of numbers :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("The Prime adam numbers between "+n1+" and "+n2+" are:");
        int i;
        for(i = n1; i<=n2; i++) {
            if(String.valueOf(i).length()>=2) {
                int c = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0)
                        c++;
                }
                if (adam_check(i) && c == 0)
                    System.out.print(i + " ");
            }
        }
    }
    static boolean adam_check(int n){
        reverse_nu ob = new reverse_nu();
        int rev = ob.rev(n);
        return ob.rev(n*n)==rev*rev;
    }
}
