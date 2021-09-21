package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSample extends sampleInterface{
    void meth3();
    void meth4();
}
class mySampleClass implements childSample{
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
}
public class inheritance_in_interfaces {
    public static void main(String[] args) {
        mySampleClass ob = new mySampleClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
        ob.meth4();
    }
}
