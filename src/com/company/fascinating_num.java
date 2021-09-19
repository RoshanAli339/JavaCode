package com.company;
import java.util.*;
public class fascinating_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int n1= n*2;
        int n2= n*3;
        String concatstr = n + "" + n1 + n2;
        boolean found = true;
        for(char c = '1'; c <= '9'; c++)
        {
            int count = 0;
            for(int i = 0; i < concatstr.length(); i++)
            {
                char ch = concatstr.charAt(i);
                if(ch == c)
                    count++;
            }
            if(count > 1 || count == 0)
            {
                found = false;
                break;
            }
        }
        if(found)
            System.out.println(n + " is a fascinating number.");
        else
            System.out.println(n + " is not a fascinating number.");
    }
}
