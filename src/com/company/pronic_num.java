package com.company;
import java.util.*;
public class pronic_num {

    public static void main(String[] args) {
        num_fact ob = new num_fact();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int l = ob.num_of_factors(n),len=0;
        int[] fact = new int[l];
        boolean pron=false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0) {
                fact[len] = i;
                len++;
            }
        }
        for(int i=1;i<=len;i++)
        {
            if((fact[i]-1)==fact[i-1])
            {
                pron=true;
                break;
            }
            else
                continue;
        }
        if(pron)
            System.out.println(n+" is a Pronic number");
        else
            System.out.println(n+" is not a Pronic number");
    }
}
