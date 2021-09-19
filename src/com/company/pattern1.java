package com.company;

public class pattern1 {
    public static void main(String[] args) {
        for (int r=4;r>=1;r--)
        {
            for (int c=1;c<=4;c++) {
                if(c<=r)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int r=4;r>=1;r--)
        {
            for (int c=1;c<=4;c++) {
                if(c>=r)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
