package com.company;
import java.util.*;
public class marks_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] score = new int[10];
        double avg= 0.0;
        for (int i=0;i<10;i++)
        {
            System.out.print("Enter the marks of student "+(i+1)+": ");
            score[i]=sc.nextInt();
            avg = avg+score[i];
        }
        System.out.println("The average marks of all students in Physics is : "+(avg/10));
    }
}
