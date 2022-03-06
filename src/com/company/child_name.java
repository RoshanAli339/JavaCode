package com.company;
import java.util.Scanner;

public class child_name {
    public static void main(String[] args) {
        String father, mother, child;
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter father name: ");
        father = ob.nextLine();

        System.out.print("Enter mother name: ");
        mother = ob.nextLine();

        int f = (int)(Math.random()*(father.length()));
        int m = (int)(Math.random()*(mother.length()));

        System.out.println("Father= " + f);
        System.out.println("Mother= " + m);

        child = father.substring(f) + mother.substring(m);

        System.out.println("Child name: " + child);
    }
}
