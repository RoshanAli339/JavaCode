package com.company;

public class twodig_num {
    public static void main(String args[])
    {
        for(int i=10;i<=99;i++)
        {
            if(((i/10)*2)==(i%10))
                System.out.println(i+" ");
        }
    }
}
