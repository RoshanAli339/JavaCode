package com.company;
class One{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("I am Java in IntelliJ");
    }
}
class Two extends One{
    @Override
    public void name(){
        System.out.println("I am Java in class Two");
    }
    public void swagat(){
        System.out.println("Namasthe");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        One obj = new Two();
        obj.greet();
        obj.name();
    }
}
