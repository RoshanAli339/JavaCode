package com.company;
import java.util.*;
public class matrices {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] m1 = new int[2][3];
        int[][] m2 = new int[2][3];
        int[][] ans = new int[2][3];
        for(int i=0;i<m1.length;i++)
        {
            for (int j=0;j<m1[i].length;j++)
            {
                System.out.print("Enter the element "+(i+1)+","+(j+1)+" of matrix m1: ");
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n");
        for(int i=0;i<m2.length;i++)
        {
            for (int j=0;j<m2[i].length;j++)
            {
                System.out.print("Enter the element "+(i+1)+","+(j+1)+" of matrix m2: ");
                m2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m2.length;i++)
        {
            for (int j=0;j<m2[i].length;j++)
            {
                ans[i][j] = m1[i][j]+m2[i][j];
            }
        }
        System.out.println("\nThe final matrix after adding m1 and m2 is: ");
        for(int i=0;i<m2.length;i++)
        {
            for (int j=0;j<m2[i].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
