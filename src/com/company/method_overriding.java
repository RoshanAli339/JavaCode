package com.company;

class ek{
    public int roshan(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class ek");
    }
}
class B extends ek{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        ek a = new ek();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
