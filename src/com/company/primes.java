package com.company;

public class primes {
    public static void main(String[] args) {
        primes ob = new primes();
        ob.printInLimits(3,25);
    }

    void printInLimits(int low, int high)
    {
        int c = 0;
        for (int i = low; i <= high; ++i)
        {
            c = 0;
            for (int j = 2; j < i; ++i)
            {
                if (i % j == 0)
                {
                    c++;
                    break;
                }
            }
            if (c == 0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
