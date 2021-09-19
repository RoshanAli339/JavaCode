package com.company;
import java.util.*;
public class guess_the_num_game {
    static Scanner sc = new Scanner(System.in);
    static int score=0;
    public static void main(String[] args) {
        System.out.println("Enter a number(1to100) :");
        int n =sc.nextInt();
        if (checkequal(n)) {
            System.out.println("Congrats you have entered the right number.");
            System.out.println("Your score is: "+score);
        }
    }
    static boolean checkequal(int a)
    {
        int ref = (int)((Math.random())*100);
        if(a==ref)
            return true;
        else if(a>ref)
        {
            System.out.println("The number you have entered is greater than the answer.");
            System.out.print("Enter another number: ");
            int n = sc.nextInt();
            score++;
            return checkequal(n);
        }
        else {
            System.out.println("The number you have entered is smaller than the answer.");
            System.out.print("Enter another number: ");
            int n = sc.nextInt();
            score++;
            return checkequal(n);
        }
    }
}
