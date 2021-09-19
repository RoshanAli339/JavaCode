package com.company;

public class reverse_nu {

    int rev(int a)
    {
        int s=0,f=0;
        for(int dup=a;dup>0;dup/=10)
        {
                s=s*10+(dup%10);

        }
        while(s>0)
        {
            f=f*10+(s%10);
            s/=10;
        }
        return f;
    }
}
