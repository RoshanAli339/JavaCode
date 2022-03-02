package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleArrayList {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0;
        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> l = new ArrayList<Integer>();

        System.out.println("Give input: ");

        while (sc.hasNextInt())
        {
            l.add(sc.nextInt());
        }

        for (int i = 0; i < l.size(); ++i)
        {
            sum +=  l.get(i);
        }

        avg = sum / l.size();

        System.out.println("Average = " + avg);
    }
}
