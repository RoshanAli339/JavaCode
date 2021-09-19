package com.company;

public class changing {
    static void change(int a)
    {
        a=98;
    }
    static void change2(int[] arr)
    {
        arr[0]=98;
    }
    public static void main(String[] args) {
        int a = 54;
        int [] list= {95,62,85,25};
        change(a);
        change2(list);
        System.out.println("The value of a after changing: "+a);
        System.out.println("The value of list[0] after changing is: "+list[0]);
    }
}
