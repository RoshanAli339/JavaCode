package com.company;

public class num_fact {
    int num_of_factors(int n) {
        int l = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                l++;
        }
        return l;
    }

    int[] facts(int n)
    {
        num_fact ob = new num_fact();
        int[] factors = new int[ob.num_of_factors(n)];
        int len=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                factors[len]=i;
                len++;
            }
        }
        return factors;
    }
}
