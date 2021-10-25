package com.company;
import java.util.Scanner;
public class encoder
{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("\f");
        System.out.print("Enter a message: ");
        String mssg = sc.nextLine();
        for(int i=0;i<mssg.length();i++){
            if(Character.isLetter(mssg.charAt(i))||Character.isDigit(mssg.charAt(i)))
                System.out.print((int)(mssg.charAt(i))+" ");
            else
                System.out.print(" ");
        }
    }
}